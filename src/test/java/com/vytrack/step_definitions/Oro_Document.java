package com.vytrack.step_definitions;

import com.vytrack.pages.VyTrackDashboard;
import com.vytrack.pages.VyTrackLoginPage;
import com.vytrack.utility.BrowserUtil;
import com.vytrack.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        BrowserUtil.waitFor(5);

        Set<String> allHandles = Driver.getDriver().getWindowHandles();
        assertEquals(allHandles.size(),2);

        for (String eachHandle : allHandles) {
           Driver.getDriver().switchTo().window(eachHandle);
        }
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        assertEquals("Welcome to Oro Documentation",Driver.getDriver().getTitle());

    }
}





