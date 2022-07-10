package com.firstApplication.Contructor;

import org.springframework.beans.factory.InitializingBean;

public class Airtel {
	
	Subscription subscription;

	public Airtel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Airtel(Subscription subscription) {
		super();
		System.out.println("Airtel Contructor calling !!");
		this.subscription = subscription;
	}

	public Subscription getSubscription() {
		return subscription;
	}
	
	
	public void setSubscription(Subscription subscription) {
		System.out.println("Airtel Setter calling !!");
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "Airtel [subscription=" + subscription + "]";
	}
	
	
	

}