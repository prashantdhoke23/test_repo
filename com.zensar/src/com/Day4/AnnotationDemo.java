package com.Day4;

import java.sql.Date;

public class AnnotationDemo {
	@MyAnnotation
	private int id;
	private static String name;
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
	//parameterized annotation and buli in annotations
	@Override
	public String toString() {
		return "AnnotationDemo [id=" + id + ", name=" + name + "]";
	}
	//parameterized annotation and bulit-in annotations
	@SuppressWarnings({ "unused" })
	@Deprecated //This annotation is used 
	public static void main(String[] args) {
		AnnotationDemo obj=new AnnotationDemo();
		obj.toString();
		int  a=20;//By supress warning to main
		int b=45;
		Date today=new Date(122, 1, 14); //By supress warning to main
		
	}

}
