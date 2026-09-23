package Method;

public class ATM {
    double balance;

    void withdraw(double amount){
        //validation
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawal Successfull...");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.balance = 2000;

        atm.withdraw(3000);

        System.out.println("Remaining balance is "+atm.balance);
    }
}




