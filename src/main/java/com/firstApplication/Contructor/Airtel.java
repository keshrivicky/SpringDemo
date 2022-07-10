package com.firstApplication.Contructor;

import java.util.List;
import java.util.Vector;

public class Airtel implements Sim{
		
	List<String> fullName;
	
	Subscription sub;
 
	public Airtel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Airtel(List<String> fullName,Subscription sub) {
		super();
		this.fullName = fullName;
		this.sub = sub;
	}

	
	
	public void stateName() {
		System.out.println("Bihar");
		
	}

	public void topUpAmount() {
		System.out.println("150");
		
	}
	
	public void Subscription() {
		System.out.println("Subscription");
		sub.getNetflix();
		//System.out.println(sub.data);
		
	}

}