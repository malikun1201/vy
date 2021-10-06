package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackDashboard {

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    private WebElement questionIcon ;


    public VyTrackDashboard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void clickQuestionIcon(){
        questionIcon.click();

    }
}


