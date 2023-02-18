package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\vinod\\Dropbox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement day =driver.findElement(By.id("day"));
		
		driver.findElement(By.xpath("//a[@id=' u_0_0_JQ']")).click();
		Select d1 = new Select(day);
		d1.deselectByIndex(21);
		d1.deselectByValue("21");
		
		/*List <WebElement> dd = d1.getOptions();
		System.out.println(dd.size());
		
		for(int i =0;i<dd.size();i++) {
			String text = dd.get(i).getText();
			System.out.println(text);
		}*/
	}

}
