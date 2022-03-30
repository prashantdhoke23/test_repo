package com.Day5;

public class Starter {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(34);
		emp.setName("Name");
		emp.setSalary(1000.0f);
		System.out.println(emp);
		Employee emp1=new Employee(1,"Prashant",1004.0f);
		System.out.println(emp1);
	}

}
