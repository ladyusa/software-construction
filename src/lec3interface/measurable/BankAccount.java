package lec3interface.measurable;

// BankAccount is measurable --- IS-A relationship
public class BankAccount implements Measurable {
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
    public double getMeasure() {
        return getBalance();
    }
}
