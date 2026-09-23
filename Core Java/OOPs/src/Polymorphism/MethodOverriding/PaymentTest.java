package Polymorphism.MethodOverriding;

class Payment{
    void pay(){
        System.out.println("Generic Payment");
    }
}
class UpiPayment extends Payment{
//2. Abb m isme kuch update or changes karna chahta hu then isske baad parent ke object se parent ka method and child ke object se child ka method call hoga

    @Override
    void pay(){
        System.out.println("Payment done by using UPI");
    }

    void hello(){
        System.out.println("Hello Everyone..");
    }
}

public class PaymentTest {
    public static void main(String[] args) {

        //1.Abhi m parent or child kisi ka bhi object banakar call karu dono se output same hi aayga kyuki child inherit parent method
        Payment payment = new Payment();
        payment.pay();

        System.out.println(".................");

        UpiPayment upiPayment = new UpiPayment();
        upiPayment.pay();

        //parent reference can hold child object
        Payment parent = new UpiPayment();
        parent.pay();

       // parent.hello();
        //isse child ka metod call hoga but jab chid ke hello method ko call karnege tab error dega
        //Aisa isliye hoga kyuki LHS and RHS alag alag h but compile time par LHS ka(Reference ka) blue print check hota h and reference m hello method nahi h
        //BUT jo method resulation hoga wo object ke bases par hoga yani ki jo method call hoga wo based on Object(RHS) hoga that is called Run time Polymorphism
    }
}
