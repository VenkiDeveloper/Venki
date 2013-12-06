package com.wqba.samplemaven.Zillow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZillowHomePage {

	WebDriver driver;
	
	public ZillowHomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String logo(){
		
		WebElement logo = driver.findElement(By.cssSelector("a[title*='Zillow Real Estate']"));
		String text = logo.getAttribute("title");
		return text;
	}
	
	public String homePage(){
		
		return driver.getTitle();
	}
	
}
