package com.vytrack.tests.christina_User_Story8;

import com.vytrack.pages.VehicleOdometerPage;
import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.utility.TestBase;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
        //home page title "Dashboard"
        Map<String, String> driverCredentials = new HashMap<>();
        driverCredentials.put("user13", "UserUser123");
        driverCredentials.put("user14", "UserUser123");
        driverCredentials.put("user15", "UserUser123");
        VyTrackLoginPage loginPage= new VyTrackLoginPage();
        loginPage.goTo();

        VehicleOdometerPage vehicleOdometer= new VehicleOdometerPage();





    }



}
