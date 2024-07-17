package com.atul.Ex_selenium.Ex_11_07_2024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab_298 {


    @Test
    public void vwologin(){



        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();


        // selenium flow

        // 1. Create SessionID - q09876q789e8wq89we87
        // Client - Java(Program)
        // Server - Web driver Edge - Command W3C -> Edge browser
        // 2. Session -> Run the commands - GET -> GET Method w3c Protocol
        // 3. EdgeDriver (Server) -> Tell the Edge Browser
        // 4. Open a Fresh copy of the Edge Browser and
        // Open the URL - https//sdet.live
        // 5. Driver - Command (POST) Request - Shutdown the browser. SessionID == null




    }
}
