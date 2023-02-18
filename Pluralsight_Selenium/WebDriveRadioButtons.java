package Pluralsight_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriveRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/vinod/eclipse-workspace/SeleniumDriver/Java_Selenium/src/WebApp/RadioTest.html");
	     
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
	    radioButtons.get(1).click();
	    
	    for(WebElement radioButton : radioButtons) {
	    	if(radioButton.isSelected()) {
	    		System.out.println(radioButton.getAttribute("value"));
	    	}
	    }
	    
	    
	}

}
