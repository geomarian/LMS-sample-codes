package com.lms1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Main {
	
	public static void main(String Args[]) throws InterruptedException, AWTException
	{
		//Employee.Login();
	
		//Manager.Login();
		Supervisor.Login();
	}

@Test
	public static void Employee() throws InterruptedException {
		//Login.L1("vaibhav.gogate@gipl.com", "Abc12345");
	//	User.Initial();
//	User.Logout();
		
	}
}