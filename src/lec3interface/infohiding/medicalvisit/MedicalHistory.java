package lec3interface.infohiding.medicalvisit;

import lec3interface.infohiding.common.Accountable;
import lec3interface.infohiding.common.Doctor;
import lec3interface.infohiding.common.Medicine;
import lec3interface.infohiding.common.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains sensitive such as diagnosis and symptom
 *
 */
public class MedicalHistory implements Accountable {
    private Patient patient;
    private Doctor doctor;
    private String diagnosis;
    private String symptom;
    private List<Medicine> medicines;
    private List<LabResult> labResults;

    public MedicalHistory(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
        this.medicines = new ArrayList<>();
        this.labResults = new ArrayList<>();
    }

    @Override
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    @Override
    public int numLabResults() {
        return labResults.size();
    }

    public void setMedicineOrders(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public List<LabResult> getLabResults() {
        return labResults;
    }

    public void setLabResults(List<LabResult> labResults) {
        this.labResults = labResults;
    }

}
