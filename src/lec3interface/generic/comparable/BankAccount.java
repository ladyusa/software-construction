package lec3interface.generic.comparable;

public class BankAccount implements Comparable<BankAccount> {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(BankAccount other) {
        // safe ไม่ต้อง down cast แล้ว
        // เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น BankAccount แน่นอน

        if (this.balance < other.balance) return -1;
        if (this.balance > other.balance) return 1;
        return 0; // this.balance == other.balance
    }
}
