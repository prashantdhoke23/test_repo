package com.Day6.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Person {
	// Weight,Height,Name
	public static void main(String[] args) {
	
		List Weight=new ArrayList();
		List Name=new ArrayList();
		Name.add("Prashant");
		Name.add("Satyam");
		Name.add("Praveen");
		List Height=new ArrayList();
		Height.add(409);
		Height.add(46);
		Height.add(47);
		Weight.add(56);
		Weight.add(57);
		Weight.add(986);
		Map isdCodes=new HashMap();
		isdCodes.put(Height, Name);
		Map mp=new HashMap();
		mp.put(Weight,Name);

		System.out.println("Height and Name if the person" +isdCodes);
		System.out.println("Weight and Name if the person "+mp);
		
		Set order=new TreeSet(Weight);
		System.out.println("Sorting according to Weight "+order);
		Set order1=new TreeSet(Height);
		System.out.println("Sorting according to Height "+order1);
	}
	
	

}
