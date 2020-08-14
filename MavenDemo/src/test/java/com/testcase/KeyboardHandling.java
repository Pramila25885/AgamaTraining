package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("password123").perform();
		action.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.id("pass")).sendKeys("password123");
		
		
		
		
	}

}
