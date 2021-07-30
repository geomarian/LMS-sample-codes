package com.lms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class LMS  {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\workspace\\lms\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://uatlms.seesales.in/");
    String[] username={"amey.bapat@gadreinfotech.com"};
	String[] password={"Abc12345"};
	for(int i=0; i<username.length; i++)
	
	{
		Login(username[i], password[i]);
		Leave();
		//CO();
		//ManageEmpCO();
		//Logout();
	}
	}
	
	
	
	//ADD Leave
	
		//Leave
			public static void Leave() throws InterruptedException
			{
					driver.get("http://uatlms.seesales.in/#/app/leaverequest");
					System.out.println("Test");
					Thread.sleep(7000);
					//filter leave
					//Filter date selection
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10-Mar-2020");
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-request[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("12-Mar-2020");
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
					
					
					//ADD Leave
					driver.findElement(By.xpath("//button[@class='card-title btn btn-outline-info btn-sm btn-round float-right']")).click();
					driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")).sendKeys("PL");;
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@placeholder='Description']")).sendKeys("Testing");
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("10-Mar-2020");
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/select[1]")).sendKeys("09:30 AM");
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys("12-Mar-2020");
					Thread.sleep(2000);
					driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[4]/div[1]/select[1]")).sendKeys("06:30 PM");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class='row float-right pr-3']")).click();
					
			}
	
	
	@Test
	public static void Login(String username, String password) throws InterruptedException{
	
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='login100-form-btn button100']")).click();
		Thread.sleep(5000);
	}
	
	


	
	//@Test(priority = 3)
/*	@Test
	private static void Logout() {
		System.out.println("Clicking Logout!");
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/app-header[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]")).click();
		System.out.println("Emp is logged out!");
*/		
	
	}
	//Here Emp it will manage CO
	//

	//@Test(priority =2)
	
	
/*	private static void ManageEmpCO() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='btnEdit']")));
		
		 driver.findElement(By.xpath("//button[@name='btnEdit']")).click();
		 Thread.sleep(1000);
		// will perform cancel action by emp.
		 System.out.println("Edit button is clicked");
		 driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		System.out.println("Window is clicked");
		
	*/	
		
//		WebDriverWait wait1 = new WebDriverWait(driver,30);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Comment']")));
//		
//		 driver.findElement(By.xpath("//input[@placeholder='Comment']")).sendKeys("Canceling from automation");
	//	Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round']")).click();
//		Thread.sleep(1000);
	 
		


	//@Test(priority = 1)


/*
	private static void CO() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-calendar-plus-o']")));
		
//		Wait wait1 = new FluentWait<WebDriver>(driver)
//				.withTimeout(50, TimeUnit.SECONDS)
//				.pollingEvery(3, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
		driver.findElement(By.xpath("//i[@class='fa fa-calendar-plus-o']")).click();
		
		Thread.sleep(3000);
		//goto CO page
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//button[@class='card-title btn btn-outline-info btn-round btn-sm float-right']")).click();
		//Select date
		
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("12-Feb-2020");
		
		 System.out.println("date selected");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/select[1]")).sendKeys("09:30 AM");
	    System.out.println("print From Time");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[4]/div[1]/select[1]")).sendKeys("01:30 PM");
		System.out.println("print To Time");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Description']")).sendKeys("Selenium testing");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-sm btn-round']")).click();
		Thread.sleep(2000);
		System.out.println("Priority 1 is complete");
	}
	
	
	//@Test(priority = 0)
	//Goto Site

	*/  
	   
	




