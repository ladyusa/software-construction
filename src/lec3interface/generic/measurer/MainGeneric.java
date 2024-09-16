package lec3interface.generic.measurer;

public class MainGeneric {

    public static void main(String[] args) {
        Country thailand = new Country("Thailand", 65.9, 513, 23);
        Country singapore = new Country("Singapore", 5.9, 0.7, 133);
        Country malaysia = new Country("Malaysia", 34.5, 330, 39);
        Country[] countries = { thailand, singapore, malaysia};

        PopulationMeasurer popMeasurer = new PopulationMeasurer();
        double avgPop = Data.average(countries, popMeasurer);
        System.out.println("Average pop = " + avgPop);

        double avgArea = Data.average(countries, new CountryAreaMeasurer());
        System.out.println("Average area = " + avgArea);

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(100);
        accounts[1] = new BankAccount(200);
        accounts[2] = new BankAccount(300);

        double avgBalance = Data.average(accounts, new BalanceMeasurer());
        System.out.println("Average balance = " + avgBalance);

        // ถ้าพยายามใช้ array ของ Country กับ BalanceMeasurer ที่รับแต่ BankAccount
        // จะเกิด compile error เลย สามารถตรวจจับข้อผิดพลาดได้ทันทีตั้งแต่ช่วง compile
        // ซึ่งทำให้โปรแกรมปลอดภัยมากขึ้น
        // double average = Data.average(countries, new BalanceMeasurer());

    }
}
