package Practice_TestNGFinal;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;


public class LoginIntoTekportal3 extends report_utility1{
	
	@BeforeSuite
	public static void launch()
	{
		BrowserUtility.launchbrowser("ch");
		report_utility1.Createreport("LoginIntoTekportal3");
		//report_utility1.Starttestcase("LoginIntoTekportal3");
		//report_utility1.logger.log(LogStatus.INFO, "Browser launched");
		
	}

	
	@Test(priority=1)
	public void loginwithvaliddetails() throws Exception
	{
		BrowserUtility.loginToTekArch("admin123@gmail.com","admin123");
		report_utility1.Starttestcase("LoginIntoTekportalPassTest");
		report_utility1.logger.log(LogStatus.INFO, "Entered username successfully");
		report_utility1.logger.log(LogStatus.INFO, "Entered password successfully");
		report_utility1.logger.log(LogStatus.INFO, "clicked login buttonu successfully");
		report_utility1.logger.log(LogStatus.PASS, "Login successfully");
		Thread.sleep(3000);
    BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	report_utility1.logger.log(LogStatus.PASS, "Logout successfully");
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void loginwithinvaliddetails() throws Exception
	{		
		BrowserUtility.loginToTekArch("admin123@gmail.com", "admin");
		report_utility1.Starttestcase("LoginIntoTekportalFailedTest");
		report_utility1.logger.log(LogStatus.INFO, "Entered valid username successfully");
		report_utility1.logger.log(LogStatus.INFO, "Entered invalid password successfully");
		report_utility1.logger.log(LogStatus.INFO, "clicked login buttonn successfully");
		report_utility1.logger.log(LogStatus.FAIL, "Login Failed");
	}
	@AfterSuite

	public void quitbrowser()
	{
	//BrowserUtility.driver.close();
		report_utility1.Endtestcase();
	     report_utility1.Endreport();
	BrowserUtility.driver.close();
	}
	
}
