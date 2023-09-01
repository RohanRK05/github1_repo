package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class PartialLinkTextFacebook2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("मराठी")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign Up")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Log in")).click();
	}
}

.