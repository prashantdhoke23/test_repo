package com.Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map isdCodes=new HashMap();
		isdCodes.put(91,"India");
		isdCodes.put(92,"pakistan");
		isdCodes.put(95,"USA");
		isdCodes.put(96,"China");
		isdCodes.put(45, "Yhtg");
		System.out.println(isdCodes);
		
		isdCodes.clear();
		
		System.out.println(isdCodes.isEmpty());
		
		System.out.println(isdCodes.get(96));
		System.out.println(isdCodes.containsKey(100));
		System.out.println(isdCodes.containsValue("USA"));
		
		//traversing a map
		Set keys= isdCodes.keySet();
		for(Object object:keys) {
		System.out.print("ISDCODES ="+object + "COUNTRY =" +isdCodes.get(object));
		}
	}

}
