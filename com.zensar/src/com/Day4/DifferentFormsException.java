package com.Day4;

public class DifferentFormsException {
	public static void main(String[] args) {
		int a=10;
		int d[]= {3,4,5,6,8};
		String myString = null;
		String number="Thiss";
		
		//1.a. Try with multiple catch
		try {
			int b=a/0; //Arithmetic Exception
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
//-------------------------------------------------------//
	
	//1.b Nested try/catch block
	try {
		System.out.println(d[6]); //ArrayIndexOutOfBound Exception
		try {
			int number1 = Integer.parseInt(number);	//NumberFormat Exception
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
//-----------------------------------------------------//
	//3.c. Try, catch & finally
	try {
		System.out.println(myString.length()); //NullPointer Exception
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Ends here");
	}
//----------------------------------------------------//
	//4.d. Try with finally
	try {
		System.out.println(number.charAt(8));
	}
	finally {
		System.out.println("Last Finally Executed");
	}
}
}
