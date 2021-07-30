package com.lms1;

public class Dropdown {
	public static void Status(String AdjM) throws InterruptedException
	{
		String[] status={" All "," Requested "," Approved "," Rejected "," Cancel "};
		for(int i=0; i<status.length; i++)
		{
			Browser.Abs(Login.MainFrame+AdjM+"div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/select[1]").sendKeys(status[i]);
			Thread.sleep(2000);
			System.out.println(status[i]);
			//filter
			Browser.Abs(Login.MainFrame+AdjM+"div[1]/div[1]/form[1]/div[1]/div[4]/button[1]").click();
			Thread.sleep(3000);
		}
	}
	public static void SetPaginationDD(String AdjM) throws InterruptedException
	{
		//
		String[] ss={"10","25","50","100"};
		for(int i=0; i<ss.length; i++)
		{
			Browser.Abs(Login.MainFrame+AdjM+"div[2]/div[1]/div[1]/label[1]/select[1]").sendKeys(ss[i]);
			Thread.sleep(2000);
		}
	}
}
