package com.Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Department_DAO {

		// TODO Auto-generated method stub
		private static Connection conn;
		private static Statement stm;
		private static ResultSet rs;
		private static PreparedStatement pstm;
		
		private static final String JDBC_URL="jdbc:mysql://localhost:3306/zensar2?autoReconnect=true&useSSL=false";
		private static final String USERNAME="root";
		private static final String PASSWORD="root";
		private static final String DRIVER_URL="com.mysql.jdbc.Driver";
		
		public static void connect() {
			try {
			Class.forName(DRIVER_URL);
//			if(url!=null && username!=null && password!=null)
//				conn=DriverManager.getConnection(url,username,password);
//			else
			conn=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public static int create(Department dept) {
			connect();
			int status=0;
			String query="insert into dept(ID,NAME,SALARY,COMMISSION,ROLE,DEPT_NO) values(?,?,?,?,?,?)";
			try {
				pstm=conn.prepareStatement(query);
				pstm.setInt(1, dept.getId());
				pstm.setString(2,dept.getName());
				pstm.setFloat(3, dept.getSalary());
				pstm.setFloat(4, dept.getCommission());
				pstm.setString(5,dept.getRole());
				pstm.setInt(6,dept.getDept_no());
				status=pstm.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}
		public static int update(int id,Department dept) {
			
			connect();
			int status=0;
			String query="update dept set NAME=?,COMMISSION=? where ID=?";
			try {
				pstm=conn.prepareStatement(query);
				pstm.setString(1, dept.getName());
				pstm.setFloat(2, dept.getCommission());
				pstm.setInt(3, id);
				status=pstm.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}
		public static int delete(int id) {
			connect();
			int status=0;
			String query="delete from dept where ID=+"+id;
			try {
				stm=conn.createStatement();
				status=stm.executeUpdate(query);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return status;
		}
		public static void readall() {
			connect();
			String query = "select * from dept";
			try {
				stm = conn.createStatement();
				rs = stm.executeQuery(query);
				System.out.println("ID \t NAME \t SALARY\t COMMISSION ROLE DEPTNO");
				while(rs.next()) {
					System.out.println(rs.getInt("ID")+"\t "+rs.getString("NAME")+"\t "+rs.getFloat("SALARY")+"\t "+rs.getFloat("COMMISSION")+"\t "+rs.getString("ROLE")+"\t "+rs.getInt("DEPT_NO")+"\t ");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public static void readone(int id) {
			connect();
			int status=0;
			String query="select * from dept where ID="+id;
			try {
				stm=conn.createStatement();
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
		
		

}
