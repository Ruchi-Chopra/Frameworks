package keyworddrivenFrameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	WebDriver driver;
	public void OpenBrowser() {
		driver= new ChromeDriver();

	}
	public void MaximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	public void ImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public void NavigateToApp(String url)
	{
		driver.get(url);
	}
	public void EnterInTextBox(String locValue, String Testdata)
	{
		driver.findElement(By.id(locValue)).sendKeys(Testdata);
	}
	public void SignIn(String loc,String locValue)
	{
		if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
		else if(loc.equals("xpath")){
			driver.findElement(By.xpath(locValue)).click();
		}

	}
	public String VerifyErrorMsg(String loc,String locValue)
	{
		String actualMsg=null;
		if(loc.equals("cssselector"))
		{
			actualMsg = driver.findElement(By.cssSelector(locValue)).getText();

		}
		else if(loc.equals("id"))
		{
			actualMsg = driver.findElement(By.id(locValue)).getText();

		}
		return(actualMsg);
	}




public void CloseApp()
{
	driver.close();
}
}



