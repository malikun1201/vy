package com.vytrack.tests.matthew_User_Story4;

import com.github.javafaker.Faker;
import com.github.javafaker.FunnyName;
import com.github.javafaker.Name;
import com.vytrack.pages.VyTrackContactsPage;
import com.vytrack.pages.VyTrackDashboard;
import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.utility.BrowserUtil;
import com.vytrack.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserStory4_AC_1 extends TestBase {



    @Test
    public void CreateContactInfoTest(){
/*
        Map<String, String> driverMap = new HashMap<>();
        driverMap.put("user13", "UserUser123");
        driverMap.put("user14", "UserUser123");
        driverMap.put("user15", "UserUser123");
        Map<String, String> storeManagerMap = new HashMap<>();
        storeManagerMap.put("storemanager59", "UserUser123");
        storeManagerMap.put("storemanager60", "UserUser123");
        Map<String, String> salesManagerMap = new HashMap<>();
        salesManagerMap.put("salesmanager113", "UserUser123");
        salesManagerMap.put("salesmanager114", "UserUser123");
        salesManagerMap.put("salesmanager115", "UserUser123");
*/
        //methods to be used.
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);


        VyTrackLoginPage loginPage = PageFactory.initElements(driver,VyTrackLoginPage.class);
        //logging in
        loginPage.login("user13","UserUser123");

        //waiting until page delay has loaded.
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        //asserting at dashboard
        Assertions.assertEquals("Dashboard",driver.getTitle());

        //initializing Dashboard page
        VyTrackDashboard dashboardPage = PageFactory.initElements(driver,VyTrackDashboard.class);
        //hovering Customers
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Customers")));
        action.moveToElement(dashboardPage.customersModule).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Contacts")));
        action.moveToElement(dashboardPage.customerContacts).perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Contacts")));
        dashboardPage.customerContacts.click();

        //assert on contacts page
        wait.until(ExpectedConditions.titleIs("Contacts - Customers"));
        Assertions.assertEquals("Contacts - Customers",driver.getTitle());

        //initializing ContactsPage
        VyTrackContactsPage contactsPage = PageFactory.initElements(driver, VyTrackContactsPage.class);
        BrowserUtil.waitFor(3);
        action.moveToElement(contactsPage.createContactBtn).click().perform();


        wait.until(ExpectedConditions.titleContains("Create Contact"));
        //assert on create contact
        Assertions.assertEquals("https://qa3.vytrack.com/contact/create",driver.getCurrentUrl());
        Faker faker = new Faker(); //adding faker for random information
        BrowserUtil.waitFor(3);

        //faker info
        Name firstName = faker.name();
        contactsPage.firstNameBox.sendKeys(firstName.name());//adding name to first name box.
        BrowserUtil.waitFor(3);//delay due to page loading time
        action.moveToElement(contactsPage.saveAndCloseBtn).click().perform();
        BrowserUtil.waitFor(3); //delay due to page loading time
        String actualMsg = contactsPage.entityMsg.getText();

        //asserting test pass.
        Assertions.assertEquals("contact saved",actualMsg);



    }


}


/*
4. Story: As a user, I should be able to create contact information.
AC #1: users are able to create contacts.
Given user is on the homePage
When user select “Contacts” under Customers module
And user click “Create Contact” button
When user fill out general information
And click “Save and Close” button
Then verify “contact saved” confirm message
 */
