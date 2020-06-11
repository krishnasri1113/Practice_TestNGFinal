package Practice_TestNGFinal;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();

		driver.get("http://www.google.com");
		

	}

}
