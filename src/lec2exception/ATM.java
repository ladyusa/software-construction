package lec2exception;

public class ATM {

    public void transfer(BankAccount giver, BankAccount receiver,
                         double amount) throws NotEnoughBalanceException {
        giver.withdraw(amount);
        receiver.deposit(amount);
    }
}
