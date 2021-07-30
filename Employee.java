package com.lms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Employee {

	public static int i=0;
	public static WebDriver driver;
	public static String Rel="//p[contains(text(),";
	@Test
	public static void Login() throws InterruptedException{
		Login.L1("amey.bapat@gipl.com", "Abc12345");
		User.Initial();
		User.Logout();
	}
	
	//Leave
	@Test
	public static void Leave() throws InterruptedException
	{
		Browser.Relative("//li[2]//a[1]//p[1]");
			System.out.println("Test");
			Thread.sleep(15000);
			//filter leave
			//Filter date selection
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("02/22/2020");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("02/22/2020");
			Thread.sleep(2000);
			//status
			String[] status={" All "," Requested "," Approved "," Rejected "," Cancel "};
			for(int i=0; i<status.length; i++)
			{
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/select[1]")).sendKeys(status[i]);
				Thread.sleep(2000);
				System.out.println("Test");
				//filter
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/button[1]")).click();
				Thread.sleep(3000);
			}
			
			//
			String[] s={"10","25","50","100"};
			for(int i=0; i<s.length; i++)
			{
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/select[1]")).sendKeys(s[i]);
				Thread.sleep(2000);
			}
			
			//ADD Leave
			driver.findElement(By.xpath("//button[@class='card-title btn btn-outline-info btn-sm btn-round float-right']")).click();
			//driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")).sendKeys("PL");;
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Description']")).sendKeys("Testing");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("02/23/2020");
			Thread.sleep(15000);
			driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/select[1]")).sendKeys("09:30 AM");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys("02/25/2020");
			Thread.sleep(15000);
			driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[4]/div[1]/select[1]")).sendKeys("06:30 PM");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='row float-right pr-3']")).click();
	}
	
	//Compensatory off
	public static void Compoff() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/corequest");
		Thread.sleep(4000);
	}
	
	//Work from Home
	public static void WFH() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/wfhrequest");
		Thread.sleep(4000);
	}
	
	//Adjustment
	public static void Adjustment() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/adjustmentrequest");
		Thread.sleep(4000);
	}
	
	//Attendance
	public static void Attendance() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/viewattendance");
		Thread.sleep(4000);
	}
	
	//LeaveBalence
	public static void LeaveBalence() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/leavecount");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-outline-info btn-sm btn-round card-title fa fa-refresh float-right']"));
	}
	
	//Holiday
	public static void Holiday() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/holiday");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-outline-info btn-sm btn-round card-title fa fa-refresh float-right']"));
	}
	
	//Change password
	public static void ChangePassword() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/changepassword");
		Thread.sleep(4000);
	}
	
	//Logout
	public static void Logout()
	{
		driver.findElement(By.xpath("//p[contains(text(),'Logout')]")).click();
	}
}