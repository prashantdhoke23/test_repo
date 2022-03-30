package com.Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamsDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int a;
		String str;
		System.out.print("Enter any text");
		str=stdin.readLine(); //Taking String input
		System.out.println("Text is here :" +str);
		System.out.println("Enter number:");
		a=stdin.read(); //2byte unicode character
		System.out.print("Entered numer is:" +a);//Stream reader will store the data in ASCII value
		int age = Integer.parseInt(stdin.readLine());
		int age1 = Integer.parseInt(stdin.readLine());
//		int c=age+age1;
		System.out.println("Actual number :"+(age+age1));
		
	}

}
