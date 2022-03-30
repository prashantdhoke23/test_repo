package com.Day4;

public class InvalidExcpetion2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age=12;

	if(age<18) {
		try {
			System.out.println("Before Exception ");
		throw new InvalidExceptions(); //calls custom InvalidException 
	}
		catch(InvalidExceptions e) {
			System.out.println(e.getMessage());
		}
	}
	else {
		System.out.println("After exception");
	}
System.out.println("Program ends here");
	}

}
