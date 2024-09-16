package lec3interface.infohiding.finance;

import lec3interface.infohiding.common.Accountable;
import lec3interface.infohiding.common.Medicine;

public class FinanceManager {

    /**
     * Information Hiding
     *
     * interface Accountable helps hide sensitive information
     * in MedicalHistory objects in the parameter
     *
     * Therefore, this class FinanceManager CANNOT access
     * sensitive patient information such as symptom and diagnosis.
     * It can only access information related to its duty, which is
     * handling finance
     *
     * (Using interface to hide information is just one way
     * to do it. There are other ways to hide information
     * such as using encapsulation with private access modifiers.)
     *
     * @param medicalHistory
     */
    public double calculatePayment(Accountable medicalHistory) {

        // code to calculate payment for this doctor visit
        //  - it CANNOT access sensitive patient information
        //    such as symptom and diagnosis.
        //    This is considered GOOD DESIGN.

//        medicalHistory.getSymptom();
//        medicalHistory.getDiagnosis();

        // ค่าหมอ + ค่ายา + ค่าแลป
        double totalExpense = 0;
        totalExpense += medicalHistory.getDoctor().getRate();

        for (Medicine medicine : medicalHistory.getMedicines()) {
            totalExpense += medicine.getPrice();
        }

        totalExpense += medicalHistory.numLabResults() * 500;
        return  totalExpense;
    }
}
