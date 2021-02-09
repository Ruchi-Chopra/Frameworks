package com.wepappseurity.zero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFundpage
{
	public TransferFundpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="tf_fromAccountId")
	private WebElement frmAccount;

	@FindBy(id="tf_toAccountId")
	private WebElement toAccount;

	@FindBy(id="tf_amount")
	private WebElement amt;

	@FindBy(id="tf_description")
	private WebElement desc;

	@FindBy(id="btn_submit")
	private WebElement continuebtn;

	public void FundTransfer(String amount, String description)
	{
		Select fromdd =new Select(frmAccount);
		fromdd.selectByIndex(2);

		Select toDD = new Select(toAccount);
		toDD.selectByIndex(3);

		amt.sendKeys(amount);
		desc.sendKeys(description);
		continuebtn.click();
	}
}
