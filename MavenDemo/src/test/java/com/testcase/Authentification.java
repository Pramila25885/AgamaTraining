package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentification {
	
	@Test
	public void actionOn() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait for 30 seconds.
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
