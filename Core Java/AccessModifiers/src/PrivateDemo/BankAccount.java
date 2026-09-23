package PrivateDemo;

public class BankAccount {
    private double balance;

    void deposit(double amount){
        if (amount > 0){
            balance = balance+amount;
        }
    }
    double getBalance(){
        return balance;
    }
}

class Child extends BankAccount{
   // double getBal(){
        //private balance child class m bhi accessible nahi hoga
        //means private ke sath inheritance kaam nahi karta h
        //return balance;
    //}
}
