package LambdaAssignment;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment5 {
	
	
	public static void main(String[] args) {
		String add;
		 System.out.println("Printing the values of List :");
		 List<String> Numbers = new ArrayList<String>();
		 	Numbers.add("Prashant");
	        Numbers.add("Prakash");
	        Numbers.add("Ravi");
	        Numbers.add("Ram");
	        Numbers.add("Sas");
	        
	        Consumer<List<String>> showList = list -> 
            list.forEach(System.out::println);
	        showList.accept(Numbers);
	        
//	        Consumer<List<String>> showList1 = list ->list.forEach(System.out.println(list).charAt(0)); 
//
//	        showList1.accept(Numbers);
	        System.out.print("Printing first letter of each string in list :");
	        StringBuffer sbd = new StringBuffer();
	        Consumer<String> showList1 = c -> sbd.append(" "+c.charAt(0));
	        showList1.accept("Prashant");
	        showList1.accept("Prakash");
	        showList1.accept("Ravi");
	        showList1.accept("Ram");
	        showList1.accept("Sas");
	        System.out.print(sbd);
	       
	      
}

	private static PrintStream print() {
		// TODO Auto-generated method stub
		return null;
	}
}