package com.wepappseurity.zero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifypage {
	public Verifypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	
	private WebElement verifytext;
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement UserNAme;
	@FindBy(id="logout_link")
	private WebElement Logout;
	public void logOutFromApplication()
	{
		UserNAme.click();
		Logout.click();
	}
	
	public String Verifytext()
	{
		 String confMsg = verifytext.getText();
		 return confMsg;
	}
	

}
