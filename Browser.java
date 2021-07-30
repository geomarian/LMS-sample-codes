package com.lms1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Browser {
	
	public static WebDriver driver;
	public static String s="/html[1]/body[1]/app-root[1]/";//xpath
	@Test
	public static WebDriver Driver() throws InterruptedException
	{
		//Will open Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\lms\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://uatlms.seesales.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Implicit Timeout Executed");
		return driver;
	}
		public  static WebDriver WaitForElementToBeClickable(WebElement element,long timeInSec)
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			System.out.println("Explicit Timeout started");
			wait.until(ExpectedConditions.elementToBeClickable(Browser.Abs(User.Cxpath+"[1]/div[3]/button[1]"))).click();
			//wait.until(ExpectedConditions.alertIsPresent(Browser.Abs(User."path+[4]").click();
			
	
		return driver;
		//Will open Firefox browser
	/*	System.setProperty("webdriver.gecko.driver","E:\\eclipse1\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
		driver = new FirefoxDriver();
		
		 //Will open Microsoft Edge browser
		System.setProperty("webdriver.edge.driver","E:\\eclipse1\\MicrosoftWebDriver.exe");			
		driver = new EdgeDriver();
}*/
		}
	public static WebElement Relative(String abc) {
		WebElement a=driver.findElement(By.xpath(abc));
		return a;
	}
	
	public static WebElement Abs(String pqr)
	{
		WebElement b =driver.findElement(By.xpath(pqr));
		return b;	
	}
}