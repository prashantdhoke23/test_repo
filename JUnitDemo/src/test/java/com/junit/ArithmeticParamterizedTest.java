package com.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.zensar.Arithmetic;

@RunWith(Parameterized.class)
public class ArithmeticParamterizedTest {
	
	int x;
	int y;
	
	public ArithmeticParamterizedTest(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Parameters
	public static Collection testData(){
		Collection col=Arrays.asList(new Object [][]{{12,22},{10,90},{34,56},{67,9}});
		return col;
		
	}
	@Test
	public void test() {
		Arithmetic a=new Arithmetic();
		assertEquals(a.add(x, y),(x+y));
	}

}
