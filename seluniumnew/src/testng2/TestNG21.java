package testng2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG21 {
	@Test
	public  void data1()
	{
		Reporter.log("hello from package1",true);
	}

	@Test
	public void data2()
	{
		Reporter.log("world from package1",true);
	}
}
