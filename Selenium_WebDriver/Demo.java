package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Execution started-- Opening Firefox browser.");
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\vinod\\Dropbox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Navigate to web page 
		driver.get("https://demoqa.com");
		
		//suspend execution for a specified period.
		Thread.sleep(3000);
		
		//closes all browser windows
		driver.quit();
		System.out.println("Execution complete-- web driver session is closed");
		 
	}
}
