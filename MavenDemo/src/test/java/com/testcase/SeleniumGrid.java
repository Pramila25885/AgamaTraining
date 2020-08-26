package com.testcase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGrid {


		WebDriver driver;
		String baseurl, nodeurl;
		@BeforeTest
		public void setup() throws MalformedURLException
		{
		baseurl="http://facebook.com/";
		nodeurl="http://192.168.0.56:5506/wd/hub";// in node url put port and ip address of node system
		DesiredCapabilities capablity = DesiredCapabilities.firefox();
		capablity.setBrowserName("Chrome");
		capablity.setPlatform(Platform.WINDOWS);// node OS
		driver =new RemoteWebDriver(new URL(nodeurl),capablity);
		}
		@AfterTest
		public void aftertest()
		{
		driver.quit();
		}
		@Test
		public void simpletest(){
		driver.get(baseurl);
		String a= driver.getTitle();
		System.out.println("title of the page:"+a);
		}
		}

