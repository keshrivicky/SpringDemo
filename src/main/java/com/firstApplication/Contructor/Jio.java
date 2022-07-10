package com.firstApplication.Contructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;

public class Jio implements Sim {

	int data;
	String name;
	List<String> fullName;
	Set<String> rollNo;
	Map<String, String> sub;
	Properties properties;
	
	Subscription subscription;

	public void init() {
		System.out.println("Init Method calling !!");

	}

	public void destroy() {
		System.out.println("destroy Method calling !!");

	}

	public void stateName() {
		System.out.println("jharkhand");

	}

	public void topUpAmount() {
		System.out.println("100");

	}

	public Jio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jio(int data, String name, List<String> fullName, Set<String> rollNo, Map<String, String> sub,
			Subscription subscription, Properties properties) {
		super();
		System.out.println("Inside Contructor");

		this.data = data;
		this.name = name;
		this.fullName = fullName;
		this.rollNo = rollNo;
		this.sub = sub;
		this.subscription = subscription;
		this.properties = properties;
	}

}
