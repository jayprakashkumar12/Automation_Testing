package hrms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");
		driver.manage().window().maximize();
		//identify Element and provide the UserName
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		
		// Find the Password Element and Provide the Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
		
		//Create the Object of RobotClass
		Robot r = new Robot();
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Login Completed ");
		
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("Logout Completed");
		
		driver.close();
		
		
	}

}
