package TestNGFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class annotations1 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Im the first");
	}

	@Test(groups = "Priority1",dataProvider = "getData")
	public void test112(String username,String password)
	{
		System.out.println("User name is "+username+" and password is "+password);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Im the last");
	}

	@DataProvider
    public Object[][] getData()
    {
        // Object [i][j] means i->number of time the test should run,j means no. of parameters for a single run
        Object[][] data = new Object[2][2];
        data [0][0]="1abcd";
        data [0][1]="1xyz";
        data [1][0]="2abcd";
        data [1][1]="2xyz";
        return data;
    }
}
