package com.lasteyestudios.fyp.tabs.allotment.searchallotment


import android.app.Activity
import android.content.ClipDescription
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputLayout
import com.google.android.play.core.review.ReviewManagerFactory
import com.lasteyestudios.fyp.R
import com.lasteyestudios.fyp.databinding.FragmentSearchAllotmentBinding
import com.lasteyestudios.fyp.data.models.Response.*
import com.lasteyestudios.fyp.utils.IPO_LOG_TAG


class SearchAllotmentFragment : Fragment() {
    private var _binding: FragmentSearchAllotmentBinding? = null
    private val binding get() = _binding!!
    private val args: SearchAllotmentFragmentArgs by navArgs()
    private lateinit var companyName: String
    private var keyWord: String? = null
    private lateinit var companyId: String

    private val searchAllotmentViewModel: SearchAllotmentViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentSearchAllotmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        companyId = args.companyId
        companyName = args.companyName

        binding.companyName.text = companyName

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val radio: RadioButton = binding.root.findViewById(checkedId)

            when {

                radio.text.toString() == "PAN Card Number" -> {
                    keyWord = "PAN"
                }
                radio.text.toString() == "Application Number" -> {
                    keyWord = "APPLNO"
                }
                radio.text.toString() == "DP Client ID" -> {
                    keyWord = "DPCLID"
                }
            }
        }
        binding.letsGoButton.setOnClickListener {
            letsGo(binding.editText.text.toString(), binding.editTextLayout)
        }

        searchAllotmentViewModel.searchAllotmentIPOs.observe(viewLifecycleOwner) { myResponse ->
            if (myResponse != null) {
                when (myResponse) {
                    Error -> {
                        retryLogic()
                    }
                    Loading -> {
//                    binding.retryAllotmentFab.visibility = View.INVISIBLE
                    }
                    is Success -> {
                        Log.d(IPO_LOG_TAG, "live data" + (myResponse.data == null))
                        if (myResponse.data == null) {
                            noRecordsFound()
                        } else {
                            myResponse.data.let {
                                binding.totalScreen.visibility = View.VISIBLE
                                binding.allotText.visibility = View.VISIBLE
                                binding.amtAdjText.visibility = View.VISIBLE
                                binding.appliedForText.visibility = View.VISIBLE
                                binding.cutoffPriceText.visibility = View.VISIBLE
                                binding.nameText.visibility = View.VISIBLE

                                binding.noRecordsFound.visibility = View.GONE

                                binding.allot.visibility = View.VISIBLE
                                binding.amtAdj.visibility = View.VISIBLE
                                binding.appliedFor.visibility = View.VISIBLE
                                binding.cutoffPrice.visibility = View.VISIBLE
                                binding.name.visibility = View.VISIBLE




                                binding.allot.text = it.ALLOT
                                binding.name.text = it.NAME1
                                binding.amtAdj.text = it.AMTADJ
                                binding.appliedFor.text = it.AMTADJ
                                binding.cutoffPrice.text = it.higher_priceband
                                if (it.ALLOT?.toInt() ?: 0 > 0) {

                                    binding.allotmentMeme.setAnimation("happy_duck.json")
                                    binding.allotmentMeme.playAnimation()
                                    googleReview()
                                } else {

                                    binding.allotmentMeme.setAnimation("worried.json")
                                    binding.allotmentMeme.playAnimation()

                                }
                            }
                        }
                    }
                }
            }
        }
        binding.totalScreen.setOnClickListener {
            Log.d(IPO_LOG_TAG, "totalScreen clicked")
            searchAllotmentViewModel.clearData()
            binding.totalScreen.visibility = View.GONE
        }

        binding.editPasteButton.setOnClickListener {
            val clipBoard = context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            var pasteData = ""
            when {
                !clipBoard.hasPrimaryClip() -> {}
                clipBoard.primaryClipDescription!!.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN) -> {
                    pasteData = clipBoard.primaryClip!!.getItemAt(0).text.toString()
                    binding.editText.text = Editable.Factory.getInstance().newEditable(pasteData)
                    letsGo(binding.editText.text.toString(), binding.editTextLayout)
                }
                else -> {}
            }
        }
        binding.editText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_GO) {
                letsGo(binding.editText.text.toString(), binding.editTextLayout)
            }
            true
        }
    }

    private fun hideKeyboard() {
        val imm: InputMethodManager =
            requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        var view = requireActivity().currentFocus
        if (view == null) {
            view = View(requireActivity())
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun letsGo(text: String?, input: TextInputLayout) {
        hideKeyboard()
        val id: Int = binding.radioGroup.checkedRadioButtonId
        if (id != -1) {
            val radio: RadioButton = binding.root.findViewById(id)
            when {
                radio.text.toString() == "PAN Card Number" -> {
                    keyWord = "PAN"
                }
                radio.text.toString() == "Application Number" -> {
                    keyWord = "APPLNO"
                }
                radio.text.toString() == "DP Client ID" -> {
                    keyWord = "DPCLID"
                }
            }
        }
        if (!text.isNullOrEmpty()) {
            if (keyWord != null) {
                searchAllotmentViewModel.loadAllotmentIPOData(companyId = companyId,
                    userDoc = text.toString(),
                    keyWord = keyWord!!)
            } else {
                input.error = "Select One of the Above Options"
            }
        } else {
            input.error = "Enter Valid Details"
        }
    }

    private fun retryLogic() {
        hideKeyboard()
        binding.retryAllotmentFab.apply {
            visibility = View.VISIBLE
            setOnClickListener {
                Log.d(IPO_LOG_TAG, "handleRetry clicked")
                searchAllotmentViewModel.loadAllotmentIPOData(companyId = companyId,
                    userDoc = text.toString(),
                    keyWord = keyWord!!)
            }
        }
    }


    private fun noRecordsFound() {

        binding.allotText.visibility = View.GONE
        binding.amtAdjText.visibility = View.GONE
        binding.appliedForText.visibility = View.GONE
        binding.cutoffPriceText.visibility = View.GONE
        binding.nameText.visibility = View.GONE


        binding.allot.visibility = View.GONE
        binding.amtAdj.visibility = View.GONE
        binding.appliedFor.visibility = View.GONE
        binding.cutoffPrice.visibility = View.GONE
        binding.name.visibility = View.GONE


        hideKeyboard()
        binding.totalScreen.visibility = View.VISIBLE

        binding.allotmentMeme.setAnimation("lonely_404.json")
        binding.allotmentMeme.playAnimation()
        binding.noRecordsFound.visibility = View.VISIBLE

    }

    private fun googleReview() {
        hideKeyboard()
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        val alreadyRated = sharedPref.getBoolean(getString(R.string.app_rated), false)
//        val alreadyRated = false

        if (alreadyRated) {
            return
        }
        binding.reviewFab.apply {
            visibility = View.VISIBLE
            setOnClickListener {
                Log.d(IPO_LOG_TAG, "googleReview clicked")
                val manager = ReviewManagerFactory.create(requireContext())
                val request = manager.requestReviewFlow()
                request.addOnCompleteListener { request ->
                    if (request.isSuccessful) {
                        // We got the ReviewInfo object
                        val reviewInfo = request.result
                        val flow = manager.launchReviewFlow(requireActivity(), reviewInfo)
                        flow.addOnCompleteListener { task ->
                            try {
                                if (task.isSuccessful) {
                                    Log.d(IPO_LOG_TAG, "In-app review returned.")
                                }
                                if (task.isComplete) {
                                    Log.d(IPO_LOG_TAG, "googleReview done")

                                    val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
                                        ?: return@addOnCompleteListener
                                    with(sharedPref.edit()) {
                                        putBoolean(getString(R.string.app_rated), true)
                                        apply()
                                    }
                                }
                                visibility = View.GONE
                            } catch (ex: Exception) {
                                Log.d(IPO_LOG_TAG, "Exception from openReview():")
                            }
                        }
                    }
                }

            }
        }

//        binding.reviewFab.visibility = View.GONE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        searchAllotmentViewModel.clearData()
        binding.totalScreen.visibility = View.GONE
        Log.d(IPO_LOG_TAG, "onDestroyView clicked")
        _binding = null
    }
}