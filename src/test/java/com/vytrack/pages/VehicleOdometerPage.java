package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class VehicleOdometerPage {

    @FindBy(id = "main-menu-toggle")
    public WebElement burgerMenu;

    @FindBy(linkText = "Fleet")
    public WebElement fleetModuleDriver;

    @FindBy(xpath=" //span[contains(text(),'Vehicle Odometer')]")
    public WebElement vehicleOdometer;

    @FindBy(xpath = "//h1[contains(text(),'Vehicles Odometers')]")
    public WebElement vehicleOdometerMsg;

    @FindBy(linkText = "Create Vehicle Odometer")
    public WebElement createOdometerBtn;

    @FindBy(css = "[name='custom_entity_type[OdometerValue]']")
    public WebElement odometerValueBox;

    @FindBy(css = "[name='date_selector_custom_entity_type_Date-uid-61609aeb1e8dd']")
    public WebElement dateBox;

    @FindBy(css = "[name='custom_entity_type[Driver]']")
    public WebElement driverBox;

    @FindBy(className = "select2-chosen")
    public WebElement unitBox; //javaScriptExecutor-selectByName - miles/km

    @FindBy(xpath = "//button[contains(text(),'Save and Close')]")
    public WebElement saveAndCloseBtn;

    @FindBy(className = "message")
    public WebElement entityMsg;

    public VehicleOdometerPage(){
        PageFactory.initElements(com.vytrack.utility.Driver.getDriver(), this);
    }

}
