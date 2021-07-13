package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.ConfigurationReader;
import com.NextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {

    WebDriver driver = Driver.getDriver();
    NextBase_pages page=new NextBase_pages();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("nextBaseURL"));

    }

    @When("User enters hr username")
    public void user_enters_hr_username() {

    }

    @When("User enters hr password")
    public void user_enters_hr_password() {

    }

    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {

    }

    @When("User enters helpdesk username")
    public void user_enters_helpdesk_username() {

    }

    @When("User enters helpdesk password")
    public void user_enters_helpdesk_password() {

    }

    @When("User enters marketing username")
    public void user_enters_marketing_username() {

    }

    @When("User enters marketing password")
    public void user_enters_marketing_password() {

    }
}
