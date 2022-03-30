package LambdaAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment2 {
 private String name;
 private int price;
 private String status;
 
	public Assignment2(String name, int price, String status) {
	super();
	this.name = name;
	this.price = price;
	this.status = status;
}

	public Assignment2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Assignment2 [name=" + name + ", price=" + price + ", status=" + status + "]";
	}
	public static void main(String[] args) {
	
		List<Assignment2> list=new ArrayList<Assignment2>();  
		list.add(new Assignment2("HP Laptop",8000,"Accepted"));
		list.add(new Assignment2("DELL Laptop",9000,"Completed"));
		list.add(new Assignment2("LENOVO Laptop",20000,"Completed"));
		list.add(new Assignment2("ACER Laptop",50000,"Accepted"));
//		
//		List<Assignment2> filtered = list.stream().filter( p -> p.price > 10000 ).collect(Collectors.<Assignment2>toList());
//		 System.out.println(filtered.);
		Stream<Assignment2> filtered_data = list.stream().filter(p -> p.price > 10000);
		System.out.println("Product and price with greater than 10000 and status are---");
		filtered_data.forEach(  
		Assignment2 -> System.out.println(Assignment2.name+": "+Assignment2 .price+" : "+Assignment2.status));
 }
	}