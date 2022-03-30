package com.Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeSerializationDemo {
	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
		//FileOutputStream fos = new FileOutputStream("C:\\data\\ExceptionFile\\newfile.txt");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\data\\ExceptionFile\\newfile.txt"));
		Employee emp=(Employee)ois.readObject();
		System.out.println(emp);
		
		
	}

}
