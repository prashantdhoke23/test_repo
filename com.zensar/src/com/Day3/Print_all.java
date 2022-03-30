package com.Day3;

    interface Printable {
		  void print() ;
		 
	}
	 class Employee implements Printable {
		
		public void print() {
			System.out.println("Inside print method of Employee");
			}
	}
		 class Circle implements Printable {
			
			public void print() {
				System.out.println("Inside print method of Circle");
				}
		}
		 
		 class Print_all {
			void print_all(Object c,Object e) {
				System.out.println("Circle object created at location" +c);
				System.out.println("Employee object created at location" +e);
			}
		public static void main(String[] args) {
			Employee e= new Employee();
			Circle c=new Circle();
			e.print();
			c.print();
			Print_all a=new Print_all();
			a.print_all(c,e);		
			}
			}
		



