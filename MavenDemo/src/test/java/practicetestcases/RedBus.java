package practicetestcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        Thread.sleep(3000);
        Actions action= new Actions(driver);
        action.sendKeys(Keys.ESCAPE).build().perform();
        Thread.sleep(6000);
        //To enter chennai
     driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chenn");
        Thread.sleep(3000);
     
     action.sendKeys(Keys.ARROW_DOWN).build().perform();
     action.sendKeys(Keys.ARROW_DOWN).build().perform(); 
     action.sendKeys(Keys.ARROW_DOWN).click().build().perform();  
        
     //To enter destination
     driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("sale");
     Thread.sleep(3000);
     action.sendKeys(Keys.ARROW_DOWN).click().build().perform();  
        
     //To enter date
     driver.findElement(By.xpath("//input[@readonly='readonly']")).click();
     driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")).click();
     driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")).click();   
        
     TakesScreenshot ts = (TakesScreenshot)driver;
     File source = ts.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(source, new File("src/test/resources/Screenshot/RedBus.png"));
     
     
    driver.findElement(By.xpath("//*[@id='search_btn']")).click();
   
        
	}

}
