package lec2exception;

public class MainTryCatchExample {

    public static void main(String[] args)  {

        BankAccount account = new BankAccount(1000);

        System.out.println(account);

        account.deposit(500);
        System.out.println(account);

        try {
            System.out.println(1);
            account.withdraw(100000);
            System.out.println(2);
        } catch (NotEnoughBalanceException e) {
            System.out.println(3);
            System.err.println();
        }
        System.out.println(4);

    }
}
