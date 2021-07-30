package com.lms1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Admin {
	public static int i=0;
	public static String sidebar = "/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/app-sidebar[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]";
	public static void Login() throws InterruptedException{
		Admin a= new Admin();
		User u=new User();
		Login.L1("avinash.pendse@gadreinfotech.com", "Welcome2020");
		i=i+1;
		User.Initial();
		//a.Users();
		Thread.sleep(5000);
		//a.ManageLeaveCount();
		//Thread.sleep(5000);
		//a.EditUser();
		//Thread.sleep(5000);
		//a.DeleteUser();
		//a.LeaveCountMaster();
		//a.AdjustmentReason();
		//Thread.sleep(5000);
		//a.ManageHoliday();
		//WebElement element = Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/app-sidebar[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[16]/a[1]/p[1]");
		//((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", element);
		//a.AllAttendenc();
		//((JavascriptExecutor)Browser.driver).executeScript("scroll(0,300)");
		Thread.sleep(5000);
		WebElement element1 = Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/app-sidebar[1]/div[1]/div[2]/div[1]/perfect-scrollbar[1]/div[1]/div[1]/ul[1]/li[16]/a[1]/p[1]");
		((JavascriptExecutor)Browser.driver).executeScript("arguments[0].scrollIntoView();", element1);
		//Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/app-header[1]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/i[1]").click();
		u.Logout();
	}
	
	private  void Users() throws InterruptedException {
		// TODO Auto-generated method stub
		//Reload
		Browser.Abs(sidebar+"/div[1]/div[1]/ul[1]/li[10]/a[1]/p[1]").click();
		Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-user[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]").click();
		
		String[] s={"10","25","50","100"};
		for(int i=0; i<s.length; i++)
		{
			Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-user[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/select[1]").sendKeys(s[i]);
			Thread.sleep(2000);
		}
		
		//Add user
		Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-user[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]").click();
	
		Browser.Abs(User.path+"[1]/div[1]/div[1]/input[1]").sendKeys("Test");
		Browser.Abs(User.path+"[1]/div[2]/div[1]/input[1]").sendKeys("test@abc.com");
		Browser.Abs(User.path+"[2]/div[1]/div[1]/input[1]").sendKeys("1000");
		Browser.Abs(User.path+"[2]/div[2]/div[1]/input[1]").sendKeys("123456789021");
		Browser.Abs(User.path+"[2]/div[3]/div[1]/select[1]").sendKeys("Employee");
		Browser.Abs(User.path+"[2]/div[4]/div[1]/input[1]").sendKeys("Abc12345");
		Browser.Abs(User.path+"[3]/div[1]/div[1]/input[1]").sendKeys("12-10-1992");
		Browser.Abs(User.path+"[3]/div[2]/div[1]/input[1]").sendKeys("01-02-2020");
		Browser.Abs(User.path+"[3]/div[3]/div[1]/select[1]").sendKeys(" Ameya Joshi ");
		Browser.Abs(User.path+"[3]/div[4]/div[1]/select[1]").sendKeys(" Vaibhav Gogate ");
		Browser.Abs(User.path+"[4]/div[1]/div[1]/select[1]").sendKeys(" Male ");
		Browser.Abs(User.path+"[4]/div[2]/div[1]/select[1]").sendKeys(" Unmarried ");
		Browser.Abs(User.path+"[5]").click();
	}
	
	//Edit user
	public void EditUser() throws InterruptedException
	{
		Browser.Abs(sidebar+"/div[1]/div[1]/ul[1]/li[10]/a[1]/p[1]").click();
		String path="/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-user[1]/div[1]/div[1]/div[1]/div";
		Browser.Abs(path+"[2]/div[1]/table[1]/thead[1]/tr[1]/th[1]").click();
		Browser.Abs(path+"[2]/div[1]/table[1]/thead[1]/tr[1]/th[1]").click();
		int a=0;
		Thread.sleep(2000);
		String snum=Browser.Abs(path+"[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]").getText();
		Thread.sleep(2000);
		int num = Integer.parseInt(snum);
		Thread.sleep(2000);
		Browser.Abs(path+"[2]/div[1]/table[1]/thead[1]/tr[1]/th[1]").click();
		int b=0;
		for(int j=1;j<2;j++)
		{
			System.out.println(j);
			if(num!=a)
			{
				Browser.Abs(path+"[2]/div[1]/div[4]/span[1]/a["+j+"]").click();
				for(int i=1;i<num;i++)
				{
					System.out.println(i);
					if(num!=a)
					{
						String innerText = Browser.Abs(path+"[2]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[2]").getText(); 
						if(innerText.equals("1000"))
						{
							Browser.Abs(path+"[2]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[6]/button[1]").click();
							Browser.Abs(User.path+"[1]/div[1]/div[1]/input[2]").sendKeys("Test1");
							Browser.Abs(User.path+"[1]/div[2]/div[1]/input[1]").clear();
							Browser.Abs(User.path+"[1]/div[2]/div[1]/input[1]").sendKeys("test1@abc.com");
							Browser.Abs(User.path+"[2]/div[1]/div[1]/input[1]").clear();
							Browser.Abs(User.path+"[2]/div[1]/div[1]/input[1]").sendKeys("1000");
							Browser.Abs(User.path+"[2]/div[2]/div[1]/input[1]").clear();
							Browser.Abs(User.path+"[2]/div[2]/div[1]/input[1]").sendKeys("1234567890");
							Browser.Abs(User.path+"[2]/div[3]/div[1]/select[1]").sendKeys("Employee");
							Browser.Abs(User.path+"[3]/div[1]/div[1]/input[1]").sendKeys("12-10-1992");
							Browser.Abs(User.path+"[3]/div[2]/div[1]/input[1]").sendKeys("01-02-2020");
							Browser.Abs(User.path+"[3]/div[3]/div[1]/select[1]").sendKeys(" Ameya Joshi ");
							Browser.Abs(User.path+"[3]/div[4]/div[1]/select[1]").sendKeys(" Vaibhav Gogate ");
							Browser.Abs(User.path+"[4]/div[1]/div[1]/select[1]").sendKeys(" Male ");
							//Browser.Abs(User.path+"[4]/div[2]/div[1]/select[1]").click();
							//Browser.Abs(User.path+"[4]/div[2]/div[1]/select[1]/option[3]").click();
							Thread.sleep(5000);
							Browser.Abs(User.path+"[5]/button[2]").click();
							System.out.println("user edited");
						}
						a++;
					}
				}
			}
		}
		System.out.println(a);
	}
	
	//Deleting user
	public void DeleteUser() throws InterruptedException
	{
		Browser.Abs(sidebar+"/div[1]/div[1]/ul[1]/li[10]/a[1]/p[1]").click();
		String path="/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-user[1]/div[1]/div[1]/div[1]/div";
		Browser.Abs(path+"[2]/div[1]/table[1]/thead[1]/tr[1]/th[1]").click();
		Browser.Abs(path+"[2]/div[1]/table[1]/thead[1]/tr[1]/th[1]").click();
		int a=0;
		Thread.sleep(2000);
		String snum=Browser.Abs(path+"[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]").getText();
		Thread.sleep(2000);
		int num = Integer.parseInt(snum);
		Thread.sleep(2000);
		Browser.Abs(path+"[2]/div[1]/table[1]/thead[1]/tr[1]/th[1]").click();
		for(int j=1;j<2;j++)
		{
			if(num!=a)
			{
				Browser.Abs(path+"[2]/div[1]/div[4]/span[1]/a["+j+"]").click();
				for(int i=1;i<11;i++)
				{
					if(num!=a)
					{
						String innerText = Browser.Abs(path+"[2]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[2]").getText(); 	
						if(innerText.equals("1000"))
						{
							Thread.sleep(2000);
							Browser.Abs(path+"[2]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[6]/button[2]").click();
							Thread.sleep(2000);
							Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[2]/button[2]").click();
							System.out.print("Test");
							break;
						}
						a++;
					}
				}
			}
		}
		System.out.println(a);
	}

	private void ManageLeaveCount() {
		// TODO Auto-generated method stub
		Browser.Abs(sidebar+"/div[1]/div[1]/ul[1]/li[11]/a[1]/p[1]").click();
		Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-manage-leave-count[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]").click();
		
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/select[1]").sendKeys("Test");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]").sendKeys(" Initial ");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/input[1]").sendKeys("5");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/input[1]").sendKeys("5");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/input[1]").sendKeys("5");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/input[1]").sendKeys("5");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]").sendKeys("Test");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[3]").click();
		
	}

	private void LeaveCountMaster() throws InterruptedException {
		// TODO Auto-generated method stub
		Browser.Abs(sidebar+"/div[1]/div[1]/ul[1]/li[12]/a[1]/p[1]").click();
		Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-count-master[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/button[1]").click();
		
		String path="/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-leave-count-master[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div";
		Thread.sleep(2000);
		Browser.Abs(path+"[1]/div[1]/div[1]/input[1]").clear();
		Browser.Abs(path+"[1]/div[1]/div[1]/input[1]").sendKeys("44");
		Thread.sleep(2000);
		Browser.Abs(path+"[1]/div[2]/div[1]/input[1]").clear();
		Browser.Abs(path+"[1]/div[2]/div[1]/input[1]").sendKeys("55");
		Thread.sleep(4000);
		Browser.Abs(path+"[1]/div[3]/div[1]/input[2]").clear();
		Browser.Abs(path+"[1]/div[3]/div[1]/input[2]").sendKeys("66");
		Thread.sleep(2000);
		Browser.Abs(path+"[1]/div[4]/div[1]/input[1]").clear();
		Browser.Abs(path+"[1]/div[4]/div[1]/input[1]").sendKeys("22");
		Thread.sleep(2000);
		Browser.Abs(path+"[2]/div[1]/div[1]/input[1]").clear();
		Browser.Abs(path+"[2]/div[1]/div[1]/input[1]").sendKeys("11");
		Thread.sleep(2000);
		Browser.Abs(path+"[2]/div[2]/div[1]/input[1]").clear();
		Browser.Abs(path+"[2]/div[2]/div[1]/input[1]").sendKeys("11");
		Thread.sleep(2000);
		Browser.Abs(path+"[2]/div[3]/div[1]/input[1]").clear();
		Browser.Abs(path+"[2]/div[3]/div[1]/input[1]").sendKeys("11");
		Thread.sleep(2000);
		Browser.Abs(path+"[2]/div[4]/div[1]/input[1]").clear();
		Browser.Abs(path+"[2]/div[4]/div[1]/input[1]").sendKeys("11");
		Thread.sleep(2000);
		Browser.Abs(path+"[3]/div[1]/div[1]/input[1]").clear();
		Browser.Abs(path+"[3]/div[1]/div[1]/input[1]").sendKeys("200");
		Thread.sleep(2000);
		Browser.Abs(path+"[3]/div[2]/div[1]/button[1]").click();
		
	}

	private void AdjustmentReason() {
		// TODO Auto-generated method stub
		Browser.Abs(sidebar+"/div[1]/div[1]/ul[1]/li[13]/a[1]/p[1]").click();
		Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-adjustment-reason[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]").click();
		Browser.Abs(User.path+"[1]/div[1]/div[1]/input[1]").sendKeys("Test");
		Browser.Abs(User.path+"[2]/button[2]").click();
	}

	private void ManageHoliday() throws InterruptedException {
		// TODO Auto-generated method stub
		Browser.Abs(sidebar+"/div[1]/div[1]/ul[1]/li[14]/a[1]/p[1]").click();
		String[] s={"10","25","50","100"};
		for(int i=0; i<s.length; i++)
		{
			Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-manage-holiday[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/select[1]").sendKeys(s[i]);
			Thread.sleep(2000);
		}
		Browser.Abs("/html[1]/body[1]/app-root[1]/app-main[1]/div[1]/div[1]/div[1]/app-manage-holiday[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]").click();
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]").sendKeys("Testing");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]").sendKeys("24-04-2020");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/select[1]").sendKeys(" Holiday ");
		Browser.Abs("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]").click();
	}

	private void AllAttendenc() {
		// TODO Auto-generated method stub
		
	}
	
}