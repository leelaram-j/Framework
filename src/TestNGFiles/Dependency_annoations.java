package TestNGFiles;

import org.testng.annotations.Test;

public class Dependency_annoations
{
    @Test
    public void test1()
    {
        System.out.println("Execution 1");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2()
    {
        System.out.println("Execution 2 happens only if Execution1 is success");
    }

    @Test(enabled=true)
    public void test3()
    {
        System.out.println("This will be printed if teh function is enabled");
    }
}
