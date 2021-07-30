package com.lms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testing {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Browser.Driver();
		Browser.Relative("//input[@placeholder='Email']").clear();
		Browser.Relative("//input[@placeholder='Password']").clear();
		Thread.sleep(2000);
		Browser.Relative("//input[@placeholder='Email']").sendKeys("amey.bapat@gipl.com");
		Browser.Relative("//input[@placeholder='Password']").sendKeys("Abc12345");
		Thread.sleep(2000);
		Browser.Relative("//button[@class='login100-form-btn button100']").click();
		Thread.sleep(5000);
		//logout
		driver.findElement(By.xpath("//p[contains(text(),'Logout')]")).click();
	}
	
	
}
