package com.actiTime.objectrepositorylib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CustomerTest 
{
	@Test
	public void createCustomerTest()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		//Step:1).Login.............................
	     Login lin=PageFactory.initElements(driver, Login.class);
	     lin.login("admin", "manager");
	     
	   //Step:2).Navigate to TaskPage................
	     Home Hpage=PageFactory.initElements(driver, Home.class);
	     Hpage.navigateToTaskImg();
	     
	   //Step:3).Navigate to Project And Customer PAge................
	     OpenTask  OT=PageFactory.initElements(driver, OpenTask .class);
	     OT.navigateToProjectsandCustomersPage();
	     
	   //Step:4).Click on"Create NewCustomer Btn"................
	     ProjectandCustomer PandC=PageFactory.initElements(driver, ProjectandCustomer.class);
	     PandC.navigateToCreateCustomersPage();
	     
	    //Step:5).Click on"Create NewCustomer Btn"................
	     CreateNewCustomer CNC=PageFactory.initElements(driver, CreateNewCustomer.class);
	     CNC.createCustomer("ICICI");
	     
	     //Step:6).Logout................
	     Common COM=PageFactory.initElements(driver, Common.class);
	     COM.logout();
	     
	}
}
