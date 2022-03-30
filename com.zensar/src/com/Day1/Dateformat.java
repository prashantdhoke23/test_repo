package com.Day1;

import java.util.Date;

public class Dateformat {
	public static void main(String args[]) {
		Date today=new Date();
		System.out.println("Today date is " +today);
		
	java.sql.Date mysqldate = new java.sql.Date(122, 1, 8);
	
	System.out.println("My Sql Date is " +mysqldate);
	}

}
