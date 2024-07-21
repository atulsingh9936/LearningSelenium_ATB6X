package com.atul.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project2 {

    @Test
    public void verifyurl(){


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("guest");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement button = driver.findElement(By.id("btn-make-appointment"));
        button.click();

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://katalon-demo-cura.herokuapp.com/profile.php#login");




    }

}
