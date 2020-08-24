package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DependsUponGroup {
	@Test(groups = {"smoke testing","Regression testing"})
	public void TestCase1(){
		System.out.println("testcase1");
	}
	@Test(groups = {"smoke testing","Sanity testing"})
	public void TestCase2(){
		System.out.println("testcase2");
	}	
	@Test(groups = {"functional testing","retesting"})
	public void TestCase3(){
		System.out.println("testcase3");
	}	
	
	
//  @Test
//  public void f() {
//  }
//  @BeforeMethod
//  public void beforeMethod() {
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }

}
