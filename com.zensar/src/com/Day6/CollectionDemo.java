package com.Day6;
import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		 List namelist=new ArrayList();
		 namelist.add("AMC");
		 namelist.add("AMfC");
		 namelist.add(1,"AMCe"); //insert the data in any available index of allocation , it hsifts to given index position
		 namelist.add("eAMC");
		 namelist.forEach(System.out::println);
		 System.out.println(namelist);
		 System.out.println(namelist.toArray()	);
		 System.out.println(namelist.size());
		 Iterator itr=namelist.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 System.out.println(namelist);// Array list is dynamically growing array
		 for(Object obj: namelist) {
			 System.out.println(obj);
		 }
		 //namelist.
	}
	
	

}
