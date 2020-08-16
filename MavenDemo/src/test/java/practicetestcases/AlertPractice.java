package practicetestcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		Thread.sleep(5000);
		// Simple Alert
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println("Actual alert message is: " + simpleAlert);
		driver.switchTo().alert().accept();
		// Confirmation Alert
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		String confirmationAlert = driver.switchTo().alert().getText();
		System.out.println("Actual confirmation alert message is: " + confirmationAlert);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		// Prompt Alert
		driver.findElement(By.xpath("//*[@name='prompt']")).click();
		Alert alert = driver.switchTo().alert();
		String promptAlert = alert.getText();
		System.out.println("Actual Prompt alert message is: " + promptAlert);
		alert.sendKeys("Hi");
		// driver.switchTo().alert().sendKeys("Hi");
		Thread.sleep(5000);
		alert.accept();
		// Mouse hover
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[text()='Sub Menu [Hover On Me]']")));
		action.moveToElement(driver.findElement(By.xpath("//*[text()='CherCher Tech']"))).click().build().perform();
		// navigate
		Thread.sleep(3000);
		driver.navigate().back();
		action.moveToElement(driver.findElement(By.xpath("//*[@id='double-click' and @value='Double Click Me']")))
				.doubleClick().build().perform();
		Thread.sleep(3000);
		String doubleclick = driver.switchTo().alert().getText();
		System.out.println("Double click: " + doubleclick);
		driver.switchTo().alert().accept();

	}

}
