package lec3interface.generic.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class MainComparatorGeneric {

    // inner / nested class
    // นิยามคลาสภายในคลาส ใช้ได้ในทุกเมธอดในคลาสนี้
    static class BalanceComparator implements Comparator<BankAccount> {
        @Override
        public int compare(BankAccount b1, BankAccount b2) {
            if (b1.getBalance() < b2.getBalance()) return -1;
            if (b1.getBalance() > b2.getBalance()) return 1;
            return 0;
        }
    }

    public static void main(String[] args) {

        // nested class ภายในเมธอด ใช้ได้แค่ในเมธอด main() นี้เท่านั้น
        class AreaComparator implements Comparator<Country> {
            @Override
            public int compare(Country c1, Country c2) {
                if (c1.getArea() < c2.getArea()) return  -1;
                if (c1.getArea() > c2.getArea()) return  1;
                return 0;
            }
        }

        Country thailand = new Country("Thailand", 65.9, 513, 23);
        Country singapore = new Country("Singapore", 5.9, 0.7, 133);
        Country malaysia = new Country("Malaysia", 34.5, 330, 39);
        Country[] countries = { thailand, singapore, malaysia};


        // Comparator interface is similar to Measurer interface
        // allows objects to be sorted with more flexibility


        System.out.println("---- sort by population ----");
        Arrays.sort(countries, new PopulationComparator());
        for (Country country : countries)
            System.out.println(country);

        System.out.println("---- sort by area ----");
        Arrays.sort(countries, new AreaComparator());
        for (Country country : countries)
            System.out.println(country);

        System.out.println("---- sort by name ----");
        Arrays.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country c1, Country c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });
        for (Country country : countries)
            System.out.println(country);

        System.out.println("---- sort by density ----");
        Arrays.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country c1, Country c2) {
                if (c1.getPopulation()/c1.getArea() < c1.getPopulation()/c1.getArea())
                    return -1;
                if (c1.getPopulation()/c1.getArea() > c1.getPopulation()/c1.getArea())
                    return 1;
                return 0;
            }
        });
        for (Country country : countries)
            System.out.println(country);

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(500);
        accounts[1] = new BankAccount(800);
        accounts[2] = new BankAccount(300);

        System.out.println("----- sort by balance ----");
        Arrays.sort(accounts, new BalanceComparator());
        for (BankAccount account : accounts)
            System.out.println(account.getBalance());

        System.out.println("----- reverse sort by balance ----");
        Arrays.sort(accounts, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount b1, BankAccount b2) {
                // สลับการคืนค่า 1 และค่า -1
                if (b1.getBalance() < b2.getBalance()) return 1;
                if (b1.getBalance() > b2.getBalance()) return -1;
                return 0;
            }
        });
        for (BankAccount account : accounts)
            System.out.println(account.getBalance());
    }

}
