package com.lms1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User {
	//public static WebDriver driver;	
	public static String Rel="//p[contains(text(),";
	public static String Cxpath="/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div";
	public static String path="/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div";
	
	public static void Initial() throws InterruptedException
	{
		Dashboard();
		//Leave();
		//Compoff();
		//WFH();
		//Adjustment();
		//Attendance();
	//	LeaveBalence();
	//	Holiday();
	//	ChangePassword();
		ManageAttendance();
	}
	//Dashboard
	public static void Dashboard() throws InterruptedException
	{
		Browser.Relative(Rel+"'Dashboard')]");
	//	Thread.sleep(4000);
	}	
	//leave
	public static void Leave() throws InterruptedException
	{
		Browser.Relative("//li[2]//a[1]//p[1]").click();
		Thread.sleep(15000);
		//filter leave
		Filter();
		
		//ADD Leave
		Browser.Abs(Cxpath+"[1]/div[3]/button[1]").click();
		if(Manager.i==1|| Supervisor.i==1  || Admin.i==1)
		{
			Browser.Abs(path+"[1]/div[1]/div[1]/select[1]").click();
		}
		Browser.Abs(path+"[1]/div[2]/div[1]/select[1]").sendKeys("PL");
		//sleep();
		Browser.Abs(path+"[1]/div[3]/div[1]/input[1]").sendKeys("Testing automation");
		Browser.Abs(path+"[2]/div[1]/div[1]/input[1]").sendKeys("25-Feb-2020");
		sleep();
		Browser.Abs(path+"[2]/div[2]/div[1]/select[1]").sendKeys("09:30 AM");
		Browser.Abs(path+"[2]/div[3]/div[1]/input[1]").sendKeys("25-Feb-2020");
		sleep();
		Browser.Abs(path+"[2]/div[4]/div[1]/select[1]").sendKeys("01:30 PM");
		sleep();
		Browser.Abs(path+"[4]").click();
		sleep();
	//If Submit button is not enable it will click Cancel button
		if(Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]").isDisplayed())
		{
			Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]").click();
		}
	
	}
	//Compensatory off
	public static void Compoff() throws InterruptedException
	{
		Browser.Relative(Rel+"'Compensatory Off')]").click();
	//	Thread.sleep(4000);
		Filter();
		Add();
		
	}
		
	//Work from Home
	public static void WFH() throws InterruptedException
	{
		Browser.Relative(Rel+"'Work From Home')]").click();
	//	Thread.sleep(4000);
		Filter();
		Add();
	}
		
	//Adjustment
	public static void Adjustment() throws InterruptedException
	{
		Browser.Relative("//li[@class='active']"+Rel+"'Adjustment')]").click();
//		Thread.sleep(4000);
	}
		
	//Attendance
	public static void Attendance() throws InterruptedException
	{
		Browser.Relative("//li[6]//a[1]//p[1]").click();
		Thread.sleep(4000);
	}
		
	//LeaveBalence
	public static void LeaveBalence() throws InterruptedException
	{
		Browser.Relative(Rel+"'Leave Balance')]").click();
		Thread.sleep(4000);
		Browser.Relative("//button[@class='btn btn-outline-info btn-sm btn-round card-title fa fa-refresh float-right']");
	}
		
	//Holiday
	public static void Holiday() throws InterruptedException
	{
		Browser.Relative(Rel+"'Holiday')]").click();
	//	Thread.sleep(4000);
		Browser.Relative("//button[@class='btn btn-outline-info btn-sm btn-round card-title fa fa-refresh float-right']");
	}
	
	//Change password
	public static void ChangePassword() throws InterruptedException
	{
		Browser.Relative(Rel+"'Change Password')]").click();
	//	Thread.sleep(4000);
	}
		
	//Logout
	public static void Logout() throws InterruptedException
	{
		Browser.Relative(Rel+"'Logout')]").click();
		Thread.sleep(2000);
		(Browser.driver).close();
	}
	
	//filter
	public static void Filter() throws InterruptedException
	{
		//filter leave
		//Filter date selection
		Browser.Abs(Cxpath+"[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]").sendKeys("25-Feb-2020");
		sleep();
		Browser.Abs(Cxpath+"[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]").sendKeys("26-Feb-2020");
		sleep();
		//status
		String[] status={" All "," Requested "," Approved "," Rejected "," Cancel "};
		for(int i=0; i<status.length; i++)
		{
			Browser.Abs(Cxpath+"[1]/div[1]/form[1]/div[1]/div[3]/div[1]/select[1]").sendKeys(status[i]);
			sleep();
			//filter
			Browser.Abs(Cxpath+"[1]/div[1]/form[1]/div[1]/div[4]/button[1]").click();
			sleep();
		}
		//
		String[] s={"10","25","50","100"};
		for(int i=0; i<s.length; i++)
		{
			Browser.Abs(Cxpath+"[2]/div[1]/div[1]/label[1]/select[1]").sendKeys(s[i]);
			sleep();
		}
	}
	
	//Add comlementery off, work from home
	public static void Add()
	{
		Browser.Abs(Cxpath+"[1]/div[3]/button[1]").click();
		Browser.Abs(path+"[1]/div[1]/div[1]/select[1]").sendKeys(" Avinash Pendse ");
		
		Browser.Abs(path+"[1]/div[2]/div[1]/input[1]").sendKeys("Testing");
		Browser.Abs(path+"[2]/div[1]/div[1]/input[1]").sendKeys("25-Feb-2020");
		Browser.Abs(path+"[2]/div[2]/div[1]/select[1]").sendKeys("09:30 AM");
		Browser.Abs(path+"[2]/div[3]/div[1]/input[1]").sendKeys("26-Feb-2020");
		Browser.Abs(path+"[2]/div[4]/div[1]/select[1]").sendKeys("06:30 PM");
		Browser.Abs(path+"[3]").click();
	}
	
private static void ManageAttendance() {
		
		WebElement element = Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/app-sidebar[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[16]/a[1]/p[1]");
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", element);
		
		
		Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/app-sidebar[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[14]/a[1]/p[1]").click();
	}
	
	
	
	private static void sleep() 
	{
		// TODO Auto-generated method stub
		try {
		    TimeUnit.SECONDS.sleep(7);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		    
	}
	
	
	
	}
}
	


