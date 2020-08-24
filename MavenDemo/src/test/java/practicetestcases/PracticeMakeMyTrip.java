package practicetestcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
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
		
		Actions action= new Actions(driver);
		List<WebElement> cities= driver.findElements(By.xpath("//input[@id='fromCity']//following::div[@id='react-autowhatever-1']"));
		for(WebElement places: cities) {
			String str= places.getText();
			System.out.println(str);
			
			//if(str.equalsIgnoreCase(element.sendKeys("Chennai"))) {
				action.sendKeys(Keys.ENTER).perform();
			}
		}
		
		
		
	}


