package com.stud;

public class Student{
	int roll_no;
	private int English=23;
	protected int Marks=0;
	public int Hindi=99;
	protected int maths=44;
public void getStudentMarks(int roll_no) {
		this.roll_no=roll_no;
		System.out.println(roll_no);
		if(roll_no==23) {
		Marks=Marks+Hindi+maths+English;
		System.out.println(Marks);
		}
//		System.out.println(name);
//		System.out.println(Marks);
		
	}

 
}
