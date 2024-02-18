package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser1 {
	public static void main(String[] args) throws Exception {
		// Provide CheomeDriver Path Methods
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\chromedriver.exe");
		
		//Create the Object of ChromeDriver(Class) in Selenium (Parant class is a WebDriver)
		WebDriver driver = new ChromeDriver();
		
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
