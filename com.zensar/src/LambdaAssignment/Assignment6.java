package LambdaAssignment;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Numbers = new ArrayList<String>();
		 Numbers.add("Prashant");
	        Numbers.add("Prakash");
	        Numbers.add("Ravi");
	        Numbers.add("Ram");
	        Numbers.add("Sas");
	        
	        
	        //1. Using replaceall to print given list in uppercase
	        
	        Numbers.replaceAll(n->n.toUpperCase());
	        Numbers.forEach(System.out::println);
	        
	        //2. Using Unary Operator
	        
	        UnaryOperator<String> str  = (msg)-> msg.toUpperCase();
//	        str.apply("hello");
//	        str.apply("world");
	        System.out.println(str.apply("this is string1"));
	        System.out.println(str.apply("this is string2"));
	        System.out.println(str.apply("this is string3"));
	}

}
