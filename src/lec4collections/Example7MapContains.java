package lec4collections;

import java.util.HashMap;

public class Example7MapContains {

    public static void main(String[] args) {

        HashMap<String, BankAccount> accountMap = new HashMap<>();
        BankAccount act1 = new BankAccount(100);
        BankAccount act2 = new BankAccount(200);

        accountMap.put("Kwan", act1);
        accountMap.put("Ploy", act2);

        System.out.println("map.containsKey(Kwan)? " + accountMap.containsKey("Kwan") );
        System.out.println("map.containsKey(Usa)? " + accountMap.containsKey("Usa") );
        System.out.println("map.containsValue(act1)? " + accountMap.containsValue(act1));
        System.out.println("map.containsValue(new BankAccount(400))? " + accountMap.containsValue(new BankAccount(400)));

        BankAccount b = accountMap.get("Kwan");
        System.out.println(b);
    }

}
