package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Status {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\vinod\\Dropbox\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement img = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		///html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img
		System.out.println(img.isDisplayed());
		System.out.println(img.isEnabled());
		System.out.println(img.isSelected());
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("VinodFB@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Viin321");
		
		//driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}
}
