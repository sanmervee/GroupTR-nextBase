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

    @FindBy(linkText = "")
    public WebElement pew;


}
