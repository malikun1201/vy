package com.vytrack.tests.Alina_User_Story9;
import com.vytrack.pages.CreateVehiclePage;
import com.vytrack.pages.VehicleContractCreation;
import com.vytrack.pages.VehicleOdometerPage;
import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.utility.BrowserUtil;
import com.vytrack.utility.TestBase;
import io.cucumber.java.tr.Ve;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStory9 extends TestBase{

    @Test
        public void ManagersCreateVehicleContract(){

        VyTrackLoginPage loginPage= new VyTrackLoginPage();
        loginPage.goTo();
        loginPage.login("storemanager59","UserUser123");

        BrowserUtil.waitFor(5);

        assertEquals("Dashboard",driver.getTitle());

        VehicleContractCreation contractCreation = new VehicleContractCreation();

        Actions action = new Actions(driver);
        BrowserUtil.waitFor(4);

        action.moveToElement(driver.findElement(By.linkText("Fleet"))).perform();
        BrowserUtil.waitFor(5);

        action.click(driver.findElement(By.linkText("Vehicle Contracts"))).perform();
        BrowserUtil.waitFor(4);

        contractCreation.CreateVehicleContractBtn.click();
        BrowserUtil.waitFor(5);

        contractCreation.SaveAndCloseBtn.click();
        BrowserUtil.waitFor(4);

        String expectedResult = "Entity saved";
        String actualResult = driver.findElement(By.xpath("//div[@class='message']")).getText();
        assertEquals("Entity saved", actualResult);
        System.out.println("Expected result is " + expectedResult);
        System.out.println("Actual Result is " + actualResult);






    }



    }



    /*
    As a user, I should be able to create Vehicle Contract.
AC #1: managers are able to Create Vehicle Contract.
Given store/sales manager is on the homePage
When user select “Vehicle Contract” under Fleet module
And user click “Create Vehicle Contract” button
When user fill out general information and click “Save and Close” button
Then verify “Entity saved” confirm message

AC #2: driver should not be able to create Vehicle Contract.
Given driver is on the homePage
When user select “Vehicle Contract” under Fleet module
Then verify “You do not have permission to perform this action.” message
     */

