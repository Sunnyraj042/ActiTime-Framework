package com.actiTime.genericlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actiTime.objectrepositorylib.Common;
import com.actiTime.objectrepositorylib.Login;

public  class BaseClass 
{
	public static WebDriver driver;
	FileUtils lib=new FileUtils();
	
	@BeforeClass
	public void configBC() throws Throwable 
	{  
		System.out.println("===Launch Browser===");
		Properties pobj=lib.getPropertiesObj();
		String bName=pobj.getProperty("browser");
		if(bName.equals("firefox"))
		{
        driver=new FirefoxDriver();
		}
		else if(bName.equals("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver", "./Resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	}

	@BeforeMethod
	public void configBM() throws Throwable
	{
		System.out.println("Login");
		Properties pobj=lib.getPropertiesObj();
        driver.get(pobj.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login lp=PageFactory.initElements(driver, Login.class);
		lp.login(pobj.getProperty("Username"), pobj.getProperty("Password"));
	}
	
	@AfterMethod
	public void configAM()
	{
		Common cp=PageFactory.initElements(driver, Common.class);
		cp.logout();
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("===Close Browser===");
		
		driver.close();
	}
	
	

}
