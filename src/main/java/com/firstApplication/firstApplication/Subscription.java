package com.firstApplication.firstApplication;

import java.util.HashMap;

public class Subscription {
	
	void getNetflix(){
		System.out.println("Netflix");
	}
	
	void getAmazonPrime(){
		System.out.println("AmazonPrime");
	}
	
	void getHotStar(){
		System.out.println("HotStar");
	}
	
	int GetMethod(int data){
		
		HashMap<Integer, Integer> hm = new HashMap();
		hm.put(3, 9);
		hm.put(9,3);
		
		return hm.get(data);
		
	}
public static void main(String[] args) {
	Subscription sub = new Subscription();
	System.out.println("Input is 3:-"+sub.GetMethod(3));
	System.out.print("Input is 9:-"+sub.GetMethod(9));
}


}
