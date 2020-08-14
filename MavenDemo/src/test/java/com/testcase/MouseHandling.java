package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[contains(@name,'Username')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit' and @id='btnLogin']")).click();

		WebElement admin = driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
		WebElement qualification = driver.findElement(By.id("menu_admin_Qualifications"));
		WebElement languages = driver.findElement(By.id("menu_admin_viewLanguages"));
		Actions action= new Actions(driver);
		action.moveToElement(admin).perform();
		action.moveToElement(qualification).perform();
		action.moveToElement(languages).click().build().perform();
		
		
		
		
		
		
		
		
		
		

	}

}
