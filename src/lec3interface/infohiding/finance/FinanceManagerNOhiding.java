package lec3interface.infohiding.finance;

import lec3interface.infohiding.medicalvisit.MedicalHistory;

public class FinanceManagerNOhiding {

    /**
     * No Information Hiding. This class FinanceManager can access
     * sensitive patient information such as symptom and diagnosis.
     *
     * @param medicalHistory
     */
    public double calculatePayment(MedicalHistory medicalHistory) {

        // code to calculate payment for this doctor visit
        //  - it CAN access sensitive patient information
        //    such as symptom and diagnosis.
        //    This is considered BAD DESIGN.

        medicalHistory.setDiagnosis("ANYTHING"); // BAD DESIGN HERE
        medicalHistory.getSymptom();

        return 0;
    }

}
