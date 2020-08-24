package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

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
        
        Thread.sleep(6000);
        //System.out.println(driver.getTitle());
		
        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.className("button")).click();
		
		//Xpath
        driver.findElement(By.xpath("//input[contains(@name,'Username')]")).sendKeys("Admin");
      driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("admin123");
      driver.findElement(By.xpath("//input[@name='Submit' and @id='btnLogin']")).click();
       
      //click on admin
      driver.findElement(By.xpath("//b[text()='Admin']")).click();
       Actions action= new Actions(driver);
       action.moveToElement(driver.findElement(By.xpath("//a[text()='Configuration']"))).click().build().perform();
      action.moveToElement(driver.findElement(By.xpath("//a[text()='Email Configuration']"))).click().build().perform();
       driver.findElement(By.xpath("//input[@id='editBtn']")).click();
       driver.findElement(By.xpath("//input[@id='emailConfigurationForm_txtMailAddress']")).sendKeys("abcde@gmail.com");
       driver.findElement(By.xpath("//input[@id='editBtn']")).click();
     		
     		//obj.enterbyxpath("//input[@id='emailConfigurationForm_txtMailAddress'] ", "abcde@gmail.com");
     		//obj.clickbyxpath("//input[@id='editBtn'] ");
       
        
	}

}
