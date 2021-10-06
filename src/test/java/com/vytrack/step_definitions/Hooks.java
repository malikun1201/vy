package com.vytrack.step_definitions;

import com.vytrack.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setupDriver(){
        System.out.println("This is from @Before inside hook class");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void teardown(){
        System.out.println("This is from @After inside hook class");
        Driver.closeBrowser();

    }


}
