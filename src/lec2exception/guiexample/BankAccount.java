package lec2exception.guiexample;

/**
 * This class represents a bank account.
 */
public class BankAccount {

	private double balance; 

	public BankAccount(double initialBalance) {  
		balance = initialBalance;
	}

	public BankAccount() {
		this(0);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {  
		balance = balance + amount;
	}

	/**
	 * This method decreases amount of balance.
	 * @param amount Amount of money to be withdrawn.
	 * @throws NotEnoughBalanceException
	 */
	public void withdraw(double amount) throws NotEnoughBalanceException {
		if (balance < amount) // checked exception
			throw new NotEnoughBalanceException("balance must be more than amount");

		if (amount <= 0)  // unchecked exception
			throw new IllegalArgumentException("amount must be positive");

		balance = balance - amount;
	}

}
