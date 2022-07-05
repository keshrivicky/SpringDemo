package com.firstApplication.Contructor;

import java.util.LinkedList;

public class ExceptionTest {
	public static void main(String[] args) {
		
		ExceptionTest sub= new ExceptionTest();
		LinkedList<String> al = new LinkedList<String>();
		System.out.println("*********");
		sub=null;
		al = null;
		System.gc();
		System.out.println("end of garbage collection");   
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(5/0);
	}

}
