package com.Day2;

public class Child extends Parent {
	private String a;
	//overriden method - redefining the same method which is already defined in Parent Class 
	//method overriding
	public void display() {
		System.out.println("This is Child display method");
	}
}
