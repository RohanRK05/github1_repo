package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class openSeleniumDevTab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		WebElement r1 = driver.findElement(By.xpath("//a[@href='/downloads']"));
		WebElement r2 = driver.findElement(By.xpath("//a[@href='/documentation']"));
		WebElement r3 = driver.findElement(By.xpath("//a[@href='/projects']"));
		WebElement r4 = driver.findElement(By.xpath("//a[@href='/support']"));
		WebElement r5 = driver.findElement(By.xpath("//a[.='Blog']"));
		
		Actions act=new Actions(driver);
		ArrayList<WebElement> l=new ArrayList<WebElement>();
		l.add(r1);l.add(r2);l.add(r3);l.add(r4);l.add(r5);
		for( WebElement l1:l) {
		act.contextClick(l1).perform();	
		Thread.sleep(2000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);}
		{Set<String> allwh = driver.getWindowHandles();
		ArrayList<String>l2=new ArrayList<String>(allwh);
		Thread.sleep(2000);
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			String l3 = l2.get(1);
			driver.switchTo().window(l3);
		}
		}

        //driver.quit();
	}
}
