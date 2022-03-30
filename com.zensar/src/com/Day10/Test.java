package com.Day10;

import com.Day8.MyRunnable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create anonymous inner class
			new Thread(new Runnable() {
				@Override
				public void run() {
				System.out.println("Thread created");
			}
		}).start();
		
	}

}
