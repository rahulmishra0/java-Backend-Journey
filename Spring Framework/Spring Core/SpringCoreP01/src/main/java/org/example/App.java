package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Bina object banaye dono engine initialized ho jayenge" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); //isse bean configuration load ho jayegi and object create ho jayega

        Car car = (Car) context.getBean("car");
        car.drive();
    }
}
