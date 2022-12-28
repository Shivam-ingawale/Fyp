package com.lasteyestudios.fyp.tabs.current

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.lasteyestudios.fyp.R
import com.lasteyestudios.fyp.databinding.FragmentCalculatorBinding
import java.lang.Float.parseFloat


class CalculatorFragment : Fragment() {

    private var _binding: FragmentCalculatorBinding? = null
    private val binding get() = _binding!!
    private var medicineName: String? = null
    private val args: CalculatorFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentCalculatorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        medicineName = args.medicineName
        binding.medicineName.text = "Drug Name: $medicineName"
        val weightUnit = resources.getStringArray(R.array.WeightUnit)
        val spinner = binding.weightUnitEditText
        if (spinner != null) {
            val adapter = ArrayAdapter(
                requireContext(),
                android.R.layout.simple_spinner_dropdown_item, weightUnit
            )
            spinner.adapter = adapter
            spinner.setSelection(0)
        }

        binding.calButton.setOnClickListener {
            if (!binding.weightEditText.text.isNullOrEmpty()) {
                val sourceString = calculateDose(
                    binding.weightEditText.text.toString().toDouble(),
                    binding.weightUnitEditText.selectedItem.toString()
                )
                binding.resultText.text = Html.fromHtml(sourceString)
            }
        }

    }

    fun calculateDose(weightInput: Double, weightUnits: String): String? {
        var result: String? = null;
        // user inputs
//        var weight = Number(document.getElementById("weight").value);
//        var weightunits = document.getElementById("weightunits").value;

        // convert all units to metric
        val weight = if (weightUnits == "Lb") weightInput / 2.20462 else weightInput

        if (weight < 3) {
            result = "Patient's weight is too low or invalid!";
        } else if (weight >= 80) {
            result =
                "Pediatric ≥ 1 month:<br><b>&emsp;10 ml (800 mg)</b> po every 4 to 6 hours to a maximum of 5 doses per day prn <br><br>Max daily dose: <br><b>&emsp;50 ml/day (4000 mg/day)</b><br><br>\n\n\bUsual adult dose:\b<br><b>&emsp;325 to 650 mg/dose</b> po every 4 to 6 hours prn (max 4 g/24 hrs)\n<br><br>\nCalculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding."
        } else {

            // perform calculation
            var minDose = weight * 10;
            if (minDose >= 800) minDose = 800.0;
            var minVolume = minDose * 0.0125;
            var maxDose = weight * 15;
            if (maxDose >= 800) maxDose = 800.0;
            var maxVolume = maxDose * 0.0125;
            var maxDaily = weight * 75;
            if (maxDaily >= 4000) maxDaily = 4000.0;
            var maxVolumeDaily = maxDaily * 0.0125;
            if (maxVolumeDaily >= 50) maxVolumeDaily = 50.0;

            // display result of calculation
            var outputMinDose = minDose.toString();
            var outputMaxDose = maxDose.toString();
            var outputMinVolume = parseFloat(minVolume.toString());
            var outputMaxVolume = parseFloat(maxVolume.toString());
            var outputMaxDaily = maxDaily
            var outputMaxVolumeDaily = parseFloat(maxVolumeDaily.toString());
            result =
                "Pediatric ≥ 1 month:<br><b>&emsp;$outputMinVolume ml ($outputMinDose mg) to $outputMaxVolume ml ($outputMaxDose mg)</b> po every 4 to 6 hours to a maximum of 5 doses per day prn <br><br>\bMax daily dose: <b><br>&emsp;$outputMaxVolumeDaily ml/day ($outputMaxDaily mg/day)</b><br><br>Usual adult dose:<br>&emsp;<b>325 to 650 mg/dose</b> po every 4 to 6 hours prn (Max 4 g/24 hrs)<br><br>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.";
        }
        return result
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}