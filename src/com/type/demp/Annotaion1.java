package com.type.demp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaion1 {

	static{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	WebDriver driver=null;
	
	@BeforeMethod
	public void setup(){
		driver=new ChromeDriver();
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	@Test
	public void tc_02() throws InterruptedException{
		driver.get("https://selenium.dev/");
		Thread.sleep(3000);	
	}
	@Test
	public void tc_01() throws InterruptedException{
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);	
	}
}
