package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.BrowserUtils;
import com.NextBase.utilities.ConfigurationReader;
import com.NextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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
        page.username_box.sendKeys(ConfigurationReader.getProperty("username_hr1"));
    }

    @When("User enters hr password")
    public void user_enters_hr_password() {
        page.password_box.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Portal";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("User enters helpdesk username")
    public void user_enters_helpdesk_username() {
        page.username_box.sendKeys(ConfigurationReader.getProperty("username_help1"));
    }

    @When("User enters helpdesk password")
    public void user_enters_helpdesk_password() {
        page.password_box.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("User enters marketing username")
    public void user_enters_marketing_username() {
        page.username_box.sendKeys(ConfigurationReader.getProperty("username_mark2"));
    }

    @When("User enters marketing password")
    public void user_enters_marketing_password() {
        page.password_box.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("User should able to click remember me")
    public void user_should_able_to_click_remember_me() {
        Actions action = new Actions(driver);
        BrowserUtils.sleep(3);
        action.moveToElement(page.remember_check_box).click().perform();
        page.login_button.click();
        BrowserUtils.sleep(1);
        back();
        back();
    }

    @When("User clicks FORGOT YOUR PASSWORD? link")
    public void user_clicks_forgot_your_password_link() {
        BrowserUtils.sleep(1);
        page.forgot_password.click();
        BrowserUtils.sleep(1);
        //page.username_box.sendKeys(ConfigurationReader.getProperty("username_help1"));
    }

    @When("User clicks reset password")
    public void user_clicks_reset_password() {
        page.reset_password_button.click();
    }

    @Then("User should able to see approve text")
    public void user_should_able_to_see_approve_text() {
        //
        String actualText = page.approve_text.getText();
        String expectedText = "A code to reset your password and your registration information has just been sent to your e-mail address. Please check your e-mail. Note that the reset code is re-generated on each request.";
        Assert.assertTrue(expectedText.equals(actualText));
    }

    public void back(){
        driver.navigate().back();
    }
}
