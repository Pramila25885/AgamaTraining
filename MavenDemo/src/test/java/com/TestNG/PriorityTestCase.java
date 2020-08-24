package com.TestNG;

import org.testng.annotations.Test;

public class PriorityTestCase {
@Test(priority=3)
public void TestCase1(){
	System.out.println("testcase1");
}
@Test(priority=1)
public void TestCase2(){
	System.out.println("testcase2");
}	
@Test(priority=2)
public void TestCase3(){
	System.out.println("testcase3");
}	
	
	
	
	
	
	
	
	
}
