package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AddEmployee {
	
	public static void main(String[] args) throws InterruptedException {
		// Provide FirefoxDriver Path Methods
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		
		// Create the Object of FirefoxDriver in Selenium (Parant class is a WebDriver)
		WebDriver driver = new FirefoxDriver();
		
		// Provide The URL Methods
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		
		//identify Element and provide the UserName
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		
		//identify Element and provide the Password
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		//identify Element and click the login button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		//Enter into Frame
		driver.switchTo().frame("rightMenu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"txtEmpLastName\"]")).sendKeys("Kumar");
		//Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Jay");
	//	Thread.sleep(3000);
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Prakash");
	//	Thread.sleep(3000);
		driver.findElement(By.name("txtEmpNickName")).sendKeys("Amar");
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
		System.out.println("New Employee Added");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		// Logout
		driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
		driver.close();
	}

}
