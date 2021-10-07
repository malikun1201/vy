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

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleetModule;

    @FindBy(linkText = "Customers")
    public WebElement customersModule;

    @FindBy(linkText = "Contacts")
    public WebElement customerContacts;



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
