package PrivateDemo;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(3000);
        System.out.println(account.getBalance());

        //balance private h so no accessible here
        //account.balance;
    }
}
