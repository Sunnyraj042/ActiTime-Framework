package com.actiTime.genericlib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonlib 
{
	public void waitForPageToLoad()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void waitForElementPresent(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(BaseClass.driver,20);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public void Select(WebElement wb,String value)
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
	}
	
	public void Select(WebElement swb,int index)
	{
		Select sel=new Select(swb);
		sel.selectByIndex(index);
	}
	

	
}
