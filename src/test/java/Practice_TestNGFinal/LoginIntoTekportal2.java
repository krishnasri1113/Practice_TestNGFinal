package Practice_TestNGFinal;


import static org.testng.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;



public class LoginIntoTekportal2 extends report_utility1{
	
	@BeforeSuite
	public static void launch()
	{
		BrowserUtility.launchbrowser("ch");
		report_utility1.Createreport("LoginIntoTekportal");
		//report_utility1.Starttestcase("LoginIntoTekportal2");
		//report_utility1.logger.log(LogStatus.INFO, "Browser launched");
		
	}

	
	@Test(priority=1)
	public void loginwithvaliddetails() throws Exception
	{
		BrowserUtility.loginToTekArch("admin123@gmail.com","admin123");
		report_utility1.Starttestcase("LoginPassTest");
		report_utility1.logger.log(LogStatus.INFO, "Entered username successfully");
		report_utility1.logger.log(LogStatus.INFO, "Entered password successfully");
		report_utility1.logger.log(LogStatus.INFO, "clicked login buttonu successfully");
		report_utility1.logger.log(LogStatus.PASS, "Login successfully");
		boolean actual=BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")).isDisplayed();
		boolean expected=BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")).isDisplayed();
		assertEquals(actual,expected,"calculator is  not displayed" );
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		report_utility1.logger.log(LogStatus.PASS, "Logout successfully");
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void loginwithinvaliddetails() throws Exception
	{		
		BrowserUtility.loginToTekArch("admin123@gmail.com", "admin");
		report_utility1.Starttestcase("LoginFailTest");
		report_utility1.logger.log(LogStatus.INFO, "Entered valid username successfully");
		report_utility1.logger.log(LogStatus.INFO, "Entered invalid password successfully");
		report_utility1.logger.log(LogStatus.INFO, "clicked login buttonn successfully");
		report_utility1.logger.log(LogStatus.FAIL, report_utility1.logger.addScreenCapture(ufTakescreenshot()));
	}
	@AfterMethod
	public static String ufTakescreenshot() throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)BrowserUtility.driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	  String destinationimage=System.getProperty("user.dir")+"//Screenshot//1.png";
	     File dest=new File(destinationimage);
	     FileUtils.copyFile(source, dest);
	     return destinationimage;
	}

	@AfterSuite
public void quitbrowser()
	{
		report_utility1.Endtestcase();
	     report_utility1.Endreport();
	BrowserUtility.quitbrowser();
	}
	
}
