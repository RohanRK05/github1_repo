package Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


	public class FacebookLogin {
		@Test
		public static void data4() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
		
			//Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohan.r.kolambkar@ymail.com");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("HelloWorld");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@name='login']")).click();
			String title = driver.getTitle();
			Reporter.log(title,true);
			driver.close();

}
		}
	
