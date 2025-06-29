package com.java.tutorial;

public class Plumber {
	 
	void fixtab() {
		System.out.println("Displaying from no argumnet constructor");
		}
	
	public Plumber(int scruedriverCount) {
		System.out.println("Displaying scruedriver :"+scruedriverCount);
	}
	
	public void fixtab() {
		System.out.println("Tap is fixed");
	}
	
	public static void main(String[] args) {
		System.out.println("Plumber calling");
		 Plumber p = new Plumber(5);
		  p.fixtab();
		 
	}
}

  