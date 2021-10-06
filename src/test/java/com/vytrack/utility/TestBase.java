package com.vytrack.utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    // we want only subclasses of TestBase have access to this.
    protected WebDriver driver;

    // setting up all driver stuff here directly in @BeforeEach method
    @BeforeEach
    public void setupWebDriver() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfigurationReader.read("login_url"));
    }
/*
     //commented this out due to leaving browser open to troubleshoot testing code.
    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }

 */
}
