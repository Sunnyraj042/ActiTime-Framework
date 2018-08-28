package com.actiTime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask 
{
	@FindBy(linkText="Projects & Customers")
	private WebElement proandcustLink;
	
	public void navigateToProjectsandCustomersPage()
	{
		proandcustLink.click();
	}
	

}
