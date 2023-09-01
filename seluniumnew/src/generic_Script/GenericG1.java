package generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericG1 {
	public WebDriver driver;
	@BeforeMethod
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("http://www.instagram.com");
	}
		
		@AfterMethod
		public void closeApplication() {
			driver.close();
		}
	}


