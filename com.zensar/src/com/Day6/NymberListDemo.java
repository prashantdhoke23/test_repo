package com.Day6;

import java.util.ArrayList;
import java.util.List;

public class NymberListDemo {
	public static void main(String[] args) {
		List numlist=new ArrayList();
		numlist.add(5);
		int i=25;
		numlist.add(i);
		numlist.add(78);
		numlist.add(55);
		//collectioj will not operate with primitive
		System.out.println(numlist);
		//Auto_Boxing converting primitive to its coresponding object
		
		//Manual boxing 
		int x=10; //primitive integer value
		Integer intobj=new Integer(x);//Manual-boxing
		System.out.println(intobj.intValue());
		
		String strr="200";
		Integer intstring=new Integer(strr);
		System.out.println(intstring);
		
		Employee emp=new Employee();
		System.out.println(emp);
		
		System.out.println(Integer.toBinaryString(i));
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.BYTES);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		
	numlist.forEach(System.out::println);
	}
	

}
