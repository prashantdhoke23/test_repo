package com.Day5;

import java.io.File;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) throws IOException{
	File file=new File("C:\\data\\ExceptionFile\\Textt.txt"); 
	System.out.println(file.isFile()); //checking whether is created or not
	System.out.println(file.canRead()); //checking we can read the file or not 
	System.out.println(file.canWrite()); //checking we can write the file or not
	File file1=new File("C:\\data\\ExceptionFile\\newfile.txt"); 
	System.out.println(file1.createNewFile()); //creating a new file in the given location
	
}
}
