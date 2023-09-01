package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectdd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rohan/Desktop/html/dropdown%20-%202.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("countries"));
		Select s = new Select(ele);
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("j");
		Thread.sleep(1000);
		s.selectByVisibleText("Korea");
		Thread.sleep(1000);
		s.deselectAll();
		Thread.sleep(1000);
		

        driver.quit();
	}
}
