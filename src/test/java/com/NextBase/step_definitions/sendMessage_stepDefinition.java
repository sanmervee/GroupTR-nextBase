package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.BrowserUtils;
import com.NextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class sendMessage_stepDefinition extends dynamicMethods {

    WebDriver driver = Driver.getDriver();
    NextBase_pages pages = new NextBase_pages();

    @Given("Verify users can send message by clicking {string} tab")
    public void verify_users_can_send_message_by_clicking_tab(String tabName) {
        WebElement tabs = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-" + tabName + "']"));
        tabs.click();
        driver.switchTo().frame("bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm");
        BrowserUtils.sleep(2);
        Actions actions = new Actions(driver);
        actions.click(pages.msg_box).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys("Suheyla + Merve + Muruvvet").perform();

    }

    @Then("Verify users can attach link by clicking on the {string} icon.")
    public void verify_users_can_attach_link_by_clicking_on_the_icon(String link) {
        WebElement link_btn = driver.findElement(By.xpath("//div[@id='post-buttons-bottom']/span/span[@title='" + link + "']"));
        link_btn.click();
    }

    @Then("Verify users can cancel message.")
    public void verify_users_can_cancel_message() {

    }

}
