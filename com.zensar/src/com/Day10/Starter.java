package com.Day10;
import java.util.List;
import java.util.ArrayList;

public class Starter {
 public static void main(String[] args) {
	MyFunctionalInterface mfi=new MyFunctionalInterface() {
		
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("This the way of creating reference to interface");
		}
	};
	List newlist =new ArrayList();
	mfi.show();
	
	MyFunctionalInterface ref2= ()->{};//Syntax for lambda 
	MyFunctionalInterface ref3= ()->{System.out.println("Lambda Expression");};
	ref3.show();
	FunctionalInterface2 rf= n-> System.out.println("Value of n : " +n);
	rf.square(5);
	FunctionalInterface2 rf1= n-> System.out.println("Square of n : " + n*n);
	rf1.square(5);
	FunctionalInterface3 rgg=  (a,b) -> (a+b);
	System.out.println(rgg.addition(4, 5));
			
	//rgg.addition(3, 4);
}


}
