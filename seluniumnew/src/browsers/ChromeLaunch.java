package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softy/chromedriver.exe";
		System.setProperty(key,value);
	  ChromeDriver driver =new ChromeDriver();
	  driver.get("https://www.youtube.com");

	}

}