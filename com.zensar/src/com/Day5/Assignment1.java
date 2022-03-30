package com.Day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Assignment1 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\data\\ExceptionFile\\newfile.txt"));
		Employee emp=(Employee)ois.readObject();
		System.out.println(emp);//Printing contents of object stored in file newfile
		
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\data\\ExceptionFile\\Assignment1.txt"));
		Employee emp1 = emp; //copying content of emp to emp1
		obj.writeObject(emp1); //wrtining content of emp1 in Assignment1
		System.out.println(emp1); //Printing contents of object stored in file Assignment1
	}

}
