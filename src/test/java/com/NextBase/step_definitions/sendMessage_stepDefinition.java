package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.BrowserUtils;
import com.NextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class sendMessage_stepDefinition extends dynamicMethods {

    WebDriver driver = Driver.getDriver();
    NextBase_pages pages = new NextBase_pages();


    @Given("user can click {string} tab")
    public void user_can_click_tab(String tabName) {
        WebElement tabs = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-" + tabName + "']"));
        tabs.click();
    }

    @When("user can type message in the message text box")
    public void user_can_type_message_in_the_message_text_box() {
        driver.switchTo().parentFrame();
        BrowserUtils.sleep(1);

        Actions actions = new Actions(driver);
        actions.click(pages.msg_box).sendKeys(expectedText).perform();
    }

    @When("user clicks send button")
    public void user_clicks_send_button() {
        pages.send_button.click();
    }

    @Given("user can attach link by clicking on the {string} icon.")
    public void user_can_attach_link_by_clicking_on_the_icon(String addToMsg) {
        WebElement link_btn = driver.findElement(By.xpath("//*[@id='bx-b-link-blogPostForm']/span"));
        link_btn.click();
        pages.textBox_text.sendKeys("SDET: ");
        pages.textBox_linkURL.sendKeys("www.sdet.com");
        pages.textBox_Button_save.click();
    }

    @Then("Verify users can attach link by clicking on the {string} icon.")
    public void verify_users_can_attach_link_by_clicking_on_the_icon(String link) {
        driver.switchTo().parentFrame();
        BrowserUtils.sleep(1);

        Actions actions = new Actions(driver);
        actions.click(pages.msg_box).sendKeys(expectedText).perform();
        BrowserUtils.sleep(2);
        WebElement link_btn = driver.findElement(By.xpath("//*[@title='" + link + "']"));
        link_btn.click();
    }


    @Then("Verify users can cancel message.")
    public void verify_users_can_cancel_message() {
        pages.cancel_button.click();
    }






}
