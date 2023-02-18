package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\vinod\\Dropbox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("Back done"); 
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("Forward done");
		
		driver.navigate().refresh();
		System.out.println("Refresh done");
		//driver.close();
	}
}
