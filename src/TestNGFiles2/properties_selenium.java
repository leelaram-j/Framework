package TestNGFiles2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_selenium
{
    WebDriver driver=null;
    @Test
    public void testSelenium()  throws IOException
        {
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("/Users/lee/eclipse-workspace/Framework/src/TestNGFiles2/inputData.properties");
            prop.load(fis);
            if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
            {
                driver = new FirefoxDriver();
            }
            else if(prop.getProperty("browser").contains("chrome"))
            {
                driver = new ChromeDriver();
            }
            else
            {
                driver = new InternetExplorerDriver();
            }
            driver.get(prop.getProperty("url"));
//            driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
//            driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
//            driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
        }
}
