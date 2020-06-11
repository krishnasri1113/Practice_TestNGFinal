package Practice_TestNGFinal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToTekArch {

	WebDriver driver;
	 @BeforeMethod
		public void launch() throws Exception
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://qa-tekarch.firebaseapp.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		@Test(priority=1)
		public void loginwithvaliddetails1() throws Exception
		{
      WebElement email=driver.findElement(By.id("email_field"));
      email.sendKeys("admin123@gmail.com");
      WebElement password=driver.findElement(By.id("password_field"));
      password.sendKeys("admin123");
      Thread.sleep(3000);
      WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
      Thread.sleep(3000);
      login.click();
      Thread.sleep(3000);
      }
		@Test(priority=2)
		public void loginwithInvaliddetails2() throws Exception
		{
			WebElement email=driver.findElement(By.id("email_field"));
		      email.sendKeys("admin123@gmail.com");
		      WebElement password=driver.findElement(By.id("password_field"));
		      password.sendKeys("admin");
		      Thread.sleep(3000);
		      WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		      Thread.sleep(3000);
		      login.click();
		      Thread.sleep(3000);
		      WebElement calculator=driver.findElement(By.xpath("//a[contains(text(),'Calculator')]"));
		      calculator.click();
			
		}
	
		  @AfterMethod 
		  public void quitbrowser() throws Exception { 
			 
			  driver.close(); 
			  }
		 
}
