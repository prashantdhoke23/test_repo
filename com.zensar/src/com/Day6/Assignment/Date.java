package com.Day6.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;


public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listno=new ArrayList();
		List listno1=new ArrayList();
		listno.add("2-1-1998");
		listno.add("2-2-1990");
		listno.add("4-1-1997");
		listno1.add("Prashant");
		listno1.add("Satyam");
		listno1.add("Praveen");
		Map mp=new HashMap();
		mp.put(listno, listno1);
		System.out.println(mp);
//		ListIterator<Integer> listiterator= listno.listIterator(listno.size());
//		System.out.println(mp.);
//		
//		if() {
//			
//		}
		

	}

}
