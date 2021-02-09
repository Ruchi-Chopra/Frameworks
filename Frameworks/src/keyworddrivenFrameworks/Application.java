package keyworddrivenFrameworks;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Generic;

public class Application {
	@Test
	public void VerifyInvalidLogin() throws IOException
	{
		String[][] data = Generic.getData("C:\\Users\\ruchi\\Documents\\QA Course\\Selenium\\TestDataFrameworks.xlsx", "Sheet2");
		Methods mtd = new Methods();
		for (int i=1;i<data.length;i++)
		{
			switch(data[i][3])
			{
			case "openBrowser":
				mtd.OpenBrowser();
				break;
			case "maxBrowser":
				mtd.MaximizeBrowser();
				break;
			case "impicitWait":
				mtd.ImplicitWait();
				break;
			case "navigateToApp":
				mtd.NavigateToApp(data[i][6]);
				break;
			case"enterInTextbox":
				mtd.EnterInTextBox(data[i][5], data[i][6]);
                break;
			case"signIn":
			mtd.SignIn(data[i][4],data[i][5]);
			break;
			case"verifyErrMsg":
				String ActualMsg = mtd.VerifyErrorMsg(data[i][4],data[i][5]);
				String ExpectedMsg = data[i][6];
				Assert.assertEquals(ActualMsg, ExpectedMsg);
				break;
			case "closeApp":
				mtd.CloseApp();
				break;
			}
		}
	}
}



