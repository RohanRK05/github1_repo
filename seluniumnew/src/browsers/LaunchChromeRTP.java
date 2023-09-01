package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeRTP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
