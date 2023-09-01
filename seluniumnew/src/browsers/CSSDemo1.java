package browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo1 {

    public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http:www.facebook.com/");
	  Thread.sleep(2000);
      driver.findElement(By.name("email")).sendKeys("rohankolambakar@ymail.com");
      Thread.sleep(2000);
      driver.findElement(By.name("pass")).sendKeys("ddsdsdsdsadxas");
	  Thread.sleep(2000);
      driver.findElement(By.name("login")).click();
	  Thread.sleep(2000);
}
	}