package Pluralsight_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/vinod/eclipse-workspace/SeleniumDriver/Java_Selenium/src/WebApp/CheckBox.html");
		
		WebElement checkBox = driver.findElement(By.id("LettuceCheckbox"));
		checkBox.click();
	}
}
