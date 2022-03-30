package com.Day10;

import java.util.stream.Stream;

public class JavaStreamExample1 {
	public static void main(String[] args){  
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(6)  //pass 5,6,7 and see output
        .forEach(System.out::println);  
    }  
}
