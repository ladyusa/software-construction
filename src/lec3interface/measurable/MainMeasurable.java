package lec3interface.measurable;

public class MainMeasurable {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500);
        BankAccount account2 = new BankAccount(600);
        BankAccount account3 = new BankAccount(400);
        BankAccount[] accounts = { account1, account2, account3};

        double avgBalance = Data.average(accounts);
        System.out.println("Average balance = " + avgBalance);

        Country thailand = new Country("Thailand", 65.9, 513, 23);
        Country singapore = new Country("Singapore", 5.9, 0.7, 133);
        Country malaysia = new Country("Malaysia", 34.5, 330, 39);
        Country[] countries = { thailand, singapore, malaysia};

        double avgPop = Data.average(countries);
        System.out.println("Average pop = " + avgPop);

        // 500, 65.9
        Measurable[] measurables = { account1, thailand};
        double avgX = Data.average(measurables);
        System.out.println("Average x = " + avgX);
    }

}
