package com.wepappseurity.zero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransfermoneyConfirmpage {
	public TransfermoneyConfirmpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="btn_submit")
	private WebElement submitbutton; 
	
	public void confirmtransfer()
	{
		submitbutton.click();
	}

}
