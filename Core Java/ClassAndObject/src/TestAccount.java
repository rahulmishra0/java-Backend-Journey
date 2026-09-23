public class TestAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolder = "Rahul";
        account.balance = 10000000000.0;
        account.displayBalance();
    }
}
