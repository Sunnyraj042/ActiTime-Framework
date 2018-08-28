package com.actiTime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home 
{
	@FindBy(xpath="//div[text()='Tasks']/..")
	private WebElement Taskimg;
	
	@FindBy(xpath="//div[text()='Users']/..")
	private WebElement Userimg;
	
	public void navigateToTaskImg()
	{
		Taskimg.click();
	}
	
	public void navigateToUserImg()
	{
		Userimg.click();
	}

}
