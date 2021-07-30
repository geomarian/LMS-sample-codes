package com.lms1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Supervisor{
	public static int i=0;
	public static WebDriver driver;	
	public static void Login() throws InterruptedException, AWTException{
		Login.L1("vaibhav.gogate@gipl.com","Abc12345");
		Supervisor s= new Supervisor();
//		User.Initial();
	//	ManageAdjustment();
		s.ManageAttendance();
		s.AllAttendance();
		User.Logout();
	}
	
private  void AllAttendance() throws InterruptedException {
		// TODO Auto-generated method stub
		Browser.Relative("//p[contains(text(),'All Attendance')]").click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)Browser.driver;
		jse.executeScript("window.scrollBy(0,300)");
		
	}

/*	private static void AddAdjustment() throws InterruptedException {
		System.out.print(driver);
		driver.get("http://uatlms.seesales.in/#/app/adjustmentrequest");
		Thread.sleep(3000);
		Browser.Abs(Login.MainFrame+"app-main[1]/div[1]/div[1]/div[1]/app-adjustment-request[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]").click();
		Thread.sleep(1000);
		System.out.print("Select Emp from dropdown");
		
		String[] status1={" Avinash Pendse "," Vaibhav Gogate ", "Ameya Joshi"," Pranita Jadhav ", "Amey Bapat","Tanvi Surve","Anupam Modak","Anuj Devasthali"};
		for(int j=0; j<status1.length; j++)
		{
			Browser.Abs(Login.DialogBox+"div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/select[1]").sendKeys(status1[j]);
			Thread.sleep(2000);	
		}
				
				
				System.out.println("user dropdown selection");
				String s1="//div[3]//div[1]//ngb-timepicker[1]//fieldset[1]//div[1]";
				Thread.sleep(1000);
				String s2="//div[4]//div[1]//ngb-timepicker[1]//fieldset[1]//div[1]";
				Thread.sleep(1000);
				Browser.Relative(s1+"//div[1]//input[1]").clear();
				Browser.Relative(s1+"//div[1]//input[1]").sendKeys("10");
				Thread.sleep(1000);
				Browser.Relative(s1+"//div[3]//input[1]").clear();
				Browser.Relative(s1+"//div[3]//input[1]").sendKeys("15");
				Thread.sleep(1000);
				Browser.Relative(s2+"//div[1]//input[1]").clear();
				Browser.Relative(s2+"//div[1]//input[1]").sendKeys("14");
				Thread.sleep(1000);
				Browser.Relative(s2+"//div[3]//input[1]").clear();
				Browser.Relative(s2+"//div[3]//input[1]").sendKeys("15");
				Thread.sleep(1000);
				
				
				
				System.out.print("Select Reason from dropdown");
				
				String[] status2={" Emergency "," Family program ", " Kindly adjust "," Missed Punch "};
			for(int i=0; i<status2.length; i++)
				{
				Browser.Abs(Login.DialogBox+"div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/select[1]").sendKeys(status2[i]);
				Browser.Abs(Login.DialogBox+"div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/select[1]").click();
					Thread.sleep(3000);
					System.out.print("reason selected");
				}
			Browser.Abs(Login.DialogBox+"div[1]/div[1]/div[2]/form[1]/div[3]/button[2]").click();
				
			Thread.sleep(3000);
	}
	
	public static void ManageAdjustment() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/adjustmentaction");
		Thread.sleep(3000);
		//filter Adjustment
		//Filter date selection
		String AdjM="app-main[1]/div[1]/div[1]/div[1]/app-adjustment-manage[1]/div[1]/div[1]/div[1]/";//xpath
		Browser.Abs(Login.MainFrame+AdjM+"div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]").sendKeys("01/01/2020");
		Thread.sleep(2000);
		Browser.Abs(Login.MainFrame+AdjM+"div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]").sendKeys("29/02/2020");
		Thread.sleep(2000);
		//status
		Dropdown.Status(AdjM);
		
		//Refresh
		Browser.Abs(Login.MainFrame+AdjM+"div[1]/div[2]/button[1]").click();
		Thread.sleep(2000);
		
		//
		Dropdown.SetPaginationDD(AdjM);
		
		//manage
		Browser.Abs(Login.MainFrame+AdjM+"div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]").click();
		Thread.sleep(2000);
		Browser.Abs(Login.DialogBox+"div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/select[1]").sendKeys("Approved");
		Thread.sleep(2000);
		Browser.Abs(Login.DialogBox+"div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/input[1]").sendKeys("Approved By Automation");
		Thread.sleep(2000);
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[5]").click();
	}
	*/
	
	//Manage Attendance
	
private void ManageAttendance() throws AWTException, InterruptedException {
		
		WebElement element = Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/app-sidebar[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[16]/a[1]/p[1]");
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", element);
		Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/app-sidebar[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[14]/a[1]/p[1]").click();
		sleep();
		Browser.Relative("//button[contains(text(),'Upload Attendance')]").click();
		
		Browser.Relative("//button[contains(text(),'Cancel')]").click();
	
		Browser.Relative("//button[contains(text(),'Upload Attendance')]").click();
		Browser.Relative("//input[@name='file']").sendKeys("D:\\Geo\\Gipl_Final _report_Dec2019.pdf");
		Browser.Relative("//button[contains(text(),'Upload Attendance')]").click();
	    sleep();
		System.out.println("File uploaded successfully");
		Browser.Relative("//button[contains(text(),'Get Conflict')]").click();
		Thread.sleep(1000);
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[2]/button[2]").click();
		sleep();
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor)Browser.driver;
		jse.executeScript("window.scrollBy(0,250)");
		JavascriptExecutor jse1 = (JavascriptExecutor)Browser.driver;
		jse1.executeScript("window.scrollBy(0,250)");
		JavascriptExecutor jse2 = (JavascriptExecutor)Browser.driver;
		jse2.executeScript("window.scrollBy(0,250)");
		Thread.sleep(1000);
		//Scroll Up
		JavascriptExecutor jse3 = (JavascriptExecutor)Browser.driver;
		jse3.executeScript("window.scrollBy(0,-250)");
		JavascriptExecutor jse4 = (JavascriptExecutor)Browser.driver;
		jse4.executeScript("window.scrollBy(0,-250)");
		JavascriptExecutor jse5 = (JavascriptExecutor)Browser.driver;
		jse5.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(1000);
}

private void sleep() 
{
	// TODO Auto-generated method stub
	try {
	    TimeUnit.SECONDS.sleep(20);
	} catch (InterruptedException ie) {
	    Thread.currentThread().interrupt();
	    
	}
}
}