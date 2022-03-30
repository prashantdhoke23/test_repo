package com.Day2;

public class Day2Inheritance {
	public static void main(String args[]) {
		Parent parent=new Parent();
		parent.address="Bhilai";
		parent.age=3;
		parent.mobile=98876655;
		parent.salary=25000.00f;
		System.out.println("Parent:" +parent);
		System.out.println("Parent is a reference variable/pointer.It will store address of Parent object");
	Parent obj;//creating a object reference only not actual object
	//obj=new Parent();//Object will be created 
	//obj.display();
	Child c=new Child();//creating object of Child class
	// writing c. it will display all variable and method of Parent class that is extends
	//in Child class by removing extends and then writing c. all the properties of Parent class will be removed
	c.address="Raipur";
	c.age=34;
	c.mobile=567565;
	c.salary=6700.00f;
	c.display();
	}

}
