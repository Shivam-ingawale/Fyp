package com.lasteyestudios.fyp.tabs.allotment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.lasteyestudios.fyp.data.models.Response
import com.lasteyestudios.fyp.databinding.FragmentAllotmentBinding
import com.lasteyestudios.fyp.utils.IPO_LOG_TAG

class AllotmentFragment : Fragment() {

    private var _binding: FragmentAllotmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var mAdapter: AllotmentAdapter
    private val allotmentViewModel: AllotmentViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        allotmentViewModel.loadAllotmentIPOData()
        _binding = FragmentAllotmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mAdapter= AllotmentAdapter {id,name->

            findNavController().navigate(AllotmentFragmentDirections.actionListedFragmentToSearchAllotmentFragment(
                companyId = id,
                companyName = name))

        }
//        binding.textView.setOnClickListener {
//
//            findNavController().navigate(R.id.action_ListedFragment_to_watchListFragment2)
//        }
        allotmentViewModel.allotmentIPOs.observe(viewLifecycleOwner) { myResponse ->
            when (myResponse) {
                Response.Error -> {
                    handleRetry()
                    binding.allotmentAnimationView.visibility = View.VISIBLE
                    binding.allotmentEmptyText.visibility = View.VISIBLE
                }
                Response.Loading -> {
                    binding.retryAllotmentFab.visibility = View.INVISIBLE
                }
                is Response.Success -> {
                    if(myResponse.data.isNullOrEmpty()){
                        binding.allotmentAnimationView.visibility = View.VISIBLE
                        binding.allotmentEmptyText.visibility = View.VISIBLE
                    }else{
                        binding.allotmentAnimationView.visibility = View.GONE
                        binding.allotmentEmptyText.visibility = View.GONE
                        mAdapter.submitList(myResponse.data)
                    }
                }
            }
        }
        binding.allotmentRecyclerView.adapter = mAdapter
    }

    private fun handleRetry() {
        binding.retryAllotmentFab.apply {
            visibility = View.VISIBLE
            setOnClickListener {
                Log.d(IPO_LOG_TAG, "handleRetry clicked")
                allotmentViewModel.loadAllotmentIPOData()
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding.allotmentRecyclerView.adapter = null
        _binding = null
    }
}