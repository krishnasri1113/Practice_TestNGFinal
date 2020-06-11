package Practice_TestNGFinal;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginIntoTekportal {
	
	@BeforeSuite
	public void launch()
	{
		BrowserUtility.launchbrowser("ch");
		
	}
	
	@Test(priority=1)
	public void loginwithvaliddetails() throws Exception
	{
		BrowserUtility.loginToTekArch("admin123@gmail.com","admin123");
		
		Thread.sleep(3000);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void loginwithinvaliddetails() throws Exception
	{		
		BrowserUtility.loginToTekArch("admin123@gmail.com", "admin");
	}
	@AfterSuite

	public void quitbrowser()
	{
	//BrowserUtility.driver.close();
	BrowserUtility.driver.close();
	}
	
}
