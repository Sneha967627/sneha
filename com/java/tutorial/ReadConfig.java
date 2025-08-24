package com.java.tutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public static float divide(int x, int y) throws MyOwnException {
//		MyOwnException m = new MyOwnException();
		if (y == 0) {
			throw new MyOwnException("You cannot divide by zero");
		} else if (y > 3) {
			throw new MyOwnException("You cannot have value of y>3");
		}
		return x / y;
	}

	public static void readFile() throws IOException {
		Properties prop = new Properties();

//		FileReader obj1 = new FileReader("C:\\Batch 28\\Automation\\src\\com\\java\\tutorial\\config.properties");
		try {
			FileReader obj1 = new FileReader("config.properties");
			prop.load(obj1);
			System.out.println(obj1.read());
			System.out.println(prop.getProperty("vehicle"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Rough message");
//		obj1.read();

//		try {
//			FileReader obj1 = new FileReader("C:\\Batch 28\\Automation\\src\\com\\java\\tutorial\\config.properties");
		////			obj1.read();
//			prop.load(obj1);
//			System.out.println(prop.getProperty("vehicle"));
//		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		try {
//			FileInputStream obj = new FileInputStream("C:\\Batch 28\\Automation\\src\\com\\java\\tutorial\\config.properties");
//			System.out.println(obj.toString());
//		} catch (Exception e) {
//			System.out.println(e);
//		}

	}

	public static void main(String[] args) throws IOException {
//		ReadConfig.readFile();
		try {
			System.out.println(ReadConfig.divide(4, 5));
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Above code is to divide the numbers");
	}
}
