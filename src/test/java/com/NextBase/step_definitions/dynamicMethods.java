package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public abstract class dynamicMethods extends NextBase_pages{

    WebDriver driver = Driver.getDriver();
    //NextBase_pages pages = new NextBase_pages();

    Faker fake = new Faker();
    public String expectedText =  fake.job().title() + " ";

    public void assertTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertTrue("Title is not correct!", actualTitle.contains(expectedTitle));
    }

    public void userEnters(String username, String password, String remember) {
        username_box.sendKeys(username);
        password_box.sendKeys(password);
        if(remember.equals("true")) {
            remember_check_box.click();
        }
        login_button.click();
    }


}
