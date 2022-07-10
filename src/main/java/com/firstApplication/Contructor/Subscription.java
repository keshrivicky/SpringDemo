package com.firstApplication.Contructor;
import java.util.HashMap;

public class Subscription {
	
	String name ;
	
	public Subscription(String name) {
		
		super();
		System.out.println("inside Subscription Constructor ");
		this.name = name;
	}

	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	@Override
	public String toString() {
		return "Subscription [name=" + name + "]";
	}

	public void setName(String name) {
		System.out.println("inside Setter");
		this.name = name;
	}

	void getNetflix(){
		System.out.println("Netflix");
	}
	
	void getAmazonPrime(){
		System.out.println("AmazonPrime");
	}
	
	void getHotStar(){
		System.out.println("HotStar");
	}
	
	


}
