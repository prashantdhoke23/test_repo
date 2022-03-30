package com.Day6.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3 {

	public static void main(String[] args) {
		List<Integer> listno= new ArrayList();
		listno.add(4);
		listno.add(42);
		listno.add(14);
		listno.add(7);
		listno.add(49);
		System.out.println("Printing in forward/normal direction :"+listno);
		
		ListIterator<Integer> listiterator= listno.listIterator(listno.size());
		List<Integer> listno1=new ArrayList();
    // Traversing elements
    while (listiterator.hasPrevious()) {
    	
       listno1.add(listiterator.previous());
       
    }
    System.out.print("Printing in backward direction :"+listno1);
        }
	}


