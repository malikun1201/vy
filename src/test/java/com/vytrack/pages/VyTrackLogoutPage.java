package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLogoutPage {

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement userMenuTab;

    @FindBy(linkText = "Logout")
    public WebElement logoutTab;

    public VyTrackLogoutPage(){
        PageFactory.initElements(com.vytrack.utility.Driver.getDriver(), this);
    }
}
