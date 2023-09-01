package testng3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG31 {
	@Test
	public  void data1()
	{
		Reporter.log("hello from package2",true);
	}

	@Test
	public void data2()
	{
		Reporter.log("world from package2",true);
	}
}
