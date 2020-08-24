package practicetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriverManager.chromedriver().setup();	
	WebDriver driver= new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://phptravels.com/demo");
	
	//followingSyntax://tagname[@attribute='value']//following::tagname of the required element[number to select that element]
	//clicks on demo from phptravels logo
	driver.findElement(By.xpath("//a[@class='yx-n_j']//following::a[1]")).click();		
	Thread.sleep(5000);
	//Preceding
	//Click on Pricing from product
	driver.findElement(By.xpath("//*[@class='reset yx-njm js-mega-nav__control js-tab-focus']//preceding::a[1]")).click();	
	//Ancestor
	//descendant
	//Parent
	//Child
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
