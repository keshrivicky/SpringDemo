package com.firstApplication.firstApplication;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Jio implements Sim{

	int data;
	String name;
	List<String> fullName;
	Set<String> rollNo;
	Map<String,String> sub;
	
	Subscription subscription;

	
	//Primitive data type
	//Collection
	//referece object
	

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

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFullName() {
		return fullName;
	}

	public void setFullName(List<String> fullName) {
		this.fullName = fullName;
	}

	public Set<String> getRollNo() {
		return rollNo;
	}

	public void setRollNo(Set<String> rollNo) {
		this.rollNo = rollNo;
	}

	public Map<String, String> getSub() {
		return sub;
	}

	public void setSub(Map<String, String> sub) {
		this.sub = sub;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "Jio [data=" + data + ", name=" + name + ", fullName=" + fullName + ", rollNo=" + rollNo + ", sub=" + sub
				+ ", subscription=" + subscription + "]";
	}

	

	

	
}
