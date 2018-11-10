package com.qa.excelImport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zaubacorp_test
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.zaubacorp.com");
        driver.findElement(By.name("searchvalue")).sendKeys("GOOGLE");
        driver.findElement(By.name("op")).click();
        String sample=driver.findElement(By.xpath("//table[@id='results']/tbody/tr[1]/td[1]")).getText();
        String sample2=driver.findElement(By.xpath("//table[@id='results']/tbody/tr[1]/td[2]")).getText();
        String sample3=driver.findElement(By.xpath("//table[@id='results']/tbody/tr[1]/td[3]")).getText();
        System.out.println(sample+"\t"+sample2+"\t"+sample3);
    }
}
