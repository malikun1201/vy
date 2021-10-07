package com.vytrack.tests.christina_User_Story2;

import com.vytrack.pages.CreateVehiclePage;
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

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * AC #1: only store/sales manager able to create car
 * Given store/sales manager is on the homePage
 * When user select “Vehicles” under Fleet module
 * And user click “create car” button
 * When user fill out general information
 * And click “Save and Close” button
 * Then verify “Entity saved” confirm message
 */
public class UserStory2_AC1 extends TestBase {

    @Test
    public void testManagersCreateCar(){
        /*
        Map<String, String> storeManagerMap = new HashMap<>();
        storeManagerMap.put("storemanager59", "UserUser123");
        storeManagerMap.put("storemanager60", "UserUser123");
        Map<String, String> salesManagerMap = new HashMap<>();
        salesManagerMap.put("salesmanager113", "UserUser123");
        salesManagerMap.put("salesmanager114", "UserUser123");
        salesManagerMap.put("salesmanager115", "UserUser123");


         */
        VyTrackLoginPage loginPage= new VyTrackLoginPage();
        loginPage.goTo();
        loginPage.login("storemanager59","UserUser123");

        BrowserUtil.waitFor(5);

        Assertions.assertEquals("Dashboard",driver.getTitle());

        CreateVehiclePage vehiclePage= new CreateVehiclePage();

        Actions action= new Actions(driver);
        BrowserUtil.waitFor(5);
        action.moveToElement(driver.findElement(By.linkText("Fleet"))).perform();

        BrowserUtil.waitFor(4);

        action.click(driver.findElement(By.linkText("Vehicles"))).perform();

        BrowserUtil.waitFor(4);

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        vehiclePage.createCarBtn.click();

        BrowserUtil.waitFor(3);

        vehiclePage.saveAndCloseBtn.click();

        BrowserUtil.waitFor(2);

        String alertTxt = "";
        alertTxt = vehiclePage.entityMsg.getText();

        // regular expression
        alertTxt = alertTxt.replaceAll("[^a-zA-Z]", "");

        System.out.println("Alert message:\n"+ alertTxt);

        Assertions.assertEquals("Entitysaved", alertTxt);






    }


}
