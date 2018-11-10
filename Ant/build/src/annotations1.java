package TestNGFiles2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotations1 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Im the first");
	}

	@Test
	public void test112()
	{
		System.out.println("Im the test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Im the last");
	}

}
