package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AddEmployee {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
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
