package com.atul.Exercise_20_07_2021;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab_324 {

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


        // select box

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
//        select.selectByIndex(1);
        select.selectByVisibleText("Option 2");

        // HTML select tag is used
        // select tag is not used - another mechanism


    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
