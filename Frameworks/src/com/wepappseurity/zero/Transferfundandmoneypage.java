package com.wepappseurity.zero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transferfundandmoneypage 
{
	public Transferfundandmoneypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Transfer Funds")
	private WebElement transfunds;

	public void TransferFunds()
	{
		transfunds.click();
	}
	
	public Boolean VerifyTransferFundsPresent()
	{
		Boolean transferLinkPresent =transfunds.isDisplayed();
		return transferLinkPresent;
	}

}


