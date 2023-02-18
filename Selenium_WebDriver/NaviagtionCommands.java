package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaviagtionCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String appURL = "https://demoqa.com/";
		driver.get(appURL);
		
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(appURL);
		driver.navigate().refresh();
		
		driver.close();
	}
}
