package Encapsulation;

public class BankAccount {
    private double balance; //not accessible outside this class

    void deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
        }
    }

    //To Set or get value of private instance variable use -> Getter & Setter
    //getter setter se abb ye value outside class bhi available hogi
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
