package TestNGFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
	
	@Test(groups = "Priority1")
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
