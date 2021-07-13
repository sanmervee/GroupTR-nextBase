package com.NextBase.pages;

import com.NextBase.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBase_pages {

    //WebDriver driver = Driver.getDriver();  // instance WebDriver

    public NextBase_pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username_box;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password_box;

    @FindBy(name = "USER_REMEMBER")
    public WebElement remember_check_box;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement login_button;

}
