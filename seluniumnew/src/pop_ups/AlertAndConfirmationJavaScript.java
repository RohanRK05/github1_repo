package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class AlertAndConfirmationJavaScript {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.name("cusid")).sendKeys("admin");
			Thread.sleep(2000);
			
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
			
			Alert a= driver.switchTo().alert();
			String t = a.getText();
			System.out.println(t);
			//a.dismiss();
			a.accept();

}
		}
	
