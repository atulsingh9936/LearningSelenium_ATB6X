package com.atul.Ex_13_07_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab_314 {
    @Test


    public void testVerifyfreetrial()  {


        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
       // options.setPageLoadStrategy(PageLoadStrategy.NORMAL);


        WebDriver driver = new EdgeDriver(options);
        driver.navigate().to("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //  WebElement freetriallink = driver.findElement(By.linkText("Start a free trial"));
        WebElement freetriallink = driver.findElement(By.partialLinkText("Start a free "));
        freetriallink.click();



        WebElement enterEmail = driver.findElement(By.id("page-v1-step1-email"));
        enterEmail.sendKeys("admin@admin.com");

        WebElement gdprConstentcheckbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        gdprConstentcheckbox.click();


      List<WebElement> buttonlist = driver.findElements(By.tagName("button"));
      buttonlist.get(0).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement errormessageifemailexists = driver.findElement(By.className("invalid-reason"));
        gdprConstentcheckbox.click();
        System.out.println(errormessageifemailexists.getText());



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        driver.quit();


    }
}
