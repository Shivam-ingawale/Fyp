package com.lasteyestudios.fyp.tabs.current.ipocategory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.lasteyestudios.fyp.databinding.FragmentIpoCategoryBinding
import com.lasteyestudios.fyp.tabs.current.CurrentFragmentDirections
import com.lasteyestudios.fyp.tabs.current.ItemRecyclerAdapter
import com.lasteyestudios.fyp.utils.CURRENT_FRAGMENT_CATEGORY


class IpoCategory : Fragment() {

    private var _binding: FragmentIpoCategoryBinding? = null
    private val binding get() = _binding!!

    private lateinit var itemRecyclerAdapter: ItemRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentIpoCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val value = listOf<String>(
            "Acetaminophen 80 mg / 1 ml (drops)",
            "Acetaminophen 160 mg / 5 ml (liquid)",
            "Acyclovir 200 mg / 5 ml",
            "Albendazole 200 mg / 5 ml",
            "Ambroxol 15 mg / 5 ml",
            "Ambroxol 30 mg / 5 ml",
            "Amoxicillin 125 mg / 5 ml",
            "Amoxicillin 250 mg / 5 ml",
            "Amoxicillin 125 mg + Clavulanate 31.25 mg / 5 ml",
            "Amoxicillin 250 mg +Clavulanate 62.5 mg /5 ml",
            "Amoxicillin 200 mg +Clavulanate 28.5 mg /5 ml ",
            "Amoxicillin 400 mg +Clavulanate 57 mg /5 ml ",
            "Amoxicillin 600 mg +Clavulanate 42.9 mg /5 ml ",
            "Ampicillin 125 mg / 5 ml ",
            "Ampicillin 250 mg /5 ml ",
            "Atovaquone 62.5 mg +Proguani l25 mg tablets",
            "Attapulgite 600 mg /15 ml ",
            "Azithromycin 100 mg /5 ml ",
            "Azithromycin 200 mg /5 ml ",
            "Bilastine 2.5 mg / ml ",
            "Bromhexine 4 mg /5 ml ",
            "Bromhexine 8 mg /5 ml ",
            "Carbocisteine 250 mg /5 ml ",
            "Cefaclor 125 mg /5 ml ",
            "Cefaclor 250 mg /5 ml ",
            "Cefaclor 375 mg /5 ml ",
            "Cefadroxil 125 mg /5 ml ",
            "Cefadroxil 250 mg /5 ml ",
            "Cefdinir 125 mg /5 ml ",
            "Cefdinir 250 mg /5 ml ",
            "Cefixime 100 mg /5 ml ",
            "Cefpodoxime 50 mg /5 ml ",
            "Cefpodoxime 100 mg /5 ml ",
            "Cefprozil 125 mg /5 ml ",
            "Cefprozil 250 mg /5 ml ",
            "Cefuroxime 125 mg /5 ml ",
            "Cefuroxime 250 mg /5 ml ",
            "Cephalexin 125 mg /5 ml ",
            "Cephalexin 250 mg /5 ml ",
            "Cephradine 125 mg /5 ml ",
            "Cephradine 250 mg /5 ml ",
            "Cetirizine 5 mg /5 ml ",
            "Chlorpheniramine 2 mg /5 ml ",
            "Clarithromycin 125 mg /5 ml ",
            "Clarithromycin 250 mg /5 ml ",
            "Clemastine 0.5 mg /5 ml ",
            "Clindamycin 75 mg /5 ml ",
            "Cloxacillin 125 mg /5 ml ",
            "Cloxacillin 250 mg /5 ml ",
            "Desloratadine 0.5 mg / ml ",
            "Dexamethasone 0.5 mg /5 ml ",
            "Dextromethorphan 15 mg /5 ml ",
            "Dicyclomine (Dicycloverine)10 mg / 5 ml ",
            "Dimenhydrinate 15 mg / 5 ml ",
            "Dimetindene 1 mg / ml (drops)",
            "Diphenhydramine 6.25 mg / 5 ml ",
            "Docusate Sodium10 mg / ml (drops)",
            "Domperidone 1 mg / ml ",
            "Doxycycline 25 mg /5 ml ",
            "Ebastine 5 mg /5 ml ",
            "Erythromycin 200 mg /5 ml ",
            "Erythromycin 400 mg /5 ml ",
            "Esomeprazole Granules 10 mg per sachet ",
            "Famotidine 40 mg / 5 ml ",
            "Ferrous Fumarate 300 mg / 5 ml ",
            "Ferrous Sulfate75 mg / ml (drops)",
            "Ferrous Sulfate150 mg /5 ml (liquid)",
            "Fexofenadine 30 mg / 5 ml ",
            "Flucloxacillin 125 mg /5 ml ",
            "Flucloxacillin 250 mg / 5 ml ",
            "Fluconazole 50 mg / 5 ml ",
            "Guaifenesin 100 mg / 5 ml ",
            "Hydromorphone 1 mg / ml ",
            "Hydroxyzine 10 mg / 5 ml ",
            "Hyoscine 1 mg / 1 ml ",
            "Ibuprofen 200 mg / 5 ml (drops)",
            "Ibuprofen 100 mg /5 ml (liquid)",
            "Itraconazole 10 mg / ml ",
            "Ketotifen 1 mg /5 ml ",
            "Lactulose 667 mg / ml ",
            "Lansoprazole 15 mg delayed - release tablets and capsules ",
            "Levocetirizine 2.5 mg /5 ml ",
            "Linezolid 100 mg /5 ml ",
            "Loperamide 1 mg /7.5 ml ",
            "Loratadine 5 mg /5 ml ",
            "Mebendazole 100 mg chewable tablets ",
            "Metoclopramide 1 mg / ml ",
            "Metronidazole 200 mg /5 ml ",
            "Montelukast 4 mg and5 mg chewable tablets or4 mg granules packet ",
            "Morphine 1 mg / ml (5 mg /5 ml)",
            "Morphine 2 mg / ml (10 mg /5 ml)",
            "Nitazoxanide 100 mg / 5 ml",
            "Nitrofurantoin 25 mg / 5 ml",
            "Nystatin 100 000 units / ml",
            "Omeprazole 2 mg / ml",
            "Ondansetron 4 mg / 5 ml",
            "Oseltamivir 6 mg / ml",
            "Oxybutynin 5 mg / 5 ml",
            "Paracetamol 80 mg / 1 ml (drops)",
            "Paracetamol 160 mg / 5 ml (liquid)",
            "Paracetamol(Please provide strength)",
            "Penicillin V 125 mg / 5 ml",
            "Penicillin V 250 mg / 5 ml",
            "Polyethylene Glycol 3350(PEG 3350)",
            "Prednisolone 5 mg / 5 ml",
            "Promethazine 5 mg / 5 ml",
            "Pseudoephedrine 15 mg / 5 ml",
            "Pyrantel pamoate 50 mg / ml ",
            "Ranitidine 15 mg / ml",
            "Rifampin 100 mg / 5 ml",
            "Rifampin 200 mg / 5 ml",
            "Rupatadine 1 mg / ml",
            "Salbutamol 2 mg / 5 ml",
            "Simethicone 40 mg / ml",
            "Sucralfate 1 g / 5 ml",
            "Sulfamethoxazole 40 mg+Trimethoprim 8 mg / ml",
            "Sultamicillin 250 mg / 5 ml",
            "Terbutaline 1.5 mg / 5 ml",
            "Trimethoprim 10 mg / ml",
            "Vancomycin 25 mg / ml",
            "Vancomycin 50 mg / ml"
        )



