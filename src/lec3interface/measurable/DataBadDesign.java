package lec3interface.measurable;

public class DataBadDesign {

    /**
     * if BankAccount, Country do not implement
     * Measurable interface, average code is duplicated
     *
     * ------- bad design and implementation practices
     *
     * @param objects
     * @return
     */
    public double average(BankAccount[] objects) {
        double total = 0;
        for (BankAccount obj : objects) {
            total += obj.getBalance();
        }
        if (objects.length > 0)
            return total/objects.length;
        return 0;
    }

    public double average(Country[] objects) {
        double total = 0;
        for (Country obj : objects) {
            total += obj.getArea();
        }
        if (objects.length > 0)
            return total/objects.length;
        return 0;
    }
}
