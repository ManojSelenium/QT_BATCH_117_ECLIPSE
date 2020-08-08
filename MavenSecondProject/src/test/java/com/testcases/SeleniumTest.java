package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {


	WebDriver driver; //null //instance varaible

	@Test
	public void createAccountTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\NewChrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		maxmizeBrowser();
		enterURL("http://automationpractice.com/index.php");
		//Click on Signin link
		click(By.xpath("//a[@class='login']"));
		closeBrowser();
		
	}
	
	@Test
	public void editAccountTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\NewChrome\\chromedriver.exe");
		driver=new ChromeDriver();
		maxmizeBrowser();
		enterURL("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		enterText(By.id("email_create"), "zkjhfj@gmail.com");
		//Click on Create An Account button
		click(By.id("SubmitCreate"));
		closeBrowser();
		
	}
	
	
	
	
	public void enterURL(String url) {
	driver.get(url);	
	}
	public void maxmizeBrowser() {
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		//driver.quit();
	}
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
	//	browser.identify(prop).enter(testData);
	}
}
