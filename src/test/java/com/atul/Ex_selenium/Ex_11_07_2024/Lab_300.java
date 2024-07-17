package com.atul.Ex_selenium.Ex_11_07_2024;

import org.openqa.selenium.edge.EdgeDriver;

public class Lab_300 {
    public static void main(String[] args) {
      //  SearchContext driver = new EdgeDriver(); // dynamic dispatch(Runtime polymorphism)
        // possible but only two functions, which is not much used
//        driver.findElement();
//        driver.findElements()

//        WebDriver driver = new EdgeDriver();
        // 12 functions which are good

       // RemoteWebDriver driver = new EdgeDriver();

        EdgeDriver driver  = new EdgeDriver();
        // Scenarios

        // 1. Do want to run on  Chrome or Edge?
//        ChromeDriver driver = new ChromeDriver();
//        EdgeDriver driver2 = new EdgeDriver();


        // 2  Do you want to run on Chrome then change to Edge ?
        // WebDriver driver = new ChromeDriver();
        // driver = new EdgeDriver(); 90%



        // 3. do you want to run on multiple browsers?
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)




    }
}
