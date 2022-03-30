package LambdaAssignment;

import java.util.ArrayList;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Numbers = new ArrayList<String>();
		 Numbers.add("Prashant");
	        Numbers.add("Prakash");
	        Numbers.add("Ravi");
	        Numbers.add("Ram");
	        Numbers.add("Sas");
	        Numbers.removeIf(n -> (n.length()%2!=0));
	        
	        Numbers.forEach(System.out::println);

	}

}
