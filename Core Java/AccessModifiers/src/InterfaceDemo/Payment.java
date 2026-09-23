package InterfaceDemo;

public interface Payment {
    //only initialize variable is allowed because internally its used final
    int a = 10;

    //only incomplete methods are allowed jiska implementation child class karega
    void pay();
}
class UpiPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment done by upi");
    }
}

class CardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment done by card");
    }
}
