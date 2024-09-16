package lec3interface.infohiding;

import lec3interface.infohiding.common.Doctor;
import lec3interface.infohiding.common.Patient;
import lec3interface.infohiding.finance.FinanceManager;
import lec3interface.infohiding.finance.FinanceManagerNOhiding;
import lec3interface.infohiding.medicalvisit.MedicalHistory;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Patient patient = new Patient("John","02-1234567","Bangkok","P1");
        Doctor doctor = new Doctor("Kate", 750);
        MedicalHistory medicalHistory = new MedicalHistory(patient, doctor);

        // Finance manager may access sensitive health information
        FinanceManagerNOhiding bad = new FinanceManagerNOhiding();
        bad.calculatePayment(medicalHistory);

        // Safer. Finance manager can't get/set sensitive health information
        // แม้ว่าจะส่ง object ที่เป็น medicalHistory ที่มีข้อมูล sensitive
        // แต่ FinanceManager จะเข้าถึงไม่ได้ เนื่องจาก interface ซ่อนข้อมูลไว้ให้
        FinanceManager good = new FinanceManager();
        good.calculatePayment(medicalHistory);

    }
}
