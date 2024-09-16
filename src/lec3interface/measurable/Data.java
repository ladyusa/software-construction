package lec3interface.measurable;

public class Data {

    /**
     * Interface helps code reuse. We can calculate average for
     * BankAccount, Country, Student objects using only one average method
     *
     * No code duplication -- conform with DRY design principle
     *
     * DRY --- Don't Repeat Yourself
     *
     * @param objects
     * @return average value of specified objects
     */
    public static double average(Measurable[] objects) {
        double total = 0;
        for (Measurable obj : objects) {
            total += obj.getMeasure(); // polymorphism
        }
        if (objects.length > 0)
            return total/objects.length;
        return 0;

        // polymorphism
        // ถ้าส่ง parameter เป็น array ของ BankAccount
        //    obj.getMeasure() จะเลือกใช้เมทอด getMeasure() ของ BankAccount
        // ถ้าส่ง parameter เป็น array ของ Country
        //    obj.getMeasure() จะเลือกใช้เมทอด getMeasure() ของ Country
    }

    public static Measurable larger(Measurable obj1, Measurable obj2) {
        if (obj1.getMeasure() > obj2.getMeasure())
            return obj1;
        return obj2;
    }
}
