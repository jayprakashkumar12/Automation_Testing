package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_Title {
	public static void main(String[] args) throws Exception{
		// Provide the FireFox Path and other Name GeckoDriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		
		// Create the Object of FirefoxDriver in Selenium (Parant class is a WebDriver)
		WebDriver driver = new FirefoxDriver();
		
		// Provide The URL Methods
		driver.navigate().to("https://www.google.com/");
		
		// Sometime wait Methods
		Thread.sleep(3000);
		
		// Maximize the window Methods
		driver.manage().window().maximize();
		
		// Sometime wait Methods
		Thread.sleep(3000);
		
		String s = driver.getTitle();
		
		System.out.println(s);
		
		// Validation the title
		
		if (s.equals("Google"))
				{
					System.out.println("correct title");
				}
		else
		{
			System.out.println("in_correct title");
		}
		
		// Close the Browser Methods
		driver.close();
	}

}
