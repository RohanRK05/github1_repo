package browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlaunch 
{

	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String value="./softy/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver= new FirefoxDriver();
	}

}