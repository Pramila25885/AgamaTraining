package com.testcase;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMytrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click on Flight
		driver.findElement(By.xpath("//*[@id=\'SW\']/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[2]")).click();
		Thread.sleep(8000);
		//Click on From
		WebElement element =driver.findElement(By.xpath("//*[@id='fromCity']"));
		element.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Chenna");
		Thread.sleep(8000);
	    Actions action= new Actions(driver);
	    action.sendKeys(Keys.ARROW_DOWN).perform();
	    action.sendKeys(Keys.ENTER).perform();
	    //action.moveToElement(driver.findElement(By.xpath("//p[text()='Charlotte, United States']"))).click().build().perform();
	    //Click on To   
	    driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("bengaluru");
	    Thread.sleep(5000);
	    action.moveToElement(driver.findElement(By.xpath("//p[@class='font12 greyText appendBottom3']"))).click().build().perform();
		//Departure date  aug 31
	    driver.findElement(By.xpath("//div[@class='dateInnerCell']//following::p[text()='31']")).click();
		//Click on return
	    driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10' and text()='RETURN']")).click();
		//click on right arrow  
	    driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		//Click on Oct30
	    driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[6]/div/p")).click();
		//click on search
	    driver.findElement(By.xpath("//a[text()='Search']")).click();
	    //Click on Book
	    driver.findElement(By.xpath("//*[text()='Book Now']")).click();
	    
	    //Switch to windows
	     Set<String>allwindow =driver.getWindowHandles();
	     for(String newwindow: allwindow) {
	    	 driver.switchTo().window(newwindow);
	     }
	    driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    
	    //TakeScreenShot
	    TakesScreenshot ts= (TakesScreenshot)driver;
	    File picture= ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(picture, new File(("src/test/resources/Screenshot/MakeMyTrip.Png")));
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //get values
	   // List<WebElement> values=driver.findElements(By.className("actual-price"));
	    //System.out.println(values.size());
	   // System.out.println(values);
	    
	   
	  //click to ascending by price
	  		//driver.findElement(By.xpath("//div[@id=\'sorting-togglers\']/div[5]/span[@class= \'pointer\']/span[1]")).click();
	  		//click on flight details
   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		//	List<WebElement> Cities= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div/p/span[1]"));
		//System.out.println(Cities.size());
		
		
		

	


		
		
		
		
		
		
		
		
		
	}

}
