package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='X']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='YBLJE4' and .='Fashion']]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();		

        driver.quit();
	}
}
