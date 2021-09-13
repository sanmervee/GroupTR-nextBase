package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.BrowserUtils;
import com.NextBase.utilities.ConfigurationReader;
import com.NextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class login_stepDefinition extends dynamicMethods {

    WebDriver driver = Driver.getDriver();  // instance WebDriver
    // NextBase_pages page = new NextBase_pages();  // instance object

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        // NextBase_pages page = new NextBase_pages();  // instance
        driver.get(ConfigurationReader.getProperty("nextBaseURL"));
    }

    @When("User enters hr username")
    public void user_enters_hr_username() {
        username_box.sendKeys(ConfigurationReader.getProperty("username_hr1"));
    }

    @When("User enters hr password")
    public void user_enters_hr_password() {
        password_box.sendKeys(ConfigurationReader.getProperty("password"));
    }


    @When("User should able to click remember me")
    public void user_should_able_to_click_remember_me() {
        Actions action = new Actions(driver);
        BrowserUtils.sleep(3);
        action.moveToElement(remember_check_box).click().perform();
        login_button.click();
        BrowserUtils.sleep(1);

    }

    @When("User clicks FORGOT YOUR PASSWORD? link")
    public void user_clicks_forgot_your_password_link() {
        BrowserUtils.sleep(1);
        forgot_password.click();
        BrowserUtils.sleep(1);
        //page.username_box.sendKeys(ConfigurationReader.getProperty("username_help1"));
    }

    @When("User clicks reset password")
    public void user_clicks_reset_password() {
        reset_password_button.click();
        //Wait<WebDriver> wait= new FluentWait<WebDriver>
        //        (driver).withTimeout(5, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
    }

    @Then("User should able to see approve text")
    public void user_should_able_to_see_approve_text() {
        String actualText = approve_text.getText();
        String expectedText = "A code to reset your password and your registration information has just been sent to your e-mail address. Please check your e-mail. Note that the reset code is re-generated on each request.";
        Assert.assertEquals(expectedText, actualText);
    }


    @When("User enters {string} {string} {string}")
    public void userEnters(String username, String password, String remember) {
        username_box.sendKeys(username);
        password_box.sendKeys(password);
        if(remember.equals("true")) {
            remember_check_box.click();
        }
        login_button.click();
    }

    @Then("User should see the dashboard as {string}")
    public void userShouldSeeTheDashboardAs(String expectedTitle) {
        assertTitle(expectedTitle);
    }

    @When("User enters wrong {string}")
    public void userEntersWrong(String user_pass) {
        if(user_pass.equals("username"))
            username_box.sendKeys(user_pass);
        else if(user_pass.equals("password"))
            password_box.sendKeys(user_pass);
    }

    @Then("User should see the error msg as {string}")
    public void userShouldSeeTheErrorMsgAs(String expectedErrorMsg) {
        BrowserUtils.sleep(3);
        String actualErrorMsg = errorMsg.getText();
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
    }
}
