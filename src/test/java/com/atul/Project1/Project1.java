package com.atul.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project1 {


    @Test
    public void validlogin()throws InterruptedException{

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("guest");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");

        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("atul.singh2189@gmail.com");

        WebElement pass = driver.findElement(By.id("login-password"));
        pass.sendKeys("Atul9936@");

        WebElement button = driver.findElement(By.id("js-login-btn"));
        button.click();

        Thread.sleep(5000);

        WebElement text = driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
        Assert.assertEquals(text.getText(),"Atul Singh");

        Thread.sleep(7000);


        driver.quit();
    }



}
