package Selenium_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DesiredCapabilities {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution with desired capabilities");
		DesiredCapabilities dc =  new DesiredCapabilities ();
		dc.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com");
		Thread.sleep(3000);
		driver.quit();
        System.out.println("Execution completed");
	}

	private void setCapability(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

}
