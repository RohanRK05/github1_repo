package listOfWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.xpath("//img"));
		int count=link.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement we = link.get(i);
			//we.click();
		    Object url = we.getAttribute("src");
			System.out.println(url);
		}
        
        driver.quit();
	}
}
