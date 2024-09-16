package lec3interface.comparable;

import java.util.Arrays;

public class MainComparable {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500);
        BankAccount account2 = new BankAccount(300);
        BankAccount account3 = new BankAccount(400);
        BankAccount[] accounts = {account1, account2, account3};

        // account1 < account2
        if (account1.compareTo(account2) < 0)
            System.out.println("acc1 < acc2");

        // account1 >= account2
        if (account1.compareTo(account2) >= 0)
            System.out.println("acc1 >= acc2");

        // account1 == account2
        if (account1.compareTo(account2) == 0)
            System.out.println("acc1 == acc2");

        // เมธอด sort() นั้นคล้ายกับเมธอด average() ใน Data
        // โดยเมธอด sort() method นั้นมีการ reuse ผ่าน Comparable interface
        // กล่าวคือ คลาสใด ๆ ที่ implements Comparable interface
        // จะสามารถถูกเรียงลำดับได้ โดยใช้เมธอด sort() เดียวกันนี้ได้
        // (เมธอด sort() จะเรียก compareTo() คล้ายกับที่
        //  เมธอด average() เรียก getMeasure())

        Arrays.sort(accounts);

        System.out.println("\n---- after sort account's balance ------");
        for (BankAccount account : accounts)
            System.out.print(account.getBalance() + " ");

        Country thailand = new Country("Thailand", 65.9, 513, 23);
        Country singapore = new Country("Singapore", 5.9, 0.7, 133);
        Country malaysia = new Country("Malaysia", 34.5, 330, 39);
        Country[] countries = { thailand, singapore, malaysia};

        Arrays.sort(countries);

        System.out.println("\n---- after sort country's population ------");
        for (Country country : countries)
            System.out.print(country.getPopulation() + " ");
    }
}
