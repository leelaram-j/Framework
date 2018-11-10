package com.cin.extraction;
import com.qa.excelUtil.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class mcaExtraction
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
        driver.get("https://www.zaubacorp.com");
    }

    @DataProvider
    public Object[][] getTestData() throws Exception
    {
        Object [][] data= com.qa.excelUtil.excelImportUtil.getTestData("script");
        return data;
    }

    @Test(dataProvider = "getTestData")
    public void function1(String id, String name)
    {
        System.out.println(id);
        driver.findElement(By.name("searchvalue")).sendKeys(name);
        driver.findElement(By.name("op")).click();
        String sample=driver.findElement(By.xpath("//table[@id='results']/tbody/tr[1]/td[1]")).getText();
        String sample2=driver.findElement(By.xpath("//table[@id='results']/tbody/tr[1]/td[2]")).getText();
        String sample3=driver.findElement(By.xpath("//table[@id='results']/tbody/tr[1]/td[3]")).getText();
        System.out.println(sample+"\t"+sample2+"\t"+sample3);

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
