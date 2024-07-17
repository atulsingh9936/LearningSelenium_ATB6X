package com.atul.Ex_selenium.Ex_11_07_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_305 {

    @Test


    public void TestVwoLoginTitle(){
        WebDriver driver = new EdgeDriver();
      //  driver.get(app.vwo.com");  // https is mandatory
        driver.get("https:/app.vwo.com");
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
