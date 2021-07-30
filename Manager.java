package com.lms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Manager {
	public static int i=0;
	public static WebDriver driver;	
	public static void Login() throws InterruptedException{
		Login.L1("ameya.joshi@gipl.com", "Abc12345");
	}
	
	//Leave
	public static void Leave() throws InterruptedException
	{
			driver.get("http://uatlms.seesales.in/#/app/leaverequest");
			Thread.sleep(15000);
			//filter leave
			//Filter date selection
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10-01-2020");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("25-02-2020");
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
			driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")).sendKeys("PL");;
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Description']")).sendKeys("Testing");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("23-03-2020");
			Thread.sleep(15000);
			driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/select[1]")).sendKeys("09:30 AM");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys("25-03-2020");
			Thread.sleep(15000);
			driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[4]/div[1]/select[1]")).sendKeys("06:30 PM");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='row float-right pr-3']")).click();
			
	}
	
	//Work from home
	public static void ManagerWFH() throws InterruptedException { 
		driver.get("http://uatlms.seesales.in/#/app/wfhrequest");
		Thread.sleep(3000);
		//filter wfh
		//status
		String[] status={" All "," Requested "," Approved "," Rejected "," Cancel "};
		for(int i=0; i<status.length; i++)
		{
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-wfh-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/select[1]")).sendKeys(status[i]);
			Thread.sleep(2000);
			//filter
			driver.findElement(By.xpath("//button[@class='card-title btn btn-outline-info btn-sm btn-round fa fa-filter']")).click();
			Thread.sleep(3000);
		}	
	}
	
	public static void Compoff() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/corequest");
		Thread.sleep(5000);
		//Add complementary off
		driver.findElement(By.xpath("//button[@class='card-title btn btn-outline-info btn-round btn-sm float-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/select[1]")).sendKeys(" Ameya Joshi ");
		driver.findElement(By.xpath("//input[@placeholder='Description']")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("02/12/2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/select[1]")).sendKeys("09:30 AM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys("02/13/2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[4]/div[1]/select[1]")).sendKeys("06:30 PM");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='row float-right pr-3']")).click();
	}
	
	//Manage leave
	public static void Manageleave() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/leaveaction");
		Thread.sleep(5000);
		
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
		
		//Manage 
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-manage[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/select[1]")).sendKeys("Rejected");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/div[1]/input[1]")).sendKeys("Leave Rejected");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[6]")).click();
		Thread.sleep(2000);
	}
	
	//MAnage WFH
	public static void MWFH() throws InterruptedException
	{
		driver.get("http://uatlms.seesales.in/#/app/wfhaction");
		Thread.sleep(10000);
		//filter WFH
		//Filter date selection
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10-01-2020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("25-02-2020");
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
		
		//Manage 
		for(int i=0;i<3;i++)
		{
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-wfh-manage[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/select[1]")).sendKeys("Rejected");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/div[1]/input[1]")).sendKeys("Leave Rejected");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[6]")).click();
		Thread.sleep(4000);	
		}
	}
}