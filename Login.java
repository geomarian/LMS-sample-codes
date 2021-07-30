package com.lms1;

import org.openqa.selenium.WebDriver;

public class Login  {
	public static WebDriver driver;
	
	public static String MainFrame="/html[1]/body[1]/app-root[1]/";
	public static String DialogBox="/html[1]/body[1]/ngb-modal-window[1]/";
	public static void L1(String Email, String Password) throws InterruptedException {
		Browser.Driver();
		
		String s1="app-login[1]/div[1]/div[1]/div[1]/form[1]/div";
		Browser.Abs(MainFrame+s1+"[1]/input[1]").clear();
		Browser.Abs(MainFrame+s1+"[2]/input[1]").clear();
		Thread.sleep(2000);
		Browser.Abs(MainFrame+s1+"[1]/input[1]").sendKeys(Email);
		Browser.Abs(MainFrame+s1+"[2]/input[1]").sendKeys(Password);
		Thread.sleep(2000);
		Browser.Abs(MainFrame+s1+"[4]/button[1]").click();
		Thread.sleep(5000);
	}
}
