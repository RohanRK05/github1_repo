package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class ImplicitWait {
		public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://automation-lab/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("admin");
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.xpath("//div[text()='Tasks']")).click();
			driver.findElement(By.xpath("//div[text()='Reports']")).click();
			driver.findElement(By.xpath("//div[text()='Users']")).click();
			

}
		}
	
