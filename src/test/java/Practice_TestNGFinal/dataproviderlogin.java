package Practice_TestNGFinal;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderlogin {
	
	@BeforeTest
	public void dependencyTriggering() {
	BrowserUtility.launchbrowser("ch");
	}
	
	
//	@AfterMethod
//	public void settingURL() {	
//		if(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed())
//		{
//			BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
//			WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
//			wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("email_field"))));	
//		}
//	
//
//    }
	@Test(dataProvider="Data_UsernameAndPassword")
	public void checkLoginSuccessOrNot(String username, String Password) throws Exception{
		System.out.println(username+"\t"+Password);
	BrowserUtility.loginToTekArch(username, Password);
	BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
	}
	@DataProvider(name="Data_UsernameAndPassword")
	public Object[][] usernamePassword_dp(){
		return new Object[][] {{"admin123@gmail.com","admin123"},{"admin@gmail.com","admin"}};
	}
	@AfterTest
	public void quit()
	{
		BrowserUtility.quitbrowser();
	}
}
