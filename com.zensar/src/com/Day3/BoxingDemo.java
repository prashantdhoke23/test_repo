package com.Day3;

public class BoxingDemo {

	public static void main(String[] args) {
	
		 int x=10;//int intialization and decleration
		 System.out.println("Primitive int:" +x);
		 Integer x1=new Integer(x);//Auto boxing happens here
		 System.out.println("intObject:"+ x1);//Auto Boxing happens
		 
		 Employee1 e=new Employee1();
		 System.out.println("empObject:" +e);

	}

}
