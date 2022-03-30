package com.Day10;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating thread using lambda expression
		new Thread(() -> {
			System.out.println("Thread created");
		}).start();
	}

}
