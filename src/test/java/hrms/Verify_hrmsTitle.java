package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_hrmsTitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
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