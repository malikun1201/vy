package com.vytrack.tests.malika_us1;

import com.vytrack.pages.VyTrackDashboard;
import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.utility.Driver;
import com.vytrack.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class UserStory1 extends TestBase {

@Test
public void verifyManager() {
    //VyTrackLoginPage loginPage = PageFactory.initElements(driver, VyTrackLoginPage.class);
    //loginPage.login("storemanager59","UserUser123");

    ArrayList <String> login = new ArrayList <>();
    login.add("storemanager59");
    login.add("storemanager60");

    for (int i = 0; i < login.size(); i++) {
        VyTrackLoginPage loginPage = PageFactory.initElements(driver, VyTrackLoginPage.class);

        loginPage.login(login.get(i), "UserUser123");

        VyTrackDashboard dashboard = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("Dashboards", dashboard.dashboards.getText());

        //VyTrackDashboard fleet = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("Fleet", dashboard.fleetModule.getText());

        //VyTrackDashboard customers = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("Customers", dashboard.customersModule.getText());

        //VyTrackDashboard sales = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("Sales", dashboard.sales.getText());

        //VyTrackDashboard activities = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("Activities", dashboard.activities.getText());

        //VyTrackDashboard marketing = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("Marketing", dashboard.marketing.getText());

        //VyTrackDashboard reportsandsegments = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("Reports & Segments", dashboard.reportsandsegments.getText());

        //VyTrackDashboard system = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("System", dashboard.system.getText());

        dashboard.userMenu.click();
        dashboard.logoutButton.click();


    }


}

    @Test
    public void verifyUser(){
        VyTrackLoginPage loginPage = PageFactory.initElements(driver, VyTrackLoginPage.class);
        loginPage.login("user13","UserUser123");

        VyTrackDashboard dashboard = PageFactory.initElements(driver, VyTrackDashboard.class);
        Assertions.assertEquals("Fleet", dashboard.fleetModule.getText() );
        Assertions.assertEquals("Customers", dashboard.customersModule.getText() );
        Assertions.assertEquals("Activities", dashboard.activities.getText() );
        Assertions.assertEquals("System", dashboard.system.getText() );

    }


}

