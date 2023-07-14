package com.twitter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.twitter.base.TestBase;


public class LoginPage extends TestBase {
	
			//@FindBy(id="email")
			@FindBy(xpath="//input[@name='text']")
			WebElement phonenumber;
			
			//@FindBy(id="password")
			@FindBy(xpath="//span[text()='Next']")
			WebElement nextbutton;
			
			@FindBy(xpath="//input[@name='password']")
			WebElement password;
			
			@FindBy(xpath="//span[text()='Log in']")
			WebElement loginbtn;
			
			
			
			//Initializing the Page Object
			public LoginPage()
			{
				PageFactory.initElements(driver,this);
			}
			
			
			
			public void login(String phoneNumber,String passWord) throws InterruptedException
			{
				Thread.sleep(5000);
				phonenumber.sendKeys(phoneNumber);
				nextbutton.click();
				Thread.sleep(2000);
				password.sendKeys(passWord);
				loginbtn.click();
				
				
			}

		}

