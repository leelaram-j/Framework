package Framework.TestNGFiles2;

import org.testng.annotations.*;

public class annotations
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test execution");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Each test execution print this");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Sample test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Sample Test 2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Test Execution Completed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Print this after execution of every Method");
	}
}
