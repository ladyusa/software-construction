package lec2exception;

public class MainBalanceExceptionExample {
    public static void main(String[] args) {
        BankAccount act = new BankAccount(1000);
        try {
            act.withdraw(1000000);
        } catch (NotEnoughBalanceException e) {
            System.err.println("Sorry. "+e.getMessage());
        }

    }
}
