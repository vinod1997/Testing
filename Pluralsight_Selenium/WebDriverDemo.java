package Pluralsight_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\vinod\\Dropbox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://app.pluralsight.com");
		driver.get("http://www.google.com");
		
		WebElement searchField = driver.findElement(By.className("gLFyf"));
		searchField.click();
		searchField.sendKeys("pluralsight");
		searchField.sendKeys(Keys.ENTER);
		
		driver.getPageSource().contains("Learning paths");
	}
}
