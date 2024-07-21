package com.atul.Exercise_20_07_2021;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab_325 {

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
    public void testVerifyJSAlert() throws InterruptedException {


        // select box

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();


        // //button[text()='Click for JS Alert']
        // //button[@onClick='jsAlert']


       // WebElement element = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
      //  WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        elementPrompt.click();

        //Aws, docker machine -> slow

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
       wait.until(ExpectedConditions.alertIsPresent());

       Alert alert = driver.switchTo().alert();
      // alert.accept();
        alert.sendKeys("Atul");
        alert.accept();
      // alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
      //  Assert.assertEquals(result,"You clicked: Ok");
      //  Assert.assertEquals(result,"You clicked: Cancel");
        Assert.assertEquals(result,"You entered: Atul");




    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
