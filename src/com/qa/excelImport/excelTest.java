package com.qa.excelImport;
import com.qa.excelUtil.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class excelTest
{
    WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        driver=new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.schoox.com/login.php");
    }

    @DataProvider
    public Object[][] getTestData() throws Exception
    {
        Object [][] data= testUtil.getTestData("script");
        return data;
    }

    @Test(dataProvider = "getTestData")
    public void function1(String name,String password)
    {
        driver.findElement(By.name("username")).sendKeys(name);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"main\"]/p[2]/input")).click();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
