package com.wqba.samplemaven.Zillow;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestZillowHomePage {

	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		
		String browser=System.getProperty("browser");
		
		if(browser.equals("firefox")){
			
			driver = new FirefoxDriver();
		}
		else if(browser.equals("chrome")){
			driver = new ChromeDriver();
		}
		else if(browser.equals("ie")){
			driver = new InternetExplorerDriver();
		}
		else{
			driver = new HtmlUnitDriver();
		}
		
		
		driver.get("http://www.zillow.com/");
	}
	
	@Test
	public void testLogoTitle(){
		 
		
		ZillowHomePage hp = new ZillowHomePage(driver);
        String actualText = hp.logo();
        Assert.assertEquals(actualText, "Zillow Real Estate");
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		driver.close();
	}
}
