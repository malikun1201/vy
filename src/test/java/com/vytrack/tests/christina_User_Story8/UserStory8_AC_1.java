package com.vytrack.tests.christina_User_Story8;

import com.github.javafaker.Faker;
import com.vytrack.pages.*;
import com.vytrack.utility.BrowserUtil;
import com.vytrack.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStory8_AC_1 extends TestBase {
    /** AC #1: drivers are able to create Vehicle Odometer.
     Given driver is on the Home Page
     When user select “Vehicle Odometer” under Fleet module
     And user click “Create Vehicle Odometer” button
     When user fill out general information and click “Save and Close” button
     Then verify “Entity saved” confirm message
     *
     */
    @Test
    public void testDriverCreateOdometer(){

        List<String> driverUsername = new ArrayList<>(Arrays.asList(	"user13" , "user14" , "user15"	));
        String password="UserUser123";

        //login for each user
        for (String eachUser : driverUsername) {
            VyTrackLoginPage loginPage= new VyTrackLoginPage();
            loginPage.goTo();
            loginPage.login(String.valueOf(eachUser),password);
            BrowserUtil.waitFor(5);
            //Given driver is on the homePage
            assertEquals("Dashboard",driver.getTitle());

            //When user select “Vehicle Odometer” under Fleet module
            VehicleOdometerPage vehicleOdometerPage= new VehicleOdometerPage();
            Actions action= new Actions(driver);
            BrowserUtil.waitFor(5);
            //hover over the Fleet Module
            action.moveToElement(driver.findElement(By.linkText("Fleet"))).perform();
            BrowserUtil.waitFor(4);
            // Click Vehicle Odometer Module
            action.click(driver.findElement(By.xpath(" //span[contains(text(),'Vehicle Odometer')]"))).perform();
            BrowserUtil.waitFor(6);

            // check the Vehicle Odometer title
            assertEquals("Vehicle Odometer - Entities - System - Car - Entities - System",driver.getTitle());
            Faker faker = new Faker();

            // And user click “Create Vehicle Odometer” button
            vehicleOdometerPage.createOdometerBtn.click();

            vehicleOdometerPage.odometerValueBox.sendKeys(faker.numerify("######"));
            /*
            action.click(driver.findElement(By.cssSelector("[name='date_selector_custom_entity_type_Date-uid-61609aeb1e8dd']"))).perform();
            action.click(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]"))).perform();
            BrowserUtil.waitFor(3);
            vehicleOdometerPage.driverBox.sendKeys(faker.name().fullName());

             */
            BrowserUtil.waitFor(6);

            // When user fill out general information and click “Save and Close” button
            vehicleOdometerPage.saveAndCloseBtn.click();

            //Then verify “Entity saved” confirm message
            String actualResult = vehicleOdometerPage.entityMsg.getText();
            assertEquals("Entity saved", actualResult);

            // logout after each user
            VyTrackLogoutPage logoutPage=new VyTrackLogoutPage();
            BrowserUtil.waitFor(2);
            logoutPage.userMenuTab.click();
            logoutPage.logoutTab.click();

// open the @AfterEach method from TestBase in order to close the browser
        }







    }



}
