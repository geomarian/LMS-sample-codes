package com.lms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {
	public static WebDriver driver;
	//private static String s = "//div[3]//div[1]//ngb-timepicker[1]//fieldset[1]//div[1]";
	public static String s ="/html[1]/body[1]/ngb-modal-window[1]";
	//public static String s1 = "/html[1]/body[1]/ngb-modal-window[1]";
	public static String s3="/html[1]/body[1]/app-root[1]/";
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\workspace\\lms\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("http://uatlms.seesales.in/");
		    login();
		   AddAdjustment();
		    Adjustment();
		   
		    /*
			Relative("//input[@placeholder='Email']").sendKeys("amey.bapat@gadreinfotech.com");
			Relative("//input[@placeholder='Password']").sendKeys("Abc12345");
			Thread.sleep(2000);
			Relative("//button[@class='login100-form-btn button100']").click();
			Thread.sleep(5000);*/
			
			
			
		//	Thread.sleep(2000);
		
			
		}
		
		
		private static void Adjustment() throws InterruptedException {
			driver.get("http://uatlms.seesales.in/#/app/adjustmentrequest");
			//filter Adjustment
			//Filter date selection
			Thread.sleep(4000);
			System.out.println("Page open");
			String s2="app-main[1]/div[1]/div[1]/div[1]/app-adjustment-request[1]/div[1]/div[1]/div[1]/";
			Abs(s3+s2+"div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]").sendKeys("01-Jan-2020");
			Thread.sleep(2000);
			Abs(s3+s2+"div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]").sendKeys("29-Feb-2020");
			Thread.sleep(2000);
			//status
			String[] status={" All "," Requested "," Approved "," Rejected "," Cancel "};
			for(int i=0; i<status.length; i++)
			{
				Abs(s3+s2+"div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/select[1]").sendKeys(status[i]);
				Thread.sleep(2000);
				System.out.println(status[i]);
				//filter
				Abs(s3+s2+"div[1]/div[1]/form[1]/div[1]/div[4]/button[1]").click();
				Thread.sleep(3000);
			}
			
			//Refresh
			Abs(s3+s2+"div[1]/div[2]/button[1]").click();
			Thread.sleep(2000);
			
			//
			String[] ss={"10","25","50","100"};
			for(int i=0; i<ss.length; i++)
			{
				Abs(s3+s2+"div[2]/div[1]/div[1]/label[1]/select[1]").sendKeys(ss[i]);
				Thread.sleep(2000);
			}		
	}


		private static void login() throws InterruptedException {
			String s="/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/form[1]/div";
		// TODO Auto-generated method stub
			Abs(s+"[1]/input[1]").sendKeys("vaibhav.gogate@gipl.com");
			Abs(s+"[2]/input[1]").sendKeys("Abc12345");
	//		Thread.sleep(2000);
			Abs(s+"[4]/button[1]").click();
			Thread.sleep(5000);
	}


		private static void AddAdjustment() throws InterruptedException {
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("http://uatlms.seesales.in/#/app/adjustmentrequest");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-adjustment-request[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
			Thread.sleep(1000);
			System.out.print("Select Emp from dropdown");
			
				String[] status1={" Avinash Pendse "," Vaibhav Gogate ", "Ameya Joshi"," Pranita Jadhav ", "Amey Bapat","Tanvi Surve","Anupam Modak","Anuj Devasthali"};
			for(int j=0; j<status1.length; j++)
				{
					Abs(s+"/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/select[1]").sendKeys(status1[j]);
				Thread.sleep(2000);
					
				}
					
					
					System.out.println("user dropdown selection");
					String s1="//div[3]//div[1]//ngb-timepicker[1]//fieldset[1]//div[1]";
					Thread.sleep(1000);
					String s2="//div[4]//div[1]//ngb-timepicker[1]//fieldset[1]//div[1]";
					Thread.sleep(1000);
					Relative1(s1+"//div[1]//input[1]").clear();
					Relative1(s1+"//div[1]//input[1]").sendKeys("10");
					Thread.sleep(1000);
					Relative1(s1+"//div[3]//input[1]").clear();
					Relative1(s1+"//div[3]//input[1]").sendKeys("15");
					Thread.sleep(1000);
					Relative2(s2+"//div[1]//input[1]").clear();
					Relative2(s2+"//div[1]//input[1]").sendKeys("14");
					Thread.sleep(1000);
					Relative2(s2+"//div[3]//input[1]").clear();
					Relative2(s2+"//div[3]//input[1]").sendKeys("15");
					Thread.sleep(1000);
					
					
					
					System.out.print("Select Reason from dropdown");
					
					String[] status2={" Emergency "," Family program ", " Kindly adjust "," Missed Punch "};
				for(int i=0; i<status2.length; i++)
					{
					Abs(s+"/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/select[1]").sendKeys(status2[i]);
					Abs(s+"/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/select[1]").click();
						Thread.sleep(3000);
						System.out.print("reason selected");
					}
				Abs(s+"/div[1]/div[1]/div[2]/form[1]/div[3]/button[2]").click();
					
				Thread.sleep(3000);
					
							
		
		
	
		}

/*		public static WebElement Relative(String abc) {
			WebElement a=driver.findElement(By.xpath(abc));
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(abc)));
			return a;
		}
		*/
		
		public static WebElement Abs(String p)
		{
			WebElement b=driver.findElement(By.xpath(p));
			
			return b;
			
		}

	public static WebElement Relative1(String s1)
	{
		WebElement s=driver.findElement(By.xpath(s1));
		
		return s;
	}

	public static WebElement Relative2(String s2)
	{
		WebElement s=driver.findElement(By.xpath(s2));
		
		return s;
	}
}