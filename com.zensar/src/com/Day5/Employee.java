package com.Day5;

import java.io.Serializable;

public class Employee implements Serializable{

	private int id;
	private String name;
	private float Salary;
	private static  String employee;
	private transient String PAN;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	
	public Employee(int id, String name, float salary, String pAN) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		PAN = pAN;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static String getEmployee() {
		return employee;
	}

	public static void setEmployee(String employee) {
		Employee.employee = employee;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
}

