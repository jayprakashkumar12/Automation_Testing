package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_URL {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SASARAM DON\\eclipse-workspace\\Automation_Testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getClass());
	}

}
