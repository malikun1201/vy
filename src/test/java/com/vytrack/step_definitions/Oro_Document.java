package com.vytrack.step_definitions;

import com.vytrack.pages.VyTrackDashboard;
import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.utility.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Oro_Document {
    VyTrackLoginPage loginPage;

    @Given("user is on the homePage")
    public void user_is_on_the_home_page() {
        System.out.println("@Given user is on the homePage");

        loginPage = new VyTrackLoginPage();
        loginPage.goTo();

    }
    @When("user click question icon on the right top of the homepage")
    public void user_click_question_icon_on_the_right_top_of_the_homepage() {
        System.out.println("@When user click question icon on the right top of the homepage");

        loginPage.login("user13","UserUser123");

    }
    @Then("verify user accessed to Oro Documentation page.")
    public void verify_user_accessed_to_oro_documentation_page() {
        System.out.println("@Then verify user accessed to Oro Documentation page.");

        VyTrackDashboard dashboard = new VyTrackDashboard();

        dashboard.clickQuestionIcon();

        BrowserUtil.waitFor(2);

       // Set<String> allHandles = Driver.getDriver().getWindowHandles();
       // System.out.println("allHandles = " + allHandles);


        /*

        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        for (String eachWindow : allWindows) {
            if(eachWindow.equalsIgnoreCase("Welcome to Oro Documentation")){
                System.out.println("Test Pass");
            }else{
                System.out.println("Failed");
            }
        }

      */

    }

}
