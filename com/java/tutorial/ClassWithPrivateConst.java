package com.java.tutorial;

public class ClassWithPrivateConst {
	
	
	private ClassWithPrivateConst() {
		System.out.println("I have been defined by the user");
	}
	
	public void display() {
		System.out.println("Some class");
	}
	
	public static void staticDisplay() {
		System.out.println("I am from staticDisplay function");
	}

}
