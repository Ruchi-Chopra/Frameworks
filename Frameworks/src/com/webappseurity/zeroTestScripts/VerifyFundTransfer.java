package com.webappseurity.zeroTestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wepappseurity.zero.TransferFundpage;
import com.wepappseurity.zero.Transferfundandmoneypage;
import com.wepappseurity.zero.TransfermoneyConfirmpage;
import com.wepappseurity.zero.Verifypage;
import com.wepappseurity.zero.loginpage;

import utils.Generic;

public class VerifyFundTransfer extends Base
{
	@Test
   public void VerifyFT() throws IOException
   {
		loginpage lp = new loginpage(driver);
		Transferfundandmoneypage tfmp = new Transferfundandmoneypage(driver);
		TransfermoneyConfirmpage tfcp= new TransfermoneyConfirmpage(driver);
		TransferFundpage tfp = new TransferFundpage(driver);
		Verifypage vp = new Verifypage(driver);
		
		String[][] data = Generic.getData("C:\\Users\\ruchi\\Documents\\QA Course\\Selenium\\TestDataFrameworks.xlsx", "sheet1");
		for(int i=1;i<data.length;i++)
		{
		 lp.applicationLogIn(data[i][0],data[i][1]);
		 tfmp.TransferFunds();
		 tfp.FundTransfer(data[i][2],data[i][3]);
		 tfcp.confirmtransfer();
		 String actualText =vp.Verifytext();
		 String ExpectedTest = data[i][4];
		 Assert.assertEquals(actualText, ExpectedTest);
		 vp.logOutFromApplication();
		 driver.get("http://zero.webappsecurity.com/login.html");
		}
		 
		
		
		
   }

}
