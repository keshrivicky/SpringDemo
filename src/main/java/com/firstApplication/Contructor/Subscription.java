package com.firstApplication.Contructor;

public class Subscription {

	String name;

	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subscription(String name) {
		super();
		System.out.println("inside Subscription Constructor ");
		this.name = name;
	}

	public void setName(String name) {
		System.out.println("Subscription inside Setter !!");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	void getNetflix() {
		System.out.println("Netflix");
	}

	void getAmazonPrime() {
		System.out.println("AmazonPrime");
	}

	void getHotStar() {
		System.out.println("HotStar");
	}

	@Override
	public String toString() {
		return "Subscription [name=" + name + "]";
	}
}
