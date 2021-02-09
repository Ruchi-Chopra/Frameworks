package com.wepappseurity.zero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}








	@FindBy(id="user_login")
	private WebElement uName;

	@FindBy(id="user_password")
	private WebElement pass;

	@FindBy(name="submit")
	private WebElement submit;

	@FindBy(css="#login_form > div.alert.alert-error")
	private WebElement Errmsg;

	public void applicationLogIn(String LoginUsername, String LoginPassword)
	{
		uName.sendKeys(LoginUsername);
		pass.sendKeys(LoginPassword);
		submit.click();
	}
	public String ErrorMsg()
	{
        String ErrorMessage = Errmsg.getText();
        return ErrorMessage;
	}
}



