package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLogin {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//WebDriverManager.iedriver().setup();
        //WebDriver driver= new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        Thread.sleep(60000);
        //System.out.println(driver.getTitle());
		
        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.className("button")).click();
		
		//Xpath
        driver.findElement(By.xpath("//input[contains(@name,'Username')]")).sendKeys("Admin");
      driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("admin123");
      driver.findElement(By.xpath("//input[@name='Submit' and @id='btnLogin']")).click();
       
       
      //Submit name
      //btnLogin id
        
	}

}
