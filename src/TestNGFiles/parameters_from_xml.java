package TestNGFiles;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters_from_xml
{
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("I'm the first");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("I'm the last");
    }

    @Test
    @Parameters({"adminUserId"})
    public void test1(String adminUserId)
    {
        System.out.print("The admin User Id is "+adminUserId+"\n");
    }
}
