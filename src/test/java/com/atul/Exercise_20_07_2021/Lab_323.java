package com.atul.Exercise_20_07_2021;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.atul.WaitHelper.checkVisibility;

public class Lab_323 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA")
    @Description("Test case description")
    public void testVerifyFreeTrial() throws InterruptedException {



        // Normal script with thread.sleep

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);





        driver.navigate().to("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.findElement(By.id("login-username")).sendKeys("atul.singh2189@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Atul9936@");
        driver.findElement(By.id("js-login-btn")).click();

       // wait to dashboard to load - fluent wait

        Wait<EdgeDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)) // 5 times
                .ignoring(NoSuchElementException.class);






        WebElement loggedin_username=wait.until(driver-> driver.findElement(By.cssSelector("[data-qa='lufexuloga']")));
        System.out.println("Logged in User details -> " + loggedin_username.getText());
        Assert.assertEquals(loggedin_username.getText(),"Atul Singh");

    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
