package com.atul.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

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

        WebElement username = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        username.sendKeys("John Doe");
        WebElement password =  driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginbutton = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        loginbutton.click();



        String url1 = driver.getCurrentUrl();
        Assert.assertEquals(url1,"https://katalon-demo-cura.herokuapp.com/#appointment");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.textToBePresentInElement("Make Appointment"));


        WebElement title = driver.findElement(By.tagName("h2"));
        Assert.assertEquals(title.getText(),"Make Appointment");




    }

}
