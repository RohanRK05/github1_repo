package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


	public class DemoQA {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/automation-practice-form");
		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rohan");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kolambkar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("rohan.r.kolambkar@ymail.com");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//label[.='Male']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9876543210");
			Thread.sleep(2000);
			
		
			 driver.findElement(By.id("dateOfBirthInput")).click();
			 WebElement ele2 = driver.findElement(By.className("react-datepicker__month-select"));
			 Select mon= new Select(ele2);
			 mon.selectByIndex(3);
			 WebElement ele3 = driver.findElement(By.className("react-datepicker__year-select"));
			 Select yr = new Select(ele3);
	         yr.selectByValue("1998");
	         driver.findElement(By.xpath("//div[text()='16']")).click();
	         driver.findElement(By.id("currentAddress")).sendKeys("bangalore");
	         driver.findElement(By.xpath("//*[name()='svg']")).click();
			
			/*driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kolambkar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("rohan.r.kolambkar@ymail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[.='Male']")).click();*/
			

}
		}
	
