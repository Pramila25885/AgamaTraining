package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
@Test
public void actionOn() {
	// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait for 30 seconds.
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			
			WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement droppable= driver.findElement(By.xpath("//div[@id='droppable']"));
			Actions action= new Actions(driver);
			action.dragAndDrop(drag, droppable).build().perform();
			
			
			
}
	
	
	
	
	
	
}
