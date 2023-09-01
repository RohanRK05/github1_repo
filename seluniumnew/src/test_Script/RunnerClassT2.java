package test_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_Script.POM_ScriptP1;

public class RunnerClassT2 {
	@Test
	public void click1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automation-lab/login.jsp");
		POM_ScriptP1 p1=new POM_ScriptP1();
		p1.clickAgain();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p1.clickAgain();
		
	}

}
