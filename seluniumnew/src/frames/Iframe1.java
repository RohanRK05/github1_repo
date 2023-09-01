package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rohan/Desktop/html/mainpage.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("QSpiders");
		WebElement frame = driver.findElement(By.tagName("iframe"));
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("frame");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='p1']")).sendKeys("Rajajinagar");
		Thread.sleep(2000);
        driver.quit();
	}
}
