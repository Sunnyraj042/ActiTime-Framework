package com.actiTime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common 
{
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public void logout()
	{
		logout.click();
	}

}
