package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class FacebookLogin {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohan.r.kolambkar@ymail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("HelloWorld");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			

}
		}
	
