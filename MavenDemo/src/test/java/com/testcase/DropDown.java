package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendra\\SeleniumJarFiles\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait for 30 seconds.
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[contains(@name,'Username')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit' and @id='btnLogin']")).click();

		// click Admin
		driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();

		// select dropdown
		Select userRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		userRole.selectByVisibleText("ESS");

		Select status = new Select(driver.findElement(By.xpath("//*[@id=\'searchSystemUser_status\']")));
		status.selectByIndex(2);

		// driver.close();

		// driver.quit();
	}

}
