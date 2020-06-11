package Practice_TestNGFinal;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Invalidcredentials extends report_utility1 {
	@BeforeSuite
	public static void launch()
	{
		BrowserUtility.launchbrowser("ch");
		report_utility1.Createreport("Invalidcredentials");
		//report_utility1.Starttestcase("LoginFailTest");
		//report_utility1.logger.log(LogStatus.INFO, "Browser launched");
		}
	@Test
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
	//BrowserUtility.driver.close();
		report_utility1.Endtestcase();
	     report_utility1.Endreport();
	BrowserUtility.quitbrowser();
	}
	

}
