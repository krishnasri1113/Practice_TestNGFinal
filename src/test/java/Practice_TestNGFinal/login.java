package Practice_TestNGFinal;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=null;
         //System.setProperty("webdriver.chrome.driver", "C:\\Users\\siri\\Downloads\\chromedriversetup\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        Thread.sleep(2000);
         driver.get("https://www.google.com");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.close();
         
	}

}
