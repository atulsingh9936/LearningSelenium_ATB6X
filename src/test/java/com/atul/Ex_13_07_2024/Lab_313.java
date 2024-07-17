package com.atul.Ex_13_07_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_313 {
    @Test


    public void testVWOLoginNegative() throws InterruptedException {
        //        **Project #1 - TC ( Negative) - Invalid username, pass - Error message**
//
//        1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter password as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"



        // How to find the Element
        // email ID
        // <input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // >


        // **Find the Email id** and enter the email as admin@admin.com

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
       // options.setPageLoadStrategy(PageLoadStrategy.NORMAL);


        WebDriver driver = new EdgeDriver(options);
        driver.navigate().to("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");



      WebElement  emailinputbox = driver.findElement(By.id("login-username"));
      emailinputbox.sendKeys("admin@admin.com");

      WebElement passwordinputbox =driver.findElement(By.id("login-password"));

      WebElement Buttonsubmit = driver.findElement(By.id("js-login-btn"));
      Buttonsubmit.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // Verify the error message
       // WebElement error_msg1 = driver.findElement(By.id("js-notification-box-msg"));

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");



           // id -> name, class name (not unique)
        // link text  and partial link text - a  tag anchor


      //  WebElement freetriallink = driver.findElement(By.linkText("Start a free trial"));
        WebElement freetriallink = driver.findElement(By.partialLinkText("Start a free "));
        freetriallink.click();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      driver.quit();


    }
}
