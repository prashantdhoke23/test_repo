package com.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, ArithmeticParamterizedTest.class, ArithmeticTest.class }) //Runnning all test cases in one test suite class
public class ArithTestSuite {

}
