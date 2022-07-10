package com.firstApplication.Contructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
       
      ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("com/firstApplication/Contructor/Context.xml");
     
      Jio obj = (Jio) context.getBean("jio");  
    
       obj.stateName();
       obj.topUpAmount();
       System.out.println(obj.data);
       System.out.println(obj.name);
       System.out.println(obj.fullName);
       System.out.println(obj.fullName.getClass());
       System.out.println(obj.rollNo);
       
      
       
       System.out.println(obj.sub);
       obj.subscription.getAmazonPrime();
       System.out.println(obj.subscription.name);
       System.out.println(obj.properties);
       //Jio jio =new Jio();
       //jio.subscription.getAmazonPrime();
       System.out.println("*******************************************************************");
       
       Subscription subs = context.getBean("subscri",Subscription.class);  
       System.out.println(subs);
       
       context.registerShutdownHook();
       
       
       
       
       System.out.println("******************************");
       System.out.println("calling Airtel beans");
       
       Airtel air = context.getBean("airtel",Airtel.class);  
       
       System.out.println(air.fullName);
       System.out.println(air.fullName.getClass());
       System.out.println(air.sub);
       System.out.println("calling Airtel beans Closed");
      // System.out.println(jio.data);
     // System.out.println(jio.name);
      // obj.Subscription();
    }
}
