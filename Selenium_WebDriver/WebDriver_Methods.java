package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\vinod\\Dropbox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Title is "+ title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is "+currentUrl);
		
		WebElement fb = driver.findElement(By.id("email"));
		
		System.out.println(fb.getAttribute("id"));
		System.out.println(fb.getTagName());
		
		driver.close();
	}
}
