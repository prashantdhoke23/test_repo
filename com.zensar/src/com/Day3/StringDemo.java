package com.Day3;

public class StringDemo {
	public static void main(String[] args) {
		String s1="Hello World";
		String a=new String("Hello World");
		String b;
		System.out.println(s1.hashCode());
		System.out.println(a.hashCode());
		System.out.println(s1==a);//checks 
		System.out.println(s1.equals(a));//checks only hascode thats why output is true
		String s3="Hello to java world";
		String s4="Welcome"+s3;
		System.out.println(s3);
		System.out.println(s4);
		
		String s5="My_string";
		for (int i=0;i<s5.length();i++) {
			System.out.println(s5.charAt(i));
		}
		System.out.println(s5.contains("M"));
		System.out.println(s5.contains("h"));
		char data[]=s5.toCharArray();
		System.out.println(data);
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s5.substring(4,7));
	}

}
