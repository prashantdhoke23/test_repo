package com.Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class JDBC_CRUD {
	private static Connection conn;
	private static Statement stm;
	private static ResultSet rs;
	
	private static final String JDBC_URL="jdbc:mysql://localhost:3306/zensar2?autoReconnect=true&useSSL=false";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	private static final String DRIVER_URL="com.mysql.jdbc.Driver";
	
	public static void connect() {
		try {
		Class.forName(DRIVER_URL);
		JDBC_CRUD.conn=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static int create() {
		JDBC_CRUD.connect();
		int status=0;
		String query="insert into dept(ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO) values(11,'Ram',40000.00,500.00,'Manager',2)";
		try {
			JDBC_CRUD.stm=conn.createStatement();
			status=stm.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static int update() {
		
		JDBC_CRUD.connect();
		int status=0;
		String query="update dept set NAME='JACKFURRY',COMMISSION=1999.90 where ID=1";
		try {
			JDBC_CRUD.stm=conn.createStatement();
			status=stm.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static int delete() {
		JDBC_CRUD.connect();
		int status=0;
		String query="delete from dept where NAME='GEORGE'";
		try {
			JDBC_CRUD.stm=conn.createStatement();
			status=stm.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static void readall() {
		JDBC_CRUD.connect();
		String query = "select * from dept";
		try {
			JDBC_CRUD.stm = conn.createStatement();
			rs = stm.executeQuery(query);
			System.out.println("ID \t NAME \t SALARY\t COMMISSION ROLE DEPTNO");
			while(rs.next()) {
				System.out.println(rs.getInt("ID")+"\t "+rs.getString("NAME")+"\t "+rs.getFloat("SALARY")+"\t "+rs.getFloat("COMMISSION")+"\t "+rs.getString("ROLE")+"\t "+rs.getInt("DEPT_NO")+"\t ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void readone() {
		JDBC_CRUD.connect();
		int status=0;
		String query="select * from dept where ID=1";
		try {
			JDBC_CRUD.stm=conn.createStatement();
			rs=stm.executeQuery(query);
			System.out.println("ID \t NAME \t SALARY\t COMMISSION ROLE DEPTNO");
			if(rs.next()) {
				System.out.println(rs.getInt("ID")+"\t "+rs.getString("NAME")+"\t "+rs.getFloat("SALARY")+"\t "+rs.getFloat("COMMISSION")+"\t "+rs.getString("ROLE")+"\t "+rs.getInt("DEPT_NO")+"\t ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public  static void close() throws SQLException {
		if(rs!=null){
			rs.close();
		}
		if(stm!=null) {
			stm.close();
		}
		if(rs!=null) {
			rs.close();
		}
	}
	public static void show() {
		for(int i=0;i<60;i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice<=5) {
			JDBC_CRUD.show();
			JDBC_CRUD.show();
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("* \t\t\t\t\t Welcome to JDBC CRUD Operations \t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			JDBC_CRUD.show();
			JDBC_CRUD.show();
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
				JDBC_CRUD.readall();
				break;
			case 2:
				status=JDBC_CRUD.create();
				if(status>0) {
					System.out.println("*************** Created Succesfully ********************");
				}
				break;
			case 3:
				status=update();
				if(status>0) {
					System.out.println("*************** Updated Succesfully ********************");
				}
				break;	
			case 4:
				status=delete();
				if(status>0) {
					System.out.println("*************** Deleted Succesfully ********************");
				}
				break;
			case 5:
				System.out.println("************* Thanks for using application ************");
				close();
				System.exit(0);
				break;
			default:
			System.out.print("Please Enter a whole number between 1 to 5 only");
			
			}
		}
		
		
		//JDBC_CRUD.readone();

	}

}
