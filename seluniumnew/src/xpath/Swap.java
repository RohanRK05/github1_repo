package xpath;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Swap {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/rohan/Desktop/html/swap.html");
		
			Thread.sleep(2000);
			
			WebElement ele = driver.findElement(By.xpath("//input[1]"));
			ele.sendKeys(Keys.CONTROL+"A,X");
			Thread.sleep(2000);
			WebElement ele3 = driver.findElement(By.xpath("//input[3]"));
			ele3.sendKeys(Keys.CONTROL+"V");
			Thread.sleep(2000);
			WebElement ele2 = driver.findElement(By.xpath("//input[2]"));
			ele2.sendKeys(Keys.CONTROL+"A,X");
			Thread.sleep(2000);
			ele.sendKeys(Keys.CONTROL+"V");
			Thread.sleep(2000);
			ele3.sendKeys(Keys.CONTROL+"A,X");
			Thread.sleep(2000);
			ele2.sendKeys(Keys.CONTROL+"V");
			driver.quit();
			

}
		}
	
