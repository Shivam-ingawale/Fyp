package com.lasteyestudios.fyp.tabs.current

import java.lang.Float
import java.lang.Float.parseFloat

class sd {

    var sdc = listOf<String>(
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


    fun calculateDose(medName: String, weightInput: Double?, weightUnits: String?): String? {
        var result: String? = null;

        var sdc = listOf<String>(
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

        // user inputs
//        var weight = Number(document.getElementById("weight").value);
//        var weightunits = document.getElementById("weightunits").value;

        // convert all units to metric
        val weight = if (weightUnits == "lb") weightInput?.div(2.20462) else weightInput

        if (weight != null && weight < 3) {
            result = "Patient's weight is too low or invalid!";
        } else if (weight != null && weight >= 80) {
            result =
                "Pediatric ≥ 1 month: 10 ml (800 mg) po every 4 to 6 hours to a maximum of 5 doses per day prn \nMax daily dose: 50 ml/day (4000 mg/day)\n\n\bUsual adult dose:\b\n 325 to 650 mg/dose po every 4 to 6 hours prn (max 4 g/24 hrs)\n\nCalculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding."
        } else {
            if (medName == sdc[0] && weight != null) {
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
                var outputMinVolume = Float.parseFloat(minVolume.toString());
                var outputMaxVolume = Float.parseFloat(maxVolume.toString());
                var outputMaxDaily = maxDaily
                var outputMaxVolumeDaily = Float.parseFloat(maxVolumeDaily.toString());
                result =
                    "\bPediatric ≥ 1 month:\b\n$outputMinVolume ml ($outputMinDose mg) to $outputMaxVolume ml ($outputMaxDose mg) po every 4 to 6 hours to a maximum of 5 doses per day prn \bMax daily dose: $outputMaxVolumeDaily ml/day ($outputMaxDaily mg/day)\n\n\bUsual adult dose:\n\b 325 to 650 mg/dose po every 4 to 6 hours prn (Max 4 g/24 hrs)\n\nCalculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.";
            } else if (medName == sdc[1] && weight != null) {

                var minDose = weight * 10;
                if (minDose >= 800) minDose = 800.0;
                var minVolume = minDose * 0.0125;
                var maxDose = weight * 15;
                if (maxDose >= 800) maxDose = 800.0;
                var maxVolume = maxDose * 0.03125;
                var maxDaily = weight * 75;
                if (maxDaily >= 4000) maxDaily = 4000.0;
                var maxVolumeDaily = maxDaily * 0.03125;
                if (maxVolumeDaily >= 125) maxVolumeDaily = 125.0;


                // display result of calculation
                var outputMinDose = minDose.toString();
                var outputMaxDose = maxDose.toString();
                var outputMinVolume = Float.parseFloat(minVolume.toString());
                var outputMaxVolume = Float.parseFloat(maxVolume.toString());
                var outputMaxDaily = maxDaily
                var outputMaxVolumeDaily = Float.parseFloat(maxVolumeDaily.toString());
                result =
                    "<strong>Pediatric ≥ 1 month:</strong><br>" + outputMinVolume + " ml (" + outputMinDose + " mg) to " + outputMaxVolume + " ml (" + outputMaxDose + " mg) po every 4 to 6 hours to a maximum of 5 doses per day prn<BR>Max daily dose: " + outputMaxVolumeDaily + " ml/day (" + outputMaxDaily + " mg/day)<br><br><strong>Usual adult dose:</strong><br> 325 to 650 mg/dose po every 4 to 6 hours prn (Max 4 g/24 hrs)<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.</small>";

            } else if (medName == sdc[2] && weight != null) {
                var dose = weight * 20;

                // dose max
                if (dose >= 800) dose = 800.0;

                // dose to volume
                var volume = dose * 0.025;

                // display result of calculation
                var outputDose = dose.toString();
                var outputVolume = parseFloat(volume.toString());
                result =
                    "<strong>Varicella (chickenpox) Treatment in Immunocompetent ≥ 2 years:</strong><br>" + outputVolume + " ml ( " + outputDose + " mg ) PO QID x 5 days (Maximum: 800 mg/dose)<br>Therapy should be initiated within 24 hours of the appearance of rash.<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.</small>";

            } else if (medName == sdc[3]) {
                var disclaimer =
                    "Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment.";
                var pediatric1 = "5 ml (200 mg) as a single dose";
                var adult = "10 ml (400 mg) as a single dose";

                var pediatric = "10 ml (400 mg) once daily for 3 days";
                result =
                    "Ascariasis, Ankylostomiasis, Enterobiasis: <strong>Children ≤2 years: </strong><br>" + pediatric1 + "<br><br><strong>Children >2 years and Adults: </strong><br>" + adult + "<br><br><small>" + disclaimer + "</small>\"\n\n\nTrichuriasis: <strong>Children >2 years and Adults: </strong><br>" + pediatric + "<br><br><small>" + disclaimer + "</small>";

            } else if (medName == sdc[4]) {
                var dose1 = "Children under 2 years: 2.5 ml (7.5 mg) po BID on medical advise only";
                var dose2 = "Children 2-5 years: 2.5 ml (7.5 mg) po TID";
                var dose3 = "Children 6-12 years: 5 ml (15 mg) po BID to TID";
                var dose4 =
                    "Children over 12 years and adults: 10 ml (30 mg) po TID for the first 2-3 days then BID thereafter";

                result =
                    "<strong>Dosage: </strong><br>$dose1\n$dose2\n$dose3\n$dose4\n<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment.</small>";
            } else if (medName == sdc[5]) {
                var dose1 = "Children under 2 years: 1.25 ml (7.5 mg) po BID on medical advise only"
                var dose2 = "Children 2-5 years: 1.25 ml (7.5 mg) po TID";
                var dose3 = "Children 6-12 years: 2.5 ml (15 mg) po BID to TID";
                var dose4 =
                    "Children over 12 years and adults: 5 ml (30 mg) po TID for the first 2-3 days then BID thereafter";
                result =
                    "<strong>Dosage: </strong><br>$dose1\n$dose2\n$dose3\n$dose4\n<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment.</small>";
            } else if (medName == sdc[6] && weight != null) {
                var doseMin = weight * 8.3333;
                var doseMax = weight * 16.6667;
                var frequency = "TID";

                // dose max
                if (doseMin >= 1333 && frequency == "TID") doseMin = 1333.0;

                // dose to volume
                var volumeMin = doseMin * 0.04;
                var volumeMax = doseMax * 0.04;

                // display result of calculation
                var outputMin = doseMin.toString();
                var outputMax = doseMax.toString();
                var volumeOutputMin = parseFloat(volumeMin.toString());
                var volumeOutputMax = parseFloat(volumeMax.toString());
                result =
                    " Mild to moderate infection: 25 to 50 mg/kg/day TID <strong>Pediatric > 1 month:</strong><br> Min Dose: " + volumeOutputMin + " ml (" + outputMin + " mg) PO " + frequency + "<br> Max Dose: " + volumeOutputMax + " ml (" + outputMax + " mg) PO " + frequency + "<br><br><strong>Adults:</strong><br> Usual dose is 250 to 1000 mg PO TID<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.</small>";
            } else if (medName == sdc[7] && weight != null) {
                var doseMin = weight * 8.3333;
                var doseMax = weight * 16.6667;
                var frequency = "TID";

                // dose max
                if (doseMin >= 1333 && frequency == "TID") doseMin = 1333.0;

                // dose to volume
                var volumeMin = doseMin * 0.02;
                var volumeMax = doseMax * 0.02;

                // display result of calculation
                var outputMin = doseMin.toString();
                var outputMax = doseMax.toString();
                var volumeOutputMin = parseFloat(volumeMin.toString());
                var volumeOutputMax = parseFloat(volumeMax.toString());
                result =
                    " Mild to moderate infection: 25 to 50 mg/kg/day TID <strong>Pediatric > 1 month:</strong><br> Min Dose: " + volumeOutputMin + " ml (" + outputMin + " mg) PO " + frequency + "<br> Max Dose: " + volumeOutputMax + " ml (" + outputMax + " mg) PO " + frequency + "<br><br><strong>Adults:</strong><br> Usual dose is 250 to 1000 mg PO TID<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.</small>";
            } else if (medName == sdc[8] && weight != null) {
                var dose = weight * 6.6667;
                // dose max
                if (dose >= 500) dose = 500.0;

                // dose to volume
                var volume = dose * 0.04;

                // display result of calculation
                var outputDose = dose.toString();
                var outputVolume = parseFloat(volume.toString());
                result =
                    "20 mg/kg/day TID: <strong>Pediatric ≥ 3 months:</strong><br>" + outputVolume + " ml ( " + outputDose + " mg ) po every 8 hours<br><br><strong>Adult Dose:</strong><br>1 tablet (Amoxicillin/Clavulanate 500mg/125 mg) every 8 hours<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.</small>";

            } else if (medName == sdc[9] && weight != null) {
                var dose = weight * 6.6667;
                // dose max
                if (dose >= 500) dose = 500.0;

                // dose to volume
                var volume = dose * 0.02;

                // display result of calculation
                var outputDose = dose.toString();
                var outputVolume = parseFloat(volume.toString());
                result =
                    "20 mg/kg/day TID: <strong>Pediatric ≥ 3 months:</strong><br>" + outputVolume + " ml ( " + outputDose + " mg ) po every 8 hours<br><br><strong>Adult Dose:</strong><br>1 tablet (Amoxicillin/Clavulanate 500mg/125 mg) every 8 hours<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.</small>";

            } else if (medName == sdc[10] && weight != null) {
                var dose = weight * 12.5;
                // dose max
                if (dose >= 875) dose = 875.0;

                // dose to volume
                var volume = dose * 0.025;

                // display result of calculation
                var outputDose = dose.toString();
                var outputVolume = parseFloat(volume.toString());
                result =
                    "25 mg/kg/day BID: <strong>Pediatric ≥ 3 months:</strong><br>" + outputVolume + " ml ( " + outputDose + " mg ) po every 12 hours<br><br><strong>Adult Dose:</strong><br>1 tablet (Amoxicillin/Clavulanate 875mg/125 mg) every 12 hours<br><br><small>Calculations must be re-checked and should not be used alone to guide patient care, nor should they substitute for clinical judgment. The shown results can be different from the calculated results because of rounding.</small>";
            } else if (medName == sdc[10] && weight != null) {


            }

        }
        return result

    }
}