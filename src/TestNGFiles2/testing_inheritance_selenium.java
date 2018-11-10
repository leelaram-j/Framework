package TestNGFiles2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testing_inheritance_selenium extends properties_selenium
{
    @Test
    public void inheritance() throws IOException
    {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/lee/eclipse-workspace/Framework/src/TestNGFiles2/inputData.properties");
        prop.load(fis);
        testSelenium();
        driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
        driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
    }
}
