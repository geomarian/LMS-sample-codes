package com.lms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element {
	public static WebDriver driver;
	public static WebElement Relative(String abc) {
		WebElement a=driver.findElement(By.xpath(abc));
		return a;
	}
	
	public static WebElement Abs(String pqr)
	{
		WebElement b=driver.findElement(By.xpath(pqr));
		return b;
		
	}
}
