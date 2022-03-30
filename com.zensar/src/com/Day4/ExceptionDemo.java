package com.Day4;

public class ExceptionDemo {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,ArithmeticException {
		int a=20;
		int c[]= {3,4,5,6,7,8};
		//System.out.println(c[6]);
		try {
			System.out.println(c[6]);
			try {
				int b=a/0;
			}
			finally {
				
			}
		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index bound exception --" +e.getMessage());
//		}
	}

}
