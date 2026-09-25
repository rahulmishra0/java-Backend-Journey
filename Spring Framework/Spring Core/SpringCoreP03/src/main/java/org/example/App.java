package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CarByName carByName = context.getBean("carByName", CarByName.class);
        carByName.drive();

        System.out.println("................................");

        CarByType carByType = context.getBean("carByType", CarByType.class);
        carByType.drive();

        System.out.println("................................");
        CarByConstructor carByConstructor = context.getBean("carByConstructor", CarByConstructor.class);
        carByConstructor.drive();
    }
}
