package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passdata {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/rohan/Desktop/html/passdata.html");
	
		Thread.sleep(2000);
		//WebElement ele = driver.findElement(By.tagName("input"));
		//ele.sendKeys("HelloWorld");
		//or
		//driver.findElement(By.tagName("input")).sendKeys("HelloWorld");
		//driver.findElement(By.id("a1")).sendKeys("HelloWorld");
		//driver.findElement(By.name("n1")).sendKeys("HelloWorld");
		driver.findElement(By.className("c1")).sendKeys("HelloWorld");
		}
}
