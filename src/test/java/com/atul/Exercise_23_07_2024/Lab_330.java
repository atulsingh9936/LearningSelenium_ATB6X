package com.atul.Exercise_23_07_2024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Lab_330 {


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
    public void testlabSVG() throws InterruptedException {

        String url ="https://www.amcharts.com/svg-maps/?map=india";
        driver.get(url);
        driver.manage().window().maximize();
        //to perform Scroll on application using Selenium
         JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("window.scrollBy(0,350)", "");
        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state: states){
            System.out.println(state.getAttribute("aria-label"));
            if (state.getAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }





    }












    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
