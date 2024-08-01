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

public class Lab_328 {


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


        String url = "https://awesomeqa.com/webtable1.html";
        driver.get(url);
        driver.manage().window().maximize();


        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));
        System.out.println(rows_tables.size());

        for(int i=0; i< rows_tables.size();i++){
            List<WebElement> col = rows_tables.get(i).findElements(By.tagName("td"));

            for (WebElement c:col){
                System.out.println(c.getText());
            }

        }

    }











    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
