package com.Day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Assignment2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\data\\ExceptionFile\\newfile.txt"));
//		Employee emp=(Employee)ois.readObject();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\data\\ExceptionFile\\newfile.txt"));
		Employee emp=(Employee)ois.readObject();
		System.out.println("Printing Contents in the file: "+emp);
		File f=new File("C:\\data\\ExceptionFile\\newfile.txt");
//		DateFormat sdf= new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
		System.out.println("Printing file name: " +f.getName());
		System.out.println("Printing file path: " +f.getPath());
		System.out.println("Printing file directory is: "+f.isDirectory());
		System.out.println("Printing file size: " +f.length());
		System.out.println("Printing file class: " +f.getClass());
		Path file = Paths.get("C:\\data\\ExceptionFile\\newfile.txt");
		 BasicFileAttributes attr =Files.readAttributes(file, BasicFileAttributes.class);
		System.out.println("Printing date and time: "+attr.lastModifiedTime());
		
	}

}
