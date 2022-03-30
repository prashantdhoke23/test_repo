package com.Day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SerializationDEmo {
public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
	//FileOutputStream fos = new FileOutputStream("C:\\data\\ExceptionFile\\newfile.txt");
	ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\data\\ExceptionFile\\newfile.txt"));
	Employee emp = new Employee(12,"Satyam",1000.5f,"PANhgf44");
	DateFormat sdf= new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
	obj.writeObject(emp);
	System.out.println(emp);
	System.out.println("Serialization completed");
}
}
