package com.atul.Exercise_20_07_2021;

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

public class Lab_327 {

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


        String url = "https://awesomeqa.com/webtable.html";
        driver.get(url);
        driver.manage().window().maximize();
        // Print all the data in the table. - P1
        // Halen belong to which country  - P2


        // row -> //table[@id='customers']/tbody/tr
        //table[@id='customers']/tbody/tr[2]/td

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();


        //table[@id="customers"]/tbody/tr[i]/td[j]
        // i = 1 to 7
        // j = 1 to 3

        // xpath =>  //table[@id='customers']/tbody/tr[5]/td[2]


        // xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";


        for(int i=2; i<= row;i++){
            for( int j=1;j<= col;j++){
                String dynamic_xpath = first_part+i+second_part+j+third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
               // System.out.println(data);
                if(data.contains("Helen Bennett")){

                    String country_path = dynamic_xpath + "//following-sibling::td";
                    String country_company = dynamic_xpath + "//preceding-sibling::td";
                    String country_text= driver.findElement(By.xpath(country_path)).getText();
                    String _company_text = driver.findElement(By.xpath(country_company)).getText();
                    System.out.println("-------");
                    System.out.println("Helen Bennett is In "+ country_text);
                    System.out.println("helen bennett company is "+ _company_text);

                }






            }
        }







    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
