package lec4collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Example5SetBankAccount {

    public static void main(String[] args) {
        System.out.println("-------- ArrayList --------");
        ArrayList<BankAccount> list = new ArrayList<>();
        BankAccount b1 = new BankAccount(1000);
        BankAccount b2 = new BankAccount(250);
        BankAccount b3 = new BankAccount(880);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b1);

        for (BankAccount b : list)
            System.out.println(b);

        System.out.println("-------- HashSet --------");
        HashSet<BankAccount> hashSet = new HashSet<>();
        hashSet.add(b1);
        hashSet.add(b2);
        hashSet.add(b3);
        hashSet.add(b1);

        for (BankAccount b : hashSet)
            System.out.println(b);

        System.out.println("-------- TreeSet --------");
        TreeSet<BankAccount> treeSet = new TreeSet<>(new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                if (o1.getBalance() < o2.getBalance()) return -1;
                if (o1.getBalance() > o2.getBalance()) return 1;
                return 0;
            }
        });
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        treeSet.add(b1);

        for (BankAccount b : treeSet)
            System.out.println(b);
    }
}
