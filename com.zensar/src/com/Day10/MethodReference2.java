package com.Day10;

public class MethodReference2 {
	public static void threadstatus() {
		System.out.println("Run method implementation using static method Thread is running");
	}
	public static void main(String[] args) {
		
			Thread t2=new Thread(MethodReference2::threadstatus);
			t2.start();
			Thread t3=new Thread();
			t3.start();
	}

}
