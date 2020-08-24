package com.TestNG;

import org.testng.annotations.Test;

import com.testcase.WrapperMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Flipcart {
	WrapperMethod obj = new WrapperMethod();

	@BeforeTest
	public void InvokeApp() throws InterruptedException {
		obj.insertapp("https://www.flipkart.com/");
		obj.waittime(5000);
	}

	@Test
	public void search() throws InterruptedException {
		obj.clickbyxpath("//input[@name='q']");
		obj.enterbyxpath("//input[@name='q']", "TV");
		obj.clickbyxpath("//input[@name='q']//following::button[1]");
		
	}

	@Test(dependsOnMethods = "search")
	public void SelectProduct() throws InterruptedException {
		obj.clickbyxpath("//div[text()='Mi 4X 108 cm (43) Ultra HD (4K) LED Smart Android TV']");
		// Switch to next Window
		
		obj.waittime(5000);

	}

	@Test
	public void addToCart() throws InterruptedException {
		obj.waittime(5000);
		//obj.switchToNewWindow();
		//obj.clickbyxpath("//*[@id=\'container\']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
		
		
	}

	@AfterTest
	public void afterMethod() {
		obj.closeapp();
	}
}

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
//
//  @BeforeSuite
//  public void beforeSuite() {
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//  }
//
//}
