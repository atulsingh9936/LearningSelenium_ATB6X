package com.atul.Ex_selenium.Ex_11_07_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab_302 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        WebDriver driver2 = new EdgeDriver();
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

    }
}
