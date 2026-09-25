package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Car car = context.getBean("car", Car.class);
        car.drive();


    }
}
/* -> Kyuki Engine ek interface h jisko 2 type ke engines ne implement kiya h.
   -> But problem ye h ki 2 type ke engine (petrol and diesel) se car confused ho gaya ki kyun sa use karu
   -> this problem is called ambiguity problem
   -> to solve this problem kisi ek candidate ko false karna padega.
*/