package com.atul.Ex_13_07_2024;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab_308 {
    public static void main(String[] args) throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
      //  options.addArguments("--start-maximized");
       // options.addArguments("--window-size=800,600");
       // options.addArguments("--guest");


        Proxy proxy = new Proxy();
        proxy.setHttpProxy("222.129.35.173:57114");
        options.setCapability("proxy", proxy);

                // browser in headless mode(No UI) or full  mode

                // 1.Headless - No UI, performance good , fast execution
                //2. full mode - UI, Performance lag >100
                //options - browser- Start Maximize , add extension, add options or parameters

        WebDriver driver = new EdgeDriver(options);
       // driver.get("https:/google.com");
        driver.get("https://whatismyipaddress.com/");
      //  driver.get("https://exchange-staging-v3.lcx.com/");

      driver.manage().window().maximize();
       // driver.manage().window().minimize();
        Thread.sleep(5000); // worst way to add wait in the script
       // driver.quit();
    }
}
