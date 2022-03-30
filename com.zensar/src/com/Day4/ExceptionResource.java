package com.Day4;

import java.io.FileOutputStream;

public class ExceptionResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fileOutputStream =new FileOutputStream("C:\\data\\ExceptionFile/Textt.txt")){      
			String msg = "Welcome to java !";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			fileOutputStream.write(byteArray);  
			System.out.println("Message written to file successfuly!");      
			}catch(Exception exception){  
			       System.out.println(exception);  
			}      
	}
}
