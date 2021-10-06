package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleOdometerPage {

    @FindBy(id = "main-menu-toggle")
    public WebElement burgerMenu;

    @FindBy(linkText = "Fleet")
    public WebElement fleetModuleDriver;

    @FindBy(partialLinkText = "VehicleOdometer")
    public WebElement vehicleOdometer;

    @FindBy(xpath = "//h1[contains(text(),'Vehicles Odometers')]")
    public WebElement vehicleOdometerMsg;

    @FindBy(xpath = "//a[contains(text(),'Create Vehicle Odometer')]")
    public WebElement createOdometerBtn;

    @FindBy(id = "custom_entity_type_OdometerValue-uid-615bcf79190e2")
    public WebElement odometerValueBox;

    @FindBy(id = "date_selector_custom_entity_type_Date-uid-615bcf79191ec")
    public WebElement dateBox;

    @FindBy(id = "custom_entity_type_Driver-uid-615bcf79192fa")
    public WebElement driverBox;

    @FindBy(id = "s2id_custom_entity_type_Units-uid-615bcf7919466")
    public WebElement unitBox; //javaScriptExecutor-selectByName - miles/kg

    @FindBy(xpath = "//button[contains(text(),'Save and Close')]")
    public WebElement saveAndCloseBtn;

}
