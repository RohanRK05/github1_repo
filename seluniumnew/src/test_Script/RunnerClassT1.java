package test_Script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_Script.GenericG1;

public class RunnerClassT1 extends GenericG1 {
	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rohan.r.kolambkar@ymail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("HelloWorld");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
	}

}
