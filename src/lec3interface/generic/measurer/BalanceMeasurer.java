package lec3interface.generic.measurer;

public class BalanceMeasurer implements Measurer<BankAccount> {
    @Override
    public double measure(BankAccount account) {

        // safe ไม่ต้อง down cast แล้ว
        // เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น BankAccount แน่นอน

        return account.getBalance();
    }
}
