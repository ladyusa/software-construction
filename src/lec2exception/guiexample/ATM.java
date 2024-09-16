package lec2exception.guiexample;

public class ATM {

    public void transfer(BankAccount giver, BankAccount receiver,
                         double amount)
            throws NotEnoughBalanceException {

        // -----------------------------------------------
        // this class is not GUI and does not know how to
        // tell a user if he/she withdraws more than he/she has
        // therefore, it throws exception to code that calls
        // method transfer
        // -----------------------------------------------
        giver.withdraw(amount);
        receiver.deposit(amount);
    }
}
