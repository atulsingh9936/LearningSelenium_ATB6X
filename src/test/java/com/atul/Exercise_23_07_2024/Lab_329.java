package com.atul.Exercise_23_07_2024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Lab_329 {


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
    public void testlab328() throws InterruptedException {


        String url = "https://www.flipkart.com/";
        driver.get(url);
        driver.manage().window().maximize();

        // svg-> scalable vector graphics
        //svg, path, circle, polygon
        // svg -> path -> g -> shapes


        // //*[local-name()='svg']
        // //*[name()='svg']






        driver.findElement(By.name("q")).sendKeys("macmini");
        Thread.sleep(6000);
        List <WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

    }












    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
