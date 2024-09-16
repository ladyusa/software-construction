package lec3interface.infohiding.common;

import java.util.List;

/**
 * interface Accountable helps hide sensitive information
 * in MedicalHistory objects
 *
 * (Using interface to hide information is just one way
 * to do it. There are other ways to hide information
 * such as using encapsulation with private access modifiers.)
 *
 */
public interface Accountable {
    Patient getPatient();
    Doctor getDoctor();
    List<Medicine> getMedicines();
    int numLabResults();
}
