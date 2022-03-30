package com.Day10;

@FunctionalInterface
public interface MyFunctionalInterface {
	public void show(); //abstarct methodx
	
	//only static and default method can be defined
	 static void dsiplay() {
		 System.out.println("This is a Static method");
	 } 
		 default void print() {
			 System.out.println("This is default mehtod");
		 }
	 //A functional interface can have n no of default and static mehtod
}
