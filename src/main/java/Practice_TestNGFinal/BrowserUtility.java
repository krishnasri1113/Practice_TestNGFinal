package Practice_TestNGFinal ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	 static WebDriver driver=null;
		
		static void launchbrowser(String sbrowser)
		{
		if(sbrowser.startsWith("ch"))
		{
		WebDriverManager.chromedriver().setup();	
		BrowserUtility.driver=new ChromeDriver();
	    		}
		else
		{
			System.out.println("you have not given browser type correctly");
		}
		driver.manage().window().maximize();
		//driver.get("https://qa-tekarch.firebaseapp.com/");
}
		static void quitbrowser()
		 {
			 driver.quit();
		 }
		static void loginToTekArch(String sUsername, String sPassword) throws Exception
		 { 
			driver.get("https://qa-tekarch.firebaseapp.com/"); 
			WebDriverWait wait=new WebDriverWait(driver,30); 
		 WebElement email=driver.findElement(By.id("email_field"));
			wait.until(ExpectedConditions.visibilityOf(email));
			//email.sendKeys("admin123@gmail.com");
			//Thread.sleep(3000);
			email.sendKeys(sUsername);
			WebElement password=driver.findElement(By.id("password_field"));
			wait.until(ExpectedConditions.visibilityOf(password));
			//password.sendKeys("admin123");
			Thread.sleep(3000);
			password.sendKeys(sPassword);
			WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
			wait.until(ExpectedConditions.visibilityOf(login));
			//Thread.sleep(3000);
			login.click();
			Thread.sleep(3000);
			WebElement calculator=driver.findElement(By.xpath("//a[contains(text(),'Calculator')]"));
			wait.until(ExpectedConditions.visibilityOf(calculator));
			
			
		 }
		static  void waitForPageElementTovisible(WebElement eleTowait)
		{
			WebDriverWait wait=new WebDriverWait(driver,30);//After navigated to the url it will wait for 30 sec to 
			                                                        // identifi the element
			wait.until(ExpectedConditions.visibilityOf(eleTowait));
		}

}
