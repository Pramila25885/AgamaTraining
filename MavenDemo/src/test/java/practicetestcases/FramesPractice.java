package practicetestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		// to find number of frames in a webpage
		List<WebElement> frames = driver.findElements(By.xpath("//*[starts-with(@id,'frame')]"));
		System.out.println(frames);
		int number = frames.size();
		System.out.println(number);

		// Switch to first frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("First Frame");
		Thread.sleep(5000);

		// switch to frame3 which is inside frame1
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		Thread.sleep(3000);

		// switch to parent frame//to move from frame3 to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Parent Frame");
		Thread.sleep(3000);

		// switch to frame2 which is on the webpage
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("frame2");
		Select animals = new Select(driver.findElement(By.xpath("//*[@id='animals']")));
		animals.selectByVisibleText("Baby Cat");

	}

}
