package com.Day11;

import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Numbers = new ArrayList<String>();
		 Numbers.add("Prashant");
	        Numbers.add("Prakash");
	        Numbers.add("Ravi");
	        Numbers.add("Ram");
	        Numbers.add("Sas");
	        
	        //Simple way to print and sort list in one line using streams
	        //Sorting string using streamss
	        Numbers.stream().sorted().forEach(System.out::println);
	}

}
