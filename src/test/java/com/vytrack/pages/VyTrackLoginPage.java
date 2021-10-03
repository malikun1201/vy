package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VyTrackLoginPage {




    @FindBy(id = "prependedInput")
    public WebElement usernameField;

    @FindBy(id = "prependedInput2")
    public WebElement passwordField;

    @FindBy(className = "oro-remember-me")
    public WebElement rememberMeCheckBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[1]" )
    public WebElement errorMsg;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPasswordLinkTxt;




    public void setUsernameField(String username){
        usernameField.sendKeys(username);
    }
    public void setPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void clickSubmitButton(){
        loginButton.click();
    }

}
