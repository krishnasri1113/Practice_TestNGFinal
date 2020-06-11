package Practice_TestNGFinal;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class report_utility1 {
	 static ExtentReports reports;
	 static ExtentTest logger;
	 static void Createreport(String testcasename)
	{
	  String spath=System.getProperty("user.dir")+"//ExtentReport//Reports_"+testcasename+".html";
	  reports=new ExtentReports(spath);
	}
	static void Starttestcase(String testcasename)
	{
		logger=reports.startTest(testcasename);
	}
	
	static void Endtestcase()
	{
		reports.endTest(logger);
	}
	static void Endreport()
	{
		reports.flush();
		System.out.println("Report done successfully");
	}
	

	
}
