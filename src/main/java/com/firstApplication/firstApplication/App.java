package com.firstApplication.firstApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       // IOC
        //DI
        
     //   Subscription obj1 = new Subscription();  //tigh
        //obj.topUpAmount();
       // obj1.getAmazonPrime();;
      ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("Context.xml");
    Airtel obj = context.getBean("airtel",Airtel.class);  
     // Jio jio = new Jio();
      //Jio obj = (Jio) context.getBean("airtel");
       // Airtel obj =new Airtel();
       obj.stateName();
       obj.topUpAmount();
       obj.Subscription();
    }
}
