package Practice_TestNGFinal;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertions {
	
	@Test
	 public void assertion(){
	 //Instantiation of driver object. To launch Firefox browser
		WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
	 //To open the URL
	 driver.get("https://www.softwaretestingmaterial.com");
	 //Actual title is "Software Testing Material - A site for Software Testers" 
	 //We took title as "Software Testing Material" to make the test fail
	 String Title = "Software Testing Material";
	 String GetTitle = driver.getTitle();
	 System.out.println("Assertion starts here...");
	 try{
	 Assert.assertEquals(Title, GetTitle);
	 }catch (Throwable t){
	 System.out.println("A blog for Software Testers");
	 }
	 driver.quit();
	 }
	 

}
