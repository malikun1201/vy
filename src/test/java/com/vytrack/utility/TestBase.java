package com.vytrack.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * This class is meant to be super class
 * to provide driver set up and closing browser
 * for it's subclasses
 */

public class TestBase {

   protected WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){
     //   WebDriverManager.chromedriver().setup();
     //   driver = new ChromeDriver();
     //   driver.manage().window().maximize();

        driver = Driver.getDriver();   // WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    @AfterEach
    public void quitBrowser(){
       // driver.quit();
        Driver.closeBrowser();
    }

}
