package practicetestcases;

import org.testng.annotations.Test;

import com.testcase.WrapperMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OrangeHrmTestNG {
	// WebDriver driver;
	WrapperMethod obj = new WrapperMethod();

	@BeforeTest
	public void InvokeApp() {
		obj.insertapp("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void Login() {
		obj.enterbyxpath("//input[contains(@name,'Username')]", "Admin");
		obj.enterbyxpath("//input[contains(@id,'Password')]", "admin123");
		obj.clickbyxpath("//input[@name='Submit' and @id='btnLogin']");

	}

	@Test(dependsOnMethods = "Login")
	public void Configuration() {
		// System.out.println("hi");
		obj.clickbyxpath("//b[text()='Admin']");
		obj.moveToElementUsingXpath("//a[text()='Configuration']");
		obj.moveToElementUsingXpath("//a[text()='Email Configuration']");
		obj.clickbyxpath("//input[@id='editBtn'] ");
		obj.enterbyxpath("//input[@id='emailConfigurationForm_txtMailAddress'] ", "abcde@gmail.com");

	}

	@AfterTest
	public void CloseApp() throws InterruptedException {
		obj.waittime(5000);
		obj.closeapp();
	}

}



//List<WebElement> elements = driver.findElements(By.name("name"));
//System.out.println("Number of elements:" +elements.size());
//
//for (int i=0; i<elements.size();i++){
//  System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
//}
//
//
//
//
