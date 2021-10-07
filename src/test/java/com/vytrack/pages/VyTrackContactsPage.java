package com.vytrack.pages;

import com.vytrack.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackContactsPage {

    public VyTrackContactsPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@title='Create Contact']")
    public WebElement createContactBtn;

    @FindBy(xpath = "//button[contains(text(),'Save and Close')]")
    public WebElement saveAndCloseBtn;

    @FindBy(name = "oro_contact_form[firstName]")
    public WebElement firstNameBox;

    @FindBy(className = "message")
    public WebElement entityMsg;



}
