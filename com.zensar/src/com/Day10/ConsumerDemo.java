package com.Day10;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> cnsumer=(n)->System.out.println(n);
		cnsumer.accept(5);
	}

}
