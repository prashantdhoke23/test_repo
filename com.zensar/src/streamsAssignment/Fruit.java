package streamsAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 class FruitDemo {
	String name; 
	 int calories; 
	int price; 
	String color;
	
	public FruitDemo(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
		
	}

	

	public static Stream<FruitDemo> stream() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Fruit {
	public static void main(String[] args) {
		List<FruitDemo> list=new ArrayList<FruitDemo>();
		list.add(new FruitDemo("Mango", 145, 100, "Yellow"));
		list.add(new FruitDemo("Grapes", 55, 20, "Black"));
		list.add(new FruitDemo("Banana", 35, 100, "Yellow"));
		list.add(new FruitDemo("Apple", 165, 80, "Red"));
		list.add(new FruitDemo("Dragon Fruit", 165, 80, "Red"));
		list.add(new FruitDemo("Chiku", 20, 1000, "Black"));
		
		//1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
		List<String> fruitlist= list.stream().filter(p-> p.calories<100).map(p->p.name).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(fruitlist);
	
		//2. Display color wise list of fruits
		List<String> app= list.stream().filter(p->p.color.equals("Yellow")).map(p->p.name).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(app);
		List<String> app1= list.stream().filter(p->p.color.equals("Black")).map(p->p.name).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(app1);
		List<String> app2= list.stream().filter(p->p.color.equals("Red")).map(p->p.name).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(app2);
		List<String> app3= list.stream().filter(p->p.name.equals("Mango")).filter(p->p.color.equals("Yellow")).map(p->p.name).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(app3);
		
		//3. Display only RED color fruits sorted as per their price in ascending order.
		List<String> fruitlist3 = list.stream().filter(p -> p.color == "Red").map(p -> p.name).sorted().collect(Collectors.toList());
		System.out.println(fruitlist3);
	}
	

}