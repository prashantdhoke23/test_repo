package com.Day3;

public interface Vehicle {
		public int myfinalint=0;
		
		
	public void show();
	
	public static void accelearte() {
		System.out.println("Inside accelerate method");
	}
	public default void display() {
		System.out.println("Inside display method");
	}
	public static void method1() {
		System.out.println("Inside display1 method");
	}

}
