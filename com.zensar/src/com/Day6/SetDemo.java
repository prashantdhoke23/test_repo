package com.Day6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set numberset=new HashSet();
		numberset.add(5);
		numberset.add(51);
		numberset.add(52);
		numberset.add(53);
		numberset.add(54);
		
		System.out.println(numberset);
		Set orderSet=new TreeSet();
		orderSet.add(16);
		orderSet.add(46);
		orderSet.add(66);
		orderSet.add(64);
		orderSet.add(6);
		orderSet.add(26);
		orderSet.add(90);
		orderSet.add(60);
		
		System.out.println(orderSet);
		
		Set ordernames=new TreeSet();
		ordernames.add("Sundar");
		ordernames.add("Satya");
		ordernames.add("Mark");
		ordernames.add("James");
		System.out.println(ordernames);
	}

}
