package com.Day9;

import java.sql.SQLException;
import java.util.Scanner;

public class CRUDusingDAO {
	public static void show() {
		for(int i=0;i<60;i++) {
			System.out.print("*");
		}
	}

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			
			
			Scanner sc=new Scanner(System.in);
			int choice=0;
			int id=0;
			String name=null;
			Float Salary=0.0f;
			Float Commission=0.0f;
			String Role=null;
			int dept_no=0;
			
			while(choice<=5) {
				show();
				show();
				System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
				System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
				System.out.println("* \t\t\t\t\t Welcome to JDBC CRUD Operations \t\t\t\t\t\t    *");
				System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
				System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
				show();
				show();
				System.out.println(" \n ");
				System.out.println("\t\t\t\t 1. Read Department Table.");
				System.out.println("\t\t\t\t 2 .Inser Department Table.");
				System.out.println("\t\t\t\t 3. Update Department Table.");
				System.out.println("\t\t\t\t 4 .Delete Department Table.");
				System.out.println("\t\t\t\t 5. Exit.");
				System.out.println("Please Enter your choice [1-5] .");	
				choice=sc.nextInt();
				int status=0;
				switch(choice) {
				case 1:
					Department_DAO.readall();
					break;
				case 2:
					System.out.println("Enter id");
					id=sc.nextInt();
					System.out.println("Enter name");
					name=sc.next();
					System.out.println("Enter salary");
					Salary=sc.nextFloat();
					System.out.println("Enter commission");
					Commission=sc.nextFloat();
					System.out.println("Enter role");
					Role=sc.next();
					System.out.println("Enter Department no");
					dept_no=sc.nextInt();
					Department dpt=new Department(id, name, Salary, Commission, Role, dept_no);
					status=Department_DAO.create(dpt);
					if(status>0) {
						System.out.println("*************** Created Succesfully ********************");
					}
					break;
				case 3:
					System.out.println("Enter id");
					id=sc.nextInt();
					System.out.println("Enter name");
					name=sc.next();
					System.out.println("Enter salary");
					Salary=sc.nextFloat();
					System.out.println("Enter commission");
					Commission=sc.nextFloat();
					System.out.println("Enter role");
					Role=sc.next();
					System.out.println("Enter Department no");
					dept_no=sc.nextInt();
					Department dpt1=new Department(id, name, Salary, Commission, Role, dept_no);
					status=Department_DAO.update(id,dpt1);
					if(status>0) {
						System.out.println("*************** Updated Succesfully ********************");
					}
					break;	
				case 4:
					System.out.println("Enter the id of department to delete");
					id=sc.nextInt();
					
					status=Department_DAO.delete(id);
					if(status>0) {
						System.out.println("*************** Deleted Succesfully ********************");
					}
					break;
				case 5:
					System.out.println("************* Thanks for using application ************");
					Department_DAO.close();
					System.exit(0);
					break;
				default:
				System.out.print("Please Enter a whole number between 1 to 5 only");
				
				}
			}
	
	}

}
