package Practice_TestNGFinal;


import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_Login {
	//Suite -- When you want to run multiple testngClasses. you are going to use that
	 //select two testcases click on TestNG ->click on covert to TestNG
	//you will get testNG.xml->Run as TestNG suite
	//by using include and exclude  ,by using include you can include the testcase  whatever you want 
	//,by using exclude you can exclude whatever you want this can be done in regression.xml
	//we can group by different testing also like sanity,regression
	Logger log = Logger.getLogger(getClass().getSimpleName());
//	@BeforeSuite
//	public void settinglog4j() throws Exception
//	{
//		propertyfilereading.log4jpropertyfile(System.getProperty("user.dir")+"\\Properties\\log4j.properties");
//		System.out.println(System.getProperty("user.dir"));
//	}
	
	@Test
	public void Login_01()
	{
		System.out.println("login_01 executed");
		log.info("login_01 executed");
	}
	@Test
	public void Login_02()
	{
		System.out.println("login_02 executed");
		log.info("login_02 executed");
	}
	@Test
	public void Login_03()
	{
		System.out.println("login_03 executed");
		log.error("login_03 executed");
	}
	@Test
	public void Login_04()
	{
		System.out.println("login_04 executed");
		log.debug("login_04 executed");
	}



}
