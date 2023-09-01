package parallelNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void test1(String browser) {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./softy/msedgedriver.exe");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
			driver.get("https://www.youtube.com");
		}
		else {
			driver=new EdgeDriver();
			driver.get("https://www.youtube.com");
		}
	}

}


