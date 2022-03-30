package com.Day4;

public class AutoClosableDemo implements AutoCloseable{
	public void closeable() {
        throw new RuntimeException("Closable method");
    }

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		throw new ArithmeticException("Exception caught in close()");
		
	}
public static void main(String[] args) throws Exception {
	try {
		AutoClosableDemo ac=new AutoClosableDemo();
		ac.closeable();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
