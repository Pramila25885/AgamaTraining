package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void LaunchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void Login() {
		driver.findElement(By.xpath("//input[contains(@name,'Username')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("admin123");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Submit' and @id='btnLogin']")));
		// driver.findElement(By.xpath("//input[@name='Submit' and
		// @id='btnLogin']")).click();
	}

	@AfterMethod
	public void CloseApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
