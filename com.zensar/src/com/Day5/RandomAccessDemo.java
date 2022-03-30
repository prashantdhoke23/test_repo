package com.Day5;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\data\\ExceptionFile\\newfilee.txt");
	f.createNewFile();
	RandomAccessFile raf=new RandomAccessFile(f, "rw");
	raf.writeChars("Some inputs of RandomAcessDemo");
	System.out.println("Completed Successfully");
	StringBuffer buf=new StringBuffer();
	while(raf.getFilePointer()<raf.length()) {
		buf.append(raf.readLine()+System.lineSeparator());
	}
	String contents=buf.toString();
	System.out.println("Contents of the  file \n"+contents);
}
}
