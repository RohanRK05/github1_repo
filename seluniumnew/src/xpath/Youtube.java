package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	 public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http:www.youtube.com/");
		  Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Chandrayan 3 launch");
	     // Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		  Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@id='video-title' and @title='Launch of LVM3-M4/CHANDRAYAAN-3 Mission from Satish Dhawan Space Centre (SDSC) SHAR, Sriharikota']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	}

}
