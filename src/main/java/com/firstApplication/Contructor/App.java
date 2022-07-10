package com.firstApplication.Contructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/firstApplication/Contructor/Context.xml");

	//	Subscription subscription = context.getBean("subscriptions",Subscription.class);
	//	System.out.println(subscription.name);
		
		System.out.println("**************************");
		Airtel airtel = context.getBean("airtel",Airtel.class);
		System.out.println(airtel.subscription.name);
		System.out.println("**************************");

	
	}
}
