package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessMode {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution with headless mode");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setHeadless(true);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com");
		Thread.sleep(3000);
		System.out.println("The browser title is "+driver.getTitle());
		
		//This method fetches the string representing the Current URL
		System.out.println("The browser current URL is "+driver.getCurrentUrl()); 
		
		//This method returns the Source Code of the page
		System.out.println("The source code of page is "+driver.getPageSource());
		
		/*WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.javatpoint.com/selenium-webdriver-first-test-case");
		Thread.sleep(300);*/
		
		driver.close();
		System.out.println("Execution complete");
	}
}
