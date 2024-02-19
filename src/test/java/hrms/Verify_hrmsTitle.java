package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_hrmsTitle {
	public static void main(String[] args) {
		// Provide FirefoxDriver Path Methods
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		
		// Create the Object of FirefoxDriver in selenium (Parant class is a WebDriver)
		WebDriver driver = new FirefoxDriver();
		
		// Provide The URL Methods
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		// Maximize the window Methods
		driver.manage().window().maximize();
		
		//identify Element and provide the UserName
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		
		//identify Element and provide the Password
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		//identify Element and click the login button
		driver.findElement(By.name("Submit")).click();
		
		// Print Title
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Title is Matched");
		}
		else
		{
			System.out.println("Title is not Matched");
		}
		driver.close();
		
	}

}
