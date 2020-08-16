package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait for 30 seconds.
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.accept();
		Thread.sleep(5000);
		//alert.dismiss();
		//alert.sendKeys("ABC");
		
		
		
		
		
		
		
		
	}

}
