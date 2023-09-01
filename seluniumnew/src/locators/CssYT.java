package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssYT {

    public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http:www.youtube.com/");
	  Thread.sleep(2000);
      driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	  Thread.sleep(2000);
     // driver.findElement(By.cssSelector("div[id='dismissible']")).click();
	  //Thread.sleep(2000);
}
	}