package com.vytrack.tests.Alina_User_Story9;

import com.vytrack.pages.VehicleContractCreation;
import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.utility.BrowserUtil;
import com.vytrack.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStory9_AC2 extends TestBase {
    @Test
    public void DriverCannotCreateVehicleContract() {
        VyTrackLoginPage loginPage = new VyTrackLoginPage();
        loginPage.goTo();
        loginPage.login("user13", "UserUser123");

        BrowserUtil.waitFor(5);

        Assertions.assertEquals("Dashboard", driver.getTitle());

        VehicleContractCreation contractCreation = new VehicleContractCreation();

        Actions action = new Actions(driver);
        BrowserUtil.waitFor(4);

        action.moveToElement(driver.findElement(By.linkText("Fleet"))).perform();
        BrowserUtil.waitFor(5);

        action.click(driver.findElement(By.linkText("Vehicle Contracts"))).perform();
        BrowserUtil.waitFor(4);

        String expectedResult = "You do not have permission to perform this action.";
        String actualResult = driver.findElement(By.xpath("//*[@id='flash-messages']/div/div/div[2]/div")).getText();
        assertEquals("You do not have permission to perform this action.", actualResult);
        System.out.println("Expected result is " + expectedResult);
        System.out.println("Actual Result is " + actualResult);
        /*
        AC #2: driver should not to create Vehicle Contract.
        Given driver is on the homePage
        When user select “Vehicle Contract” under Fleet module
        Then verify “You do not have permission to perform this action.” message
         */





    }
}
