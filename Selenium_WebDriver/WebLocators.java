package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLocators {
	
	//WebLocators 
	
	public static void main(String[] args) {
		System.out.println("Execution started-- Opening Firefox browser.");
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\vinod\\Dropbox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*WebElement loc = driver.findElement(By.id("email"));
	    loc.sendKeys("vinodfb@gmail.com");	
	    
	    WebElement name = driver.findElement(By.name("pass"));
	    name.sendKeys("234432");
	    
	    WebElement login = driver.findElement(By.className("_6ltg"));
	    login.click();
	    
	    WebElement privacy_policy = driver.findElement(By.linkText("Privacy Policy"));
	    privacy_policy.click();
	   
	    WebElement partial =  driver.findElement(By.partialLinkText("Privacy"));
	    partial.click();*/
		
		////*[@id="email"]
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Welecome");
		
		///html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]
	    
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Welcome");
	    driver.close();
	    
	    
	 }

}
