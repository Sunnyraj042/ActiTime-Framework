package com.actiTime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{
	@FindBy(name="username")
	private WebElement usernameEdit;
	
	@FindBy(name="pwd")
	private WebElement passwordEdit;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;

	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void login(String username,String password)
	{
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		loginbutton.click();
	}

	

}
