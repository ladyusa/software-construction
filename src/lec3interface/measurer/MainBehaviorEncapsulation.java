package lec3interface.measurer;

public class MainBehaviorEncapsulation {

    // inner class / nested class
    // นิยามคลาสภายในคลาส สำหรับคลาสเล็ก ๆ ใช้ได้ในทุกเมธอดในคลาสนี้
    static class GdpMeasurer implements Measurer {

        @Override
        public double measure(Object obj) {
            Country country = (Country) obj;
            return country.getGdp();
        }
    }

    public static void main(String[] args) {
        // trivial class ภายในเมธอด สำหรับคลาสเล็ก ๆ ใช้ได้แค่ในเมธอด main() นี้เท่านั้น
        class CountryPopulationMeasurer implements Measurer {
            @Override
            public double measure(Object obj) {
                // not safe, since object may not be Country
                Country country = (Country) obj;
                return country.getPopulation();
            }
        }

        Country thailand = new Country("Thailand", 65.9, 513, 23);
        Country singapore = new Country("Singapore", 5.9, 0.7, 133);
        Country malaysia = new Country("Malaysia", 34.5, 330, 39);
        Country[] countries = { thailand, singapore, malaysia};

        double avgPop = Data.average(countries, new CountryPopulationMeasurer());
        double avgArea = Data.average(countries, new CountryAreaMeasurer());
        double avgGdp = Data.average(countries, new GdpMeasurer());

        System.out.println("Average pop = " + avgPop);
        System.out.println("Average area = " + avgArea);
        System.out.println("Average Gdp = " + avgGdp);

        BankAccount account1  = new BankAccount(500);
        BankAccount account2  = new BankAccount(300);
        BankAccount account3  = new BankAccount(400);
        BankAccount[] accounts = { account1,account2,account3 };

        // -------------------------------------->  anonymous class
        double avgBalance = Data.average(accounts, new Measurer() {
            // anonymous class (คลาสที่ไม่มีชื่อ)
            // นิยามเมธอดของ interface และนำมาใช้เลย
            // ใช้ได้แค่ในเมธอด sort() ในบรรทัดที่ 46 นี้เท่านั้น
            public double measure(Object obj) {
                BankAccount account = (BankAccount) obj;
                return account.getBalance();
            }
        });

        System.out.println("Average balance = " + avgBalance);

        // ใช้ BankAccount objects แต่ measurer เป็นของ Country
        // ทำให้เกิด Runtime Exception เพราะมีการ cast แบบไม่ safe
        // สามารถแก้ได้โดยใช้ generic เข้าช่วย
        double runtimeErrorExample = Data.average(accounts, new CountryAreaMeasurer());

    }
}
