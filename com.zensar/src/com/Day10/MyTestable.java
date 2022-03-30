package com.Day10;

public class MyTestable {
	public  static void dotest() {
		System.out.println("Static reference to test method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testable ref=MyTestable::dotest;
		ref.test();
		MyTestable.dotest();
	}

}
