package com.java.tutorial;

import java.util.HashSet;

//public class ReversedHashSet extends HashSet{
//	
//	public HashSet reverse() {
//		
//	}
//}



public class HashSetExample {
	
	public void display() {
		HashSet obj = new HashSet();
		obj.add(3);
		obj.add(3);
		obj.add(null);
		obj.add(9);
		obj.add(6);
		obj.add(10);
		obj.add(4);
		obj.add(90);
		obj.add('A');
		obj.add('B');
		obj.add("C");
		obj.add(4.5);
		obj.add("Varun");
		
		obj.clear();
		System.out.println(obj.getClass());
		
		System.out.println(obj);
		
		ReversedHashSet o = new ReversedHashSet();
		o.reverse();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetExample o = new HashSetExample();
		o.display();
	}

}
