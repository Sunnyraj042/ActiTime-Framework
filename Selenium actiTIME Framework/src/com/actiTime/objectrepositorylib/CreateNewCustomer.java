package com.actiTime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer 
{
	@FindBy(name="name")
	private WebElement CustomerNameEdit;
	
	@FindBy(name="description")
	private WebElement CustomerDescriptionEdit;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement CreateNewCustomerBtn;
	
	public void createCustomer(String CustomerName)
	{
		CustomerNameEdit.sendKeys(CustomerName);
		CreateNewCustomerBtn.click();
	}
	
	public void createCustomer(String CustomerNAme,String Desc)
	{
		CustomerNameEdit.sendKeys(CustomerNAme);
		CustomerDescriptionEdit.sendKeys(Desc);
		CreateNewCustomerBtn.click();
	}
}
	
	
	

	
