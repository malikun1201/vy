package com.vytrack.pages;

import com.vytrack.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractCreation {
    @FindBy(xpath = "//*[@id='main-menu']/ul/li[2]/a/span")
    public WebElement fleetModule;

    @FindBy (xpath = "//*[@id='main-menu']/ul/li[2]/div/div/ul/li[6]/a/span")
    public WebElement VehicleContract;

    @FindBy (xpath = "//*[@id='container']/div[2]/div/div/div[2]/a")
    public WebElement CreateVehicleContractBtn;

    @FindBy(xpath = "//*[@id='s2id_custom_entity_type_Type-uid-615e7e96494a3']/a/span[1]")
    public WebElement ChooseValue;

    @FindBy(xpath = "//*[@id='custom_entity_type_Responsible-uid-615e7e96495c5']")
    public WebElement Responsible;

    @FindBy(xpath = "//*[@id='custom_entity_type_ActivationCost-uid-615e7e96496c0']")
    public WebElement ActivationCost;

    @FindBy(xpath = "//*[@id='custom_entity_type_RecurringCostAmount-uid-615e7e96497b7']")
    public WebElement CostAmount;

    @FindBy(xpath = "//*[@id='s2id_custom_entity_type_RecurringCostAm-uid-615e7e96498ff']/a/span[1]")
    public WebElement CostAm;

    @FindBy(xpath = "//*[@id='custom_entity_type_OdometerDetails-uid-615e7e96499fa']")
    public WebElement OdometerDetails;

    @FindBy(xpath = "//*[@id='date_selector_custom_entity_type_InoviceDate-uid-615e7e9649af8']")
    public WebElement InvoiceDate;

    @FindBy(xpath = "//*[@id='date_selector_custom_entity_type_ContractStartDate-uid-615e7e9649bf7']")
    public WebElement ContractStartDate;

    @FindBy(xpath = "//*[@id='date_selector_custom_entity_type_ContractExpirationDate-uid-615e7e9649cf0']")
    public WebElement ContractExpDate;

    @FindBy(xpath = "//*[@id='custom_entity_type_Vendor-uid-615e7e9649df7']")
    public WebElement Vendor;

    @FindBy(xpath = "//*[@id='custom_entity_type_Driver-uid-615e7e9649ef3']")
    public WebElement Driver;

    @FindBy(xpath = "//*[@id='custom_entity_type_ContractReference-uid-615e7e9649ff6']")
    public WebElement ContactReference;

    @FindBy(xpath = "//*[@id='custom_entity_type_TermsandConditions-uid-615e7e964a202']")
    public WebElement TermsAndConditions;

    @FindBy(xpath = "//*[@id='s2id_custom_entity_type_Status-uid-615e7e964a338']/a/span[1]")
    public WebElement Status;

    @FindBy(xpath = "//button[contains(text(),'Save and Close')]")
    public WebElement SaveAndCloseBtn;

    @FindBy(id = "flash-messages")
    public WebElement entityMsg;

    public VehicleContractCreation(){
        PageFactory.initElements(com.vytrack.utility.Driver.getDriver(), this);
    }









}
