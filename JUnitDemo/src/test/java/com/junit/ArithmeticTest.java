package com.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.zensar.Arithmetic;

public class ArithmeticTest {
	
	Arithmetic a2=null;
	
	@BeforeClass
	public static void beforeClass() {
	 System.out.println("Inside Before Class");	
	}
	
	@Before
	public void before() {
		this.a2=new Arithmetic();
	}
	@After
	public void after() {
		this.a2=new Arithmetic();
	}
	@AfterClass
	public static void aftereClass() {
		 System.out.println("Inside After Class");	
	}
	@Test
	@Ignore("Not ready to execute")
	public void testAdd() {
		assertEquals(a2.add(5, 10), 15);
	}
	@Test(timeout = 1000)
	public void testAdd2() {
	
		assertEquals(a2.add(12, 10), 22);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideException() {
		assertEquals(a2.add(10, 0), 2);
	}
}
