package lec4collections;

import java.util.ArrayList;
import java.util.List;

public class Example1ListContains {

    public static void main(String[] args) {
        // -------- ไม่ได้ override เมธอด equals() ---------
        ArrayList<Student> stdList = new ArrayList<>();
        Student s1 = new Student("Kwan", 10);
        Student s2 = new Student("Ploy", 7);

        stdList.add(s1);
        stdList.add(s2);

        System.out.println("------ ไม่ได้ override เมธอด equals() ------");
        System.out.println("list.contains(s1)? " + stdList.contains(s1) );
        System.out.println("list.contains(new Student(Kwan, 10))? " + stdList.contains(new Student("Kwan", 10)));

        Student s11 = new Student("Kwan", 10);

        System.out.println("s1 == s1 ? " + (s1 == s1) );
        System.out.println("s1 == s11 ? " + (s1 == s11) );
        System.out.println("s1.equals(s1) ? " +  s1.equals(s1) );
        System.out.println("s1.equals(s11) ? " +  s1.equals(s11) );


        // --------  override เมธอด equals() และ hashCode() ---------

        List<BankAccount> list = new ArrayList<>();
        BankAccount b1 = new BankAccount(100);
        BankAccount b2 = new BankAccount(200);

        list.add(b1);
        list.add(b2);

        System.out.println("\n------ override เมธอด equals() ------");
        System.out.println("list.contains(b1)? " + list.contains(b1) );
        System.out.println("list.contains(new BankAccount(100))? " + list.contains(new BankAccount(100)) );

        BankAccount b11 = new BankAccount(100);

        System.out.println("b1 == b1 ? " + (b1 == b1) );
        System.out.println("b1 == b11 ? " + (b1 == b11) );
        System.out.println("b1.equals(b1) ? " +  b1.equals(b1) );
        System.out.println("b1.equals(b11) ? " +  b1.equals(b11) );

    }
}
