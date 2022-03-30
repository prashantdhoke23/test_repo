package com.Day9;

public class Department {

	private int id;
	private String name;
	private Float Salary;
	private Float commission;
	private String role;
	private int dept_no;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name, Float salary, Float commission, String role, int dept_no) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.commission = commission;
		this.role = role;
		this.dept_no = dept_no;
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
	public Float getSalary() {
		return Salary;
	}
	public void setSalary(Float salary) {
		Salary = salary;
	}
	public Float getCommission() {
		return commission;
	}
	public void setCommission(Float commission) {
		this.commission = commission;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	
	
}
