package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReverseTreeSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		TreeSet<String> l= new TreeSet<String>(Collections.reverseOrder());
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		int count =opt.size();
		System.out.println(count);
		for (WebElement we : opt) {
			String t=we.getText();
			l.add(t);
		}

		
		for(String t1:l) {
			System.out.println(t1);
		}
        driver.quit();
	}
}
