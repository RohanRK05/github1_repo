package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Instagram {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.instagram.com");
		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rohan.r.kolambkar@ymail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("HelloWorld");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			

}
		}
	
