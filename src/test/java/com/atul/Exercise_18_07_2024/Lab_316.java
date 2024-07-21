package com.atul.Exercise_18_07_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab_316 {


    public void testVerifyFreeTrial(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--Guest");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getTitle());


        // Xpath - Query language to find the elements in the Html document
        // relative
        // absolute - nobody uses -1%

        // core logic -> //tagname[@attribute= value]
        // xpath functions-> text(), contains, start with, end with(), substring, normalize space() - trim the text
        // xpath - axes -> ancestors, following - sibling, parent, child, descendants,preceding siblings

        // css selector
      //  core logic css selector -> tagname[attribute= value] ->//tagname[@attribute= value]


        // css selectors are used to search elements in an HTML or XML document
        // in order to apply styles or other manipulations to those elements

        // normal selector  -> css selector
        // by.id => #id
        // classname -> .class
        // custom attribute -< input type ="text data-qa = "abc"/> -> [data-qa ="abc"]
        // convert xpath -> css selector also

        // css selectors functions

        // contains xpath contains() -> *
        // start with() - xpath ->> ^
        // ends with () xpath -> $





    }
}
