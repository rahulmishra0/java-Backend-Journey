package CustomException;

public class BankAccountTest {
    public static void main(String[] args) throws InsuficiantBalanceException {
        BankAccount account = new BankAccount();

        account.withdraw(6000);
    }
}