        itemRecyclerAdapter = ItemRecyclerAdapter(requireContext(), { searchId ->
//            findNavController().navigate(
//                CurrentFragmentDirections.actionRecyclerFragmentToCalculatorFragment(
////                    medicineName = searchId
//                )
//            )
        }, CURRENT_FRAGMENT_CATEGORY)

/*
//        sharedViewModel.currentIPOs.observe(viewLifecycleOwner) { myResponse ->
//            when (myResponse) {
//                Response.Error -> {
//                    handleRetry()
//                }
//                Response.Loading -> {
//
//                }
//                is Response.Success -> {
//                    binding.retryFab.visibility = View.INVISIBLE
////                    Log.d(IPO_LOG_TAG,
////                        "watchListViewModel.getAllGrowShortCompanyWishlist()" + watchListViewModel.getAllGrowShortCompanyWishlist)
//                    for (j in myResponse.data.indices) {
//                        if (myResponse.data?.get(j) != null) {
//                            for (k in myResponse.data?.get(j)?.indices!!) {
//                                if(watchListViewModel.getAllSymbolCompanyWishlist.isNotEmpty()) {
//
//                                    for (i in watchListViewModel.getAllSymbolCompanyWishlist.indices) {
//                                        if (myResponse.data?.get(j)
//                                                ?.get(k)?.symbol == watchListViewModel.getAllSymbolCompanyWishlist[i]
//                                        ) {
//                                            myResponse.data?.get(j)?.get(k)?.liked = true
//                                            break
//                                        } else {
//                                            myResponse.data?.get(j)?.get(k)?.liked = false
//                                        }
//                                    }
//                                }else{
//                                    myResponse.data?.get(j)?.get(k)?.liked = false
//                                }
//                            }
//                        }
//                    }
//                    itemRecyclerAdapter.submitList(myResponse.data[index])
//                }
//            }
//        }
*/
        itemRecyclerAdapter.submitList(value)

        binding.ipoCategoryRecycler.adapter = itemRecyclerAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}