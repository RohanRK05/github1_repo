package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);
        if(title=="Google") {
        	System.out.println("test case is passed");
        }
        else {
        	System.out.println("test case is failed");
        }
        driver.quit();
	}
}
