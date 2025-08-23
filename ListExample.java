package com.java.tutorial;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
	
	//List is an interface
	//ArrayList is a class in java.util package
	
	int a[] = {1,2,3,4};
	int m[] = {500,6,3,3778};
	int b[] = new int[5];
	int[] c = new int[6];
	
	//int d[0] = 1; // XXXXXX
	public int[] showArray() {
		
		b[1] = 2;
		for(int i=0;i<=b.length-1;i++) {
			b[i] = i*5;
		}
		b[2] = (Integer) null;
		return b;
	}
	
	public ArrayList convertArrayToList() {
		
		
//		ArrayList<Integer> d= new ArrayList<Integer>();
//		for(int i=0;i<=a.length-1;i++) {
//			d.add(a[i]);
//		}
//		d.add(5); // [1,2,3,4,5]
//		d.remove(3); // [1,2,3,5]
//		Integer obj = new Integer(3);
//		d.remove(obj); // [1,2,5]
//		
//		return d;
		
		
		ArrayList<Integer> d= new ArrayList<Integer>();
		for(int i=0;i<=a.length-1;i++) {
			d.add(a[i]);
		}
//		d.add('t'); // [1,2,3,4,t]
		d.remove(3); // [1,2,3,t]
		Integer obj = new Integer(3);
		d.remove(obj); // [1,2,t]
		Character o = new Character('t');
		d.remove(o); //[1,2]
		
		d.add(obj); //[1.2,3]
		
		d.add(5); //[1,2,3,5]
		d.add(0,4); //[4,1,2,3,5]
		d.add(null);
		int p = (int)d.removeFirst();
//		System.out.println(p);
		
		//To get last element in the list
//		System.out.println(d.get(d.size()-1));
//		System.out.println(d.get(2));
		
//		for(int x : d) {		//Results in concurrentModificationException
//			System.out.println(x);
//			if (x%2 != 0) {
//				System.out.println("Odd : " + x);
//				d.remove(x);
//			}
//		}
		
		for(int x=0;x<d.size()-1;x++) {		
//			System.out.println(x);
			if (x%2 != 0) {
				System.out.println("Odd : " + x);
				System.out.println(d);
				d.remove(x);
			}
		}
		
//		System.out.println(d.isEmpty()); //false
//		System.out.println(d.contains(3)); //true
		
		//Incorrect syntax - will cover later
		//Sir ko yaad nhi - now it is correct
//		d.removeIf(e->e%2!=0);
	
		
		return d;
	}
	
	
public LinkedList showLLKFunctions() {
		
		
		LinkedList<Integer> d= new LinkedList<Integer>();
		d.add(5); // [1,2,3,4,5] 
		d.add(0,6);
		d.contains(6);
		d.add(6);
		d.remove(1);
		d.add(1,5);
		d.add(null);
		d.add(null);
		
//		d.remove(3); // [1,2,3,5]
//		Integer obj = new Integer(3);
//		d.remove(obj); // [1,2,5]
		
		return d;
		
		
//		ArrayList<Integer> d= new ArrayList<Integer>();
//		for(int i=0;i<=a.length-1;i++) {
//			d.add(a[i]);
//		}
////		d.add('t'); // [1,2,3,4,t]
//		d.remove(3); // [1,2,3,t]
//		Integer obj = new Integer(3);
//		d.remove(obj); // [1,2,t]
//		Character o = new Character('t');
//		d.remove(o); //[1,2]
//		
//		d.add(obj); //[1.2,3]
//		
//		d.add(5); //[1,2,3,5]
//		d.add(0,4); //[4,1,2,3,5]
//		
//		int p = (int)d.removeFirst();
////		System.out.println(p);
//		
//		//To get last element in the list
////		System.out.println(d.get(d.size()-1));
////		System.out.println(d.get(2));
//		
////		for(int x : d) {		//Results in concurrentModificationException
////			System.out.println(x);
////			if (x%2 != 0) {
////				System.out.println("Odd : " + x);
////				d.remove(x);
////			}
////		}
//		
//		for(int x=0;x<d.size()-1;x++) {		
////			System.out.println(x);
//			if (x%2 != 0) {
//				System.out.println("Odd : " + x);
//				System.out.println(d);
//				d.remove(x);
//			}
//		}
//		
////		System.out.println(d.isEmpty()); //false
////		System.out.println(d.contains(3)); //true
//		
//		//Incorrect syntax - will cover later
//		//Sir ko yaad nhi - now it is correct
////		d.removeIf(e->e%2!=0);
//	
//		
	}
	
	
	
	
	
	public void display() {
		ArrayList b = new ArrayList();
		b.add(0);
		b.add(5);
		b.add(10);
		System.out.println(b.size());
		System.out.println(b);
		int x = (int)b.get(1);
		System.out.println(x);
		System.out.println("-------------------");
		
		ArrayList<Integer> c = new ArrayList<Integer>(4);
		c.add(0);
		c.add(5);
		c.add(10);
		System.out.println(c.size());
		System.out.println(c);
		int d = c.get(1);
		System.out.println(d);
				
		
	}
	
	public static void main(String[] args) {
		ListExample le = new ListExample();
		int[] retArr = le.showArray();
		for(int i=0;i<=retArr.length-1;i=i+2) {
			System.out.println(retArr[i]);
		}
		System.out.println("-------------------");
		for(int x : retArr) {
			System.out.println(x);
		}
		
//		le.display();
//		System.out.println(le.convertArrayToList());
//		System.out.println(le.showLLKFunctions());
	}
	

}
