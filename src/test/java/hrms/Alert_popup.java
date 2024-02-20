package hrms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		//identify Element and provide the UserName
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		
		Thread.sleep(3000);
		
		//identify Element and click the login button
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		// Switch to Alert pop_up
		Alert a=driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		System.out.println(a.getText());
		
		Thread.sleep(3000);
		// click the ok button
		a.accept();
		
		//identify Element and provide the Password
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		System.out.println("Password Given");
		
		//identify Element and click the login button
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		
		// Logout
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		
		// close the Browser
		driver.close();		

	}

}
