package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FirefoxBrowser2 {
	public static void main(String[] args) throws Exception{
		// Provide the Firefox Path and other Name GeckoDriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		
		// Create the Object of FirefoxDriver in selenium (Parant class is a WebDriver)
		WebDriver driver = new FirefoxDriver();
		
		// Provide The URL Methods
		driver.navigate().to("https://www.google.com/");
		
		// Sometime wait Methods
		Thread.sleep(3000);
		
		// Maximize the window Methods
		driver.manage().window().maximize();
		
		// Sometime wait Methods
		Thread.sleep(3000);
		
		// Close the Browser Methods
		driver.close();
	}

}
