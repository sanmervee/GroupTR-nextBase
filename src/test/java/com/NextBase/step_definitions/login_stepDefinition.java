package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.ConfigurationReader;
import com.NextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class login_stepDefinition {

    WebDriver driver = Driver.getDriver();  // instance WebDriver
    NextBase_pages page = new NextBase_pages();  // instance object

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        // NextBase_pages page = new NextBase_pages();  // instance
        driver.get(ConfigurationReader.getProperty("nextBaseURL"));
    }

    @When("User enters hr username")
    public void user_enters_hr_username() {

    }

    @When("User enters hr password")
    public void user_enters_hr_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters helpdesk username")
    public void user_enters_helpdesk_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters helpdesk password")
    public void user_enters_helpdesk_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters marketing username")
    public void user_enters_marketing_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters marketing password")
    public void user_enters_marketing_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
