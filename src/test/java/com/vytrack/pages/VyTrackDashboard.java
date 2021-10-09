package com.vytrack.pages;

import com.vytrack.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackDashboard {

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    private WebElement questionIcon ;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement fleetVehicle;

    @FindBy(linkText = "Fleet")
    public WebElement fleetModule;

    @FindBy(linkText = "Customers")
    public WebElement customersModule;

    @FindBy(linkText = "Contacts")
    public WebElement customerContacts;

    @FindBy(linkText = "Dashboards")
    public WebElement dashboards;

    @FindBy(linkText = "Sales")
    public WebElement sales;

    @FindBy(linkText="Activities")
    public WebElement activities;

    @FindBy(linkText="Marketing")
    public WebElement marketing;

    @FindBy(linkText="Reports & Segments")
    public WebElement reportsandsegments;

    @FindBy(linkText="System")
    public WebElement system;

    @FindBy(id="user-menu")
    public WebElement userMenu;

    @FindBy(linkText="Logout")
    public WebElement logoutButton;


    public VyTrackDashboard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void clickQuestionIcon(){
        questionIcon.click();
// some change
        // some more changes
    }

}

//*[@id="main-menu"]/ul/li[2]/a/span
