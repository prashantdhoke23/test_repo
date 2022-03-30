package com.Day10;

import java.util.function.BiFunction;

class Arithmetic{
	 public static int add(int a,int b) {
		 return a+b;
	 }
}
public class MethodReference3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> n =Arithmetic::add;
		int result=n.apply(10, 20);
		System.out.println(result);
	}

}
