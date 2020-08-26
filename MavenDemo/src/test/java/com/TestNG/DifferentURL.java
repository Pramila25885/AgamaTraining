package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentURL {
	WebDriverWait wait;
WebDriver driver;

@BeforeTest
	@Parameters("UrlName")
	public void setup(String UrlName){
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 System.out.println(UrlName);
		if(UrlName.equalsIgnoreCase("facebook")){
			driver.get("https://www.facebook.com/");
		}
		else if (UrlName.equalsIgnoreCase("orangeHRM")){
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		
	}
	@Test
	public void facebook(){
		

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aaaa");
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		}
	@Test
	public void orangeHRM(){
		
		
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Submit' and @id='btnLogin']")));
		//driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
	}
		
	@AfterTest
	public void tearDown() {
		//driver.close();
	}
}
