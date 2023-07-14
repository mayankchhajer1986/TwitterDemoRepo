package com.twitter.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.twitter.base.TestBase;
import com.twitter.pages.HomePage;
import com.twitter.pages.LoginPage;



public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test
	public void enterLoginDetails() throws InterruptedException
	{
		
		loginPage.login("9950487633","mayank_1986");
	}
	
	
	/*@AfterMethod
	public void teardown()
	{
		driver.quit();
	}*/
}

