package com.firstApplication.firstApplication;

import org.springframework.beans.factory.annotation.Autowired;

public class Airtel implements Sim{
	
	@Autowired
	Subscription sub;
	
	public void stateName() {
		System.out.println("Bihar");
		
	}

	public void topUpAmount() {
		System.out.println("150");
		
	}
	
	public void Subscription() {
		System.out.println("Subscription");
		sub.getNetflix();
		
	}

}
