package Practice_TestNGFinal;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_chromelaunch {
	
	@Test
	public void chromelaunch()
	{
		WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
     driver.manage().window().maximize();
     System.out.println(driver.getCurrentUrl());
     driver.close();
	}

}
