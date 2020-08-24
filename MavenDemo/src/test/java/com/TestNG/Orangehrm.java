package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm {
	WebDriver driver;

	@BeforeMethod
	public void LaunchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void Login() {
		driver.findElement(By.xpath("//input[contains(@name,'Username')]")).sendKeys("Admin");
	      driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("admin123");
	      driver.findElement(By.xpath("//input[@name='Submit' and @id='btnLogin']")).click();
	}

	@AfterMethod
	public void CloseApp() {
		driver.close();
	}
}
