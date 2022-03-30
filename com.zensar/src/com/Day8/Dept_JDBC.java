package com.Day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dept_JDBC {
	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		 //Step 1: Load & Register the driver
        Class.forName("com.mysql.jdbc.Driver");
        //Step 2: Establish Connection
        String url = "jdbc:mysql://localhost:3306/zensar2?autoReconnect=true&useSSL=false";
        Connection conn = DriverManager.getConnection(url, "root", "root");

        //Step 3: Creating and executing query
        String query = "select * from deptT";
        Statement stmt = conn.createStatement();

        //step 4 : storing & processing result
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("================Department Table Contents=====================");
        System.out.println("ID \t NAME \t SALARY\t COMMISSION ROLE DEPTNO");
        System.out.println("==============================================================");
        while(rs.next()) {
            System.out.println(rs.getInt("ID")+"\t "+rs.getString("NAME")+"\t "+rs.getFloat("SALARY")+"\t "+rs.getFloat("COMMISSION")+"\t "+rs.getString("ROLE")+"\t "+rs.getInt("DEPNO")+"\t ");
        }
 
        //step 5 : close resources
        if (rs!=null)
            rs.close();
        if (stmt !=null)
            stmt.close();
        if(conn!=null)
            conn.close();
	}

}
