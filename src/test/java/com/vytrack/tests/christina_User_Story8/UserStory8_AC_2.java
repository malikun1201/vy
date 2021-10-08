package com.vytrack.tests.christina_User_Story8;

import com.vytrack.pages.VehicleOdometerPage;
import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.pages.VyTrackLogoutPage;
import com.vytrack.utility.BrowserUtil;
import com.vytrack.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStory8_AC_2 extends TestBase {
    /**
     * AC #2: managers should not to create Vehicle Odometer.
     * Given store/sales manager is on the Home Page
     * When user select “Vehicle Odometer” under Fleet module
     * Then verify “You do not have permission to perform this action.” message
     */
    @Test
    public void testSalesManagerCreateOdometer() {

        List<String> salesUsername = new ArrayList<>(Arrays.asList("salesmanager113", "salesmanager114", "salesmanager115"));
        String password = "UserUser123";

        //login for each user
        for (String eachUser : salesUsername) {
            VyTrackLoginPage loginPage = new VyTrackLoginPage();
            loginPage.goTo();
            loginPage.login(String.valueOf(eachUser), password);
            BrowserUtil.waitFor(5);
            //Given driver is on the homePage
            assertEquals("Dashboard", driver.getTitle());

            //When user select “Vehicle Odometer” under Fleet module
            VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
            Actions action = new Actions(driver);
            BrowserUtil.waitFor(6);
            //hover over the Fleet Module
            action.moveToElement(driver.findElement(By.linkText("Fleet"))).perform();
            BrowserUtil.waitFor(4);
            // Click Vehicle Odometer Module
            action.click(driver.findElement(By.xpath(" //span[contains(text(),'Vehicle Odometer')]"))).perform();
            BrowserUtil.waitFor(6);

            String actualResult = vehicleOdometerPage.flashMessage.getText();
            Assertions.assertEquals("You do not have permission to perform this action.", actualResult);

            // logout after each user
            VyTrackLogoutPage logoutPage=new VyTrackLogoutPage();
            BrowserUtil.waitFor(2);
            logoutPage.userMenuTab.click();
            logoutPage.logoutTab.click();
        }
    }

    @Test
    public void testStoreManagerCreateOdometer() {
        List<String> storeUsername = new ArrayList<>(Arrays.asList("storemanager59", "storemanager60"));
        String password = "UserUser123";

        //login for each user
        for (String eachUser : storeUsername) {
            VyTrackLoginPage loginPage = new VyTrackLoginPage();
            loginPage.goTo();
            loginPage.login(String.valueOf(eachUser), password);
            BrowserUtil.waitFor(5);
            //Given driver is on the homePage
            assertEquals("Dashboard", driver.getTitle());

            //When user select “Vehicle Odometer” under Fleet module
            VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
            Actions action = new Actions(driver);
            BrowserUtil.waitFor(5);
            //hover over the Fleet Module
            action.moveToElement(driver.findElement(By.linkText("Fleet"))).perform();
            BrowserUtil.waitFor(4);
            // Click Vehicle Odometer Module
            action.click(driver.findElement(By.xpath(" //span[contains(text(),'Vehicle Odometer')]"))).perform();
            BrowserUtil.waitFor(6);

            //Then verify “You do not have permission to perform this action.” message
            String actualResult = vehicleOdometerPage.flashMessage.getText();
            assertEquals("You do not have permission to perform this action.", actualResult);

            // logout after each user
            VyTrackLogoutPage logoutPage=new VyTrackLogoutPage();
            BrowserUtil.waitFor(2);
            logoutPage.userMenuTab.click();
            logoutPage.logoutTab.click();
        }
    }
}