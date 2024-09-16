package lec3interface.polymorphism;

import lec3interface.measurable.BankAccount;
import lec3interface.measurable.Country;
import lec3interface.measurable.Data;
import lec3interface.measurable.Measurable;

public class MainTypeConversion {
    public static void main(String[] args) {

        // static type --- type ทางซ้ายมือของเครื่องหมาย = ในการประกาศตัวแปร ref
        //                 static type จะคงเดิม ไม่เปลี่ยนแปลงตลอดการทำงานของโปรแกรม
        // dynamic type --- type ของ object ที่ตัวแปร ref กำลังใช้งานอยู่
        //                  คือ type ที่อยู่ทางขวามือเครื่องหมาย =
        //                  dynamic type สามารถเปลี่ยนได้เรื่อยๆ ตลอดการทำงาน
        //                  โดยจะเปลี่ยนไปตาม object ที่ ref กำลังชี้ไปหรือใช้งานอยู่

        BankAccount account = new BankAccount(1000);

        // static type เป็น Measurable ส่วน dynamic type เป็น BankAccount
        Measurable meas = account;

        meas.getMeasure();   // ---> ใช้ getMeasure() เวอร์ชันของ BankAccount คืนค่าเป็น balance


        // static type เป็น Country ส่วน dynamic type ก็เป็น Country
        Country country = new Country("Singapore", 5.9, 0.7, 133);

        // static type เป็น Measurable ส่วน dynamic type เป็น Country
        // จะเห็นว่า static type ของ meas ไม่เปลี่ยนแปลงเลย
        // แต่ dynamic type ของ meas เปลี่ยนได้เรื่อย ๆ
        meas = country;

        meas.getMeasure();   // ---> ใช้ getMeasure() เวอร์ชันของ Country คืนค่าเป็น area


        Measurable meas2 = new Country("Thailand", 65.9, 513, 23);

        // ไม่สามารถ assign object ที่ไม่ได้ implement interface นั้น ๆ ได้
        // Measurable meas3 = new Human();

        meas = account;
        account.deposit(500);

        // compile error เราเรียกเมธอดตาม type ที่ประกาศไว้ซ้ายมือได้เท่านั้น
        // (ตาม static type เท่านั้น)
        // meas.deposit(500);  // compile error

        // ซ้ายมือของการประกาศตัวแปร ref จะต้องมี type เท่ากับหรือเป็น supertype
        // ของ object ทางขวามือเท่านั้น
        //   supertype ---> superclass หรือ interface
        BankAccount[] accounts1 = new BankAccount[3];
        Measurable[] accounts2 = new Measurable[3];
        Measurable[] accounts3 = new BankAccount[3];
        // BankAccount[] accounts4 = new Measurable[4];  // compile error

        // ไม่สามารถสร้าง/ instantiate object ด้วย new interface โดยตรงแบบ
        // ด้านล่างไม่ได้ เนื่องจาก interface ยังไม่มี method implementation
        // Measurable measurable = new Measurable();

        Country thailand = new Country("Thailand", 65.9, 513, 23);
        Country singapore = new Country("Singapore", 5.9, 0.7, 133);

        Measurable max = Data.larger(thailand, singapore);
        // String maxName = max.getName(); // compile error
        Country maxCountry = (Country) max;
        String maxName = maxCountry.getName();
        System.out.println(maxName);

        BankAccount account1 = new BankAccount(1000);
        Country country1 = new Country("Malaysia", 34.5, 330, 39);
        Measurable max1 = Data.larger(account1, country1);

        // ก่อนการ cast ควรมีการตรวจสอบ type ของ object ก่อนเสมอ
        // ว่าเป็น type ที่ต้องการหรือไม่ โดยการใช้่ instance
        if (max1 instanceof Country) {
            Country maxCountry1 = (Country) max1;
            System.out.println(maxCountry1.getName());
        }
        if (max1 instanceof BankAccount) {
            BankAccount maxAccount = (BankAccount) max1;
            maxAccount.deposit(500);
            System.out.println( maxAccount.getBalance() );
        }


    }
}
