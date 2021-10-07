package com.vytrack.pages;

import com.vytrack.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVehiclePage {

    @FindBy(linkText = "Fleet")//xpath = //*[@id="main-menu"]/ul/li[1]/a/span
    public WebElement fleetModuleManagers;

    @FindBy(linkText = "Vehicles")
    public WebElement vehicleModule;

    @FindBy(xpath = "//*[@title='Create Car']")
    public WebElement createCarBtn;

    @FindBy(id = "custom_entity_type_LicensePlate-uid-615dd952712da")
    public WebElement licensePlateBox;

    @FindBy(id = "custom_entity_type_Tags-uid-615dd952719ca")
    public WebElement checkBoxes;

    @FindBy(id = "custom_entity_type_Location-uid-615dd95271bc4")
    public WebElement locationBox;

    @FindBy(id = "custom_entity_type_Driver-uid-615dd95271ad1")
    public WebElement driverNameBox;

    @FindBy(id = "custom_entity_type_ChassisNumber-uid-615dd95271cb0")
    public WebElement chassisNumberBox;

    @FindBy(id = "custom_entity_type_ModelYear-uid-615dd95271da1")
    public WebElement modelYearBox;

    @FindBy(id = "custom_entity_type_LastOdometer-uid-615dd95271e89")
    public WebElement lastOdometerBox;

    @FindBy(id = "date_selector_custom_entity_type_ImmatriculationDate-uid-615dd95271f6f")
    public WebElement immatriculationDateBox;

    @FindBy(id = "date_selector_custom_entity_type_FirstContractDate-uid-615dd95272062")
    public WebElement firstContractDateBox;

    @FindBy(id = "custom_entity_type_CatalogValue-uid-615dd952722c8")
    public WebElement catalogValueBox;

    @FindBy(id = "custom_entity_type_SeatsNumber-uid-615dd952723ba")
    public WebElement seatsNumberBox;

    @FindBy(id = "custom_entity_type_DoorsNumber-uid-615dd952724b4")
    public WebElement doorsNumberBox;

    @FindBy(id = "custom_entity_type_Color-uid-615dd952725ad")
    public WebElement colorNumberBox;

    @FindBy(id = "custom_entity_type_Power-uid-615dd9b1dd3be")
    public WebElement powerBox;

    @FindBy(id = "custom_entity_type_HorsepowerTaxation-uid-615dd9b1dd2c3")
    public WebElement horsePowerTaxationBox;

    @FindBy(id = "custom_entity_type_Horsepower-uid-615dd9b1dd18c")
    public WebElement horsePowerBox;

    @FindBy(id = "custom_entity_type_CO2Emissions-uid-615dd9b1dd075")
    public WebElement co2EmissionsBox;

    @FindBy(id = "s2id_custom_entity_type_FuelType-uid-615dd9b1dcf8a")
    public WebElement fuelTypeBox;

    @FindBy(id = "s2id_custom_entity_type_Transmission-uid-615dd9b1dce55")
    public WebElement transmissionBox;

    @FindBy(xpath = "//button[contains(text(),'Save and Close')]")
    public WebElement saveAndCloseBtn;

    @FindBy(id = "flash-messages")
    public WebElement entityMsg;

    public CreateVehiclePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

