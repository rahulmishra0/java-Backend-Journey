package Is_A;

public class Main {
    public static void main(String[] args) {

        EmailNotification notification = new EmailNotification();
        notification.send();
    }
}

//Output : Sending Email..

//Inheritance work here perfectly, But inheritance represent IS-A relationship.
//Ex->EmailNotification IS-A Notification
//Ex->SmsNotification IS-A Notification

//The problem start when we try to reuse behaviour in large application
//The problem called -> Inheritance Explosion

//Note : So developer learned an important principle -> Favor Composition Over Inheritance.