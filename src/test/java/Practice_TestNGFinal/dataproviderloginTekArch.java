package Practice_TestNGFinal;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderloginTekArch {
	
	@BeforeSuite
	public void launch()
	{
		BrowserUtility.launchbrowser("ch");
	}
	@AfterMethod
	public void logout() {
		if(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed())
		{
			BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 50);
//			wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("email_field"))));	
		} 
	}
	@Test(dataProvider="Data_UsernameandPassword")
	public void loginwithUsernameandPassword(String username,String password) throws Exception
	{
		//System.out.println(username+"\t"+password);
		BrowserUtility.loginToTekArch(username, password);
	}
	@DataProvider(name="Data_UsernameandPassword")
	public Object[][] UserNameandPassword_dataprovider()
	{
		//String a[][]=new String[2][2];//declaring two dimensional rray
		//int a[]=new int[5];//declaring single dimensional array
	return new Object[][] {{"admin123@gmail.com","admin123"},{"admin123@gmail.com","admin"}};
	}
	@AfterSuite
	public void quitbrowser()
	{
		BrowserUtility.quitbrowser();
	}

}
