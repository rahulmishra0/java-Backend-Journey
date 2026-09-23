package CustomException;

public class BankAccount {
   double balance = 500;

//   void withdraw(double amount){
//       if (amount > balance){
//           try {
//               throw new InsuficiantBalanceException("Not enough amount");
//
//           }
//           catch (InsuficiantBalanceException e){
//               System.out.println("You have lower balance then "+amount);
//           }
//           finally {
//               System.out.println("Transection close");
//           }
//       }
//       else {
//           System.out.println("Withdraw successfully");
//       }
//       balance = balance-amount;
//  }


   //Abb m chahta hu ki ye try catch finally jhamela m na karu M isko handle nahi karna chahta hu then use throws.

    void withdraw(double amount) throws InsuficiantBalanceException {
        if (amount > balance) {
            throw new InsuficiantBalanceException("Not enough amount");
        }
        else {
            System.out.println("Withdraw successfully");
        }
        balance = balance - amount;
    }
}
