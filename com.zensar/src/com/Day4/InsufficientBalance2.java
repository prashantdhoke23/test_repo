package com.Day4;

public class InsufficientBalance2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int newbalance=0;

		if(newbalance<=0) {
			try {
			
			throw new InsufficientBalanceException(); //calls custom InvalidException 
		}
			catch(InsufficientBalanceException e) {
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("Available balance : " +newbalance);
		}
	}

}
