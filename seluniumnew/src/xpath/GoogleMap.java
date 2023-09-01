package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class GoogleMap {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/maps/");
		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//input[@aria-label='Starting point Your location']"));
					ele.clear();
			        ele.sendKeys("Bengaluru");
			Thread.sleep(2000);
			WebElement ele2 = driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']"));
			ele2.clear();
			ele2.sendKeys("Goa");
			ele.sendKeys(Keys.ENTER);

}
		}
	
