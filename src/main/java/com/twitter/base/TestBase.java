package com.twitter.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase()
	{
		try {
			prop=new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\TwitterDemo\\src\\main\\java\\com\\twitter\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		
		}
	}
	
	public static void initialization()
	{
		String browserName= prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("WebDriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
					driver=new ChromeDriver();
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
				
		}
	}

