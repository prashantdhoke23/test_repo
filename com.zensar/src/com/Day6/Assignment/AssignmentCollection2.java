package com.Day6.Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class AssignmentCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Integer> hash=new HashSet();   
         hash.add(10);     
         hash.add(20);      
         hash.add(30);     
         hash.add(40);    
         hash.add(50);  
         System.out.println(hash);
         Iterator<Integer> i=hash.iterator();  // Traversing objects  
         System.out.println("Printing in unordered form :");
         while(i.hasNext())  // Return true if the Scanner has another token input  
         {    
         System.out.print(i.next()+" ");    
         } 
         System.out.println("\n");
         LinkedHashSet<Integer> hash1=new LinkedHashSet();    
         hash1.add(10);     
         hash1.add(20);      
         hash1.add(30);     
         hash1.add(40);    
         hash1.add(50);    
         Iterator<Integer> im=hash1.iterator(); // Traversing objects  
         System.out.println("Printing in ordered form :");
         while(im.hasNext()) // Return true if the Scanner has another token input    
         {    
         System.out.print(+im.next()+" ");// printing elements     
         }    
	}

}
