package com.atul;

import org.openqa.selenium.edge.EdgeDriver;

public class Helloworld {
    public static void main(String[] args) {
        EdgeDriver Driver = new EdgeDriver();
        Driver.get("https://courses.thetestingacademy.com/");

    }
}
