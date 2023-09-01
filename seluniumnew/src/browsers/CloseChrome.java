package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChrome {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
	  ChromeDriver driver =new ChromeDriver();
	  Thread.sleep(2000);
	  driver.close();//close one tab
	  driver.quit();//close all the tabs

	}

}