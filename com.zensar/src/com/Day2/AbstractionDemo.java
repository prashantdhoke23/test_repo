package com.Day2;

public class AbstractionDemo {
	public static void main(String args[]) {
		
	}
	abstract class Myabstraction{
		public void show() {
			
		}
		//public void display();//method decleration
		public abstract void dispaly();//to declare a method add abstract keywoard to class as well as method
	}
	abstract class MysecodnABstraction{
		public void display() //defining the abstarct method of Myabstaction class
		{
			System.out.println("This is a concerete method");
		}
	}

}
