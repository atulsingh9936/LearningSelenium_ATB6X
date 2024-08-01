package com.atul.Project3;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project3 {
    @Test
    public void verifproject3() throws InterruptedException {


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("guest");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        username.sendKeys("ledem48861@padvn.com");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        username.sendKeys("Test@123");


        Thread.sleep(3000);

        WebElement signbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        signbutton.click();

        Thread.sleep(5000);
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.idrive360.com/enterprise/login",url);


        WebElement Message = driver.findElement(By.xpath("//div[@id='upgrade']/span"));
        Assert.assertEquals(Message.getText(),"Your free trial expires in");
        Thread.sleep(80000);


        driver.quit();
    }
}