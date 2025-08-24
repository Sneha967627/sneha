package com.java.tutorial;

public class ValueException {

	public ValueException(int x) throws Exception {
		if (x > 3) {
			System.out.println(x);
		} else {
			Exception o = new Exception("Value cannot be less than 3");
			throw o;
//			throw new Exception("Value cannot be less than 3");
		}

	}

	public void display(int x) {
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ValueException v = new ValueException(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
