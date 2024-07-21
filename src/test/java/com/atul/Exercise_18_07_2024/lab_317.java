package com.atul.Exercise_18_07_2024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class lab_317 {



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

        // Navigate to the url-> https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067

        driver.navigate().to(" https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        System.out.println(driver.getTitle());

        driver.manage().window().maximize();

        // search element
        // #gh-ac
        // input[id ="gh-ac"] ->xpath  -> //input[@id ="gh-ac"]

       // WebElement searchbox = driver.findElement(By.xpath("//input[@id ='gh-ac']"));
        WebElement searchbox = driver.findElement(By.cssSelector("input[id ='gh-ac']"));
        searchbox.sendKeys("macmini");   // find the "macmini"
        // click on search


      //  WebElement searchboxbutton = driver.findElement(By.className(".gh-spr"));
        WebElement searchboxbutton = driver.findElement(By.cssSelector("input[value ='Search']"));
        searchboxbutton.click();

        Thread.sleep(3000);  // we will replace this in future

        // print all the titles
        // .s-item__title

     List<WebElement> searchtitle = driver.findElements(By.cssSelector(".s-item__title"));
     List<WebElement> searchtitlePrices = driver.findElements(By.cssSelector(".s-item__price"));
//     for (WebElement title :searchtitle){
//         System.out.println(title.getText());
//     }
//
//     for(WebElement prices: searchtitlePrices){
//         System.out.println(prices.getText());
//     }

        int size = Math.min(searchtitle.size(),searchtitlePrices.size());
        for(int i=0; i<size;i++){
            System.out.println("Title :"+ searchtitle.get(i).getText()+ "||" + "price: "+ searchtitlePrices.get(i).getText());
            System.out.println();
        }



        // img[title*="Flip"] - contains
        // img[title^="Flip"] - starts-with
        // img[title$="Flip"] - end-with
        // div.first > span:nth-child(2n+1)
        // div.first > span


        // select -> simple, custom select (div, ui-li)- different approach



        // why do we need waits in selenium
        // Thread.sleep()-> jvm to stop the execution -> worst type of wait - it will halt the jvm
        // do that

            // implicit wait -> bad

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // gives no such element exception



    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}