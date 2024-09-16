package lec3interface.comparable;

public class BankAccount implements Comparable {
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
    public int compareTo(Object o) {
        // not safe, since object may not be BankAccount

        // เปรียบเทียบ this object กับ other object ใน parameter
        BankAccount other = (BankAccount) o;
        if (this.balance < other.balance) return -1;
        if (this.balance > other.balance) return 1;
        return 0; // this.balance == other.balance
    }
}
