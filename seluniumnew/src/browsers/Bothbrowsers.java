package browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bothbrowsers {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
	  ChromeDriver driver =new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver","./softy/geckodriver.exe");
	  FirefoxDriver driver1 =new FirefoxDriver();
	}}
