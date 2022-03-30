package com.Day1;

public class Day1Starter {
	public static void main(String []args) {
		Day1 d=null;
		d=new Day1();
		System.out.println(d);
		System.out.println(d.hashCode());
		Day1 d1;
		d1=new Day1();
		System.out.println(d1);
		System.out.println(d1.hashCode());
	}
	}
