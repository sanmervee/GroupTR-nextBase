package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.BrowserUtils;
import com.NextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class sendMessage_stepDefinition extends dynamicMethods {

    WebDriver driver = Driver.getDriver();
    NextBase_pages pages = new NextBase_pages();

    @Given("Verify users can send message by clicking {string} tab")
    public void verify_users_can_send_message_by_clicking_tab(String tabName) {
        WebElement tabs = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-" + tabName + "']"));
        tabs.click();

        driver.switchTo().parentFrame();
        BrowserUtils.sleep(1);

        Actions actions = new Actions(driver);
        actions.click(pages.msg_box).sendKeys(expectedText).perform();
        pages.send_button.click();

    }

    //==============================================
    // there is a problem on bottom

    @Then("Verify users can attach link by clicking on the {string} icon.")
    public void verify_users_can_attach_link_by_clicking_on_the_icon(String link) {

        driver.switchTo().parentFrame();
        BrowserUtils.sleep(1);

        Actions actions = new Actions(driver);
        actions.click(pages.msg_box).sendKeys(expectedText).perform();
        BrowserUtils.sleep(2);
        WebElement link_btn = driver.findElement(By.xpath("//*[@title='Link']"));
        link_btn.click();

        String actualText = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals(actualText, expectedText);
    }


    @Then("Verify users can cancel message.")
    public void verify_users_can_cancel_message() {
        WebElement tabs = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']"));
        tabs.click();

        driver.switchTo().parentFrame();
        BrowserUtils.sleep(1);

        Actions actions = new Actions(driver);
        actions.click(pages.msg_box).sendKeys(expectedText).perform();
        pages.cancel_button.click();

    }



}
