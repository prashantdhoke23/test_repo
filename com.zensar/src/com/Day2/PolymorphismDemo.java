package com.Day2;

public class PolymorphismDemo {
	public static void main(String[] args) {
		PolymorphismDemo p=new PolymorphismDemo();
		p.add(4,5);
		p.add(2.3f,2.4f);
		p.add(2.3f,4);
		p.add(1, 2,3);
		p.add(4,2.4f);
		Polymorphism2 p1=new Polymorphism2();
		p1.display();
		Polymorphism3 p3=new Polymorphism3();
		p3.display();
		Polymorphism2 p4=new Polymorphism3();
		p4.display();
//		Polymorphism3 p5=new Polymorphism2();// not applicable because child class object cannot be converted to parent class object
	}
	public void add(int a,int b) {
		System.out.println("Result of int addition a and b: "+ (a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Result of int addition a b c : "+ (a+b+c));
	}
	public void add(int a,float b) {
		System.out.println("Result of int a and float b : "+ (a+b));
	}
	public void add(float a,float b) {
		System.out.println("Result float a and b : "+ (a+b));
	}
		public void add(float a,int b) {
			System.out.println("Result of float a and int b: "+ (a+b));
		
	}
	
}
