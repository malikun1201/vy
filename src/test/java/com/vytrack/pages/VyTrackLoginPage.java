package com.vytrack.pages;
import com.vytrack.utility.ConfigReader;
import com.vytrack.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){
        Driver.getDriver().get(ConfigReader.read("vyTrack.url"));
    }

    public void login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }


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
