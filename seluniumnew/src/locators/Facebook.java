package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("rohan.r.kolambkar@ymail.com");
		driver.findElement(By.name("pass")).sendKeys("HelloWorld");
		driver.findElement(By.name("login")).click();
		
		}
}
