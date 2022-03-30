package com.Day3;
import java.util.*;
public class WrapperAssignment {
	public static void main(String args[]) {
		int temp=0;
		int[] num = new int[args.length];
		for(int i=0;i<args.length;i++) {
			int n=Integer.parseInt(args[i]);
			num[i]=n;
		}
		System.out.println("Inputs numbers through command line argumenst are :");
		for(int m=0;m<num.length;m++) {
			System.out.print(" " +num[m]);
		}
			for (int i = 0; i < num.length; i++) {     
	            for (int j = i+1; j < num.length; j++) {     
	               if(num[i] > num[j]) {    
	                   temp = num[i];    
	                   num[i] = num[j];    
	                   num[j] = temp;  
	                   } 
	            } 
	             
	            }      
			System.out.println("\nElements of array sorted in ascending order: ");    
            for (int i = 0; i < num.length; i++) {     
                System.out.print(num[i] + " ");   
		}
		
	}
}
