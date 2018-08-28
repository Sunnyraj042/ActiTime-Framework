package com.actiTime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectandCustomer 
{
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createNewCustomerBtn;
	
	public void navigateToCreateCustomersPage()
	{
		createNewCustomerBtn.click();
	}

}
