package com.actiTime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.actiTime.genericlib.BaseClass;
import com.actiTime.genericlib.FileUtils;
import com.actiTime.objectrepositorylib.CreateNewCustomer;
import com.actiTime.objectrepositorylib.Home;
import com.actiTime.objectrepositorylib.OpenTask;
import com.actiTime.objectrepositorylib.ProjectandCustomer;

public class CustomerTest extends BaseClass
{
	@Test
	public void createCustomerTest() throws Throwable
	{
		/*Reading Test Data.......................................................*/
		FileUtils lib= new FileUtils();
		String customerName=lib.getexcelData("sheet1",1,2);
		
		/*Navigate to Task Page...............................................*/
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.navigateToTaskImg();
		
		/*Clicking on "Project and Customer Link"..........................*/
		OpenTask  op=PageFactory.initElements(driver, OpenTask.class);
		op.navigateToProjectsandCustomersPage();
		
		/*Clicking on "Create New Customer"............................*/
		ProjectandCustomer PandC=PageFactory.initElements(driver, ProjectandCustomer.class);
		PandC.navigateToCreateCustomersPage();
		
		/*Creating Customer........................................*/
		CreateNewCustomer createCust=PageFactory.initElements(driver, CreateNewCustomer.class);
		createCust.createCustomer(customerName);
		
		/*Verifying.............................................
		String actmsg=PandC.getSucmsg().getText();
		String expmsg="Successfully Created.";
		Boolean stat=actmsg.contains(expmsg);
		Assert.assertTrue(stat);*/
	}
}
