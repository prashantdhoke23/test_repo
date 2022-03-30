package com.Day4;

public class InvalidExceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Age is invalid";
	}
}
