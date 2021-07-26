package com.NextBase.step_definitions;

import com.NextBase.pages.NextBase_pages;
import com.NextBase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class dynamicMethods {

    WebDriver driver = Driver.getDriver();
    NextBase_pages pages = new NextBase_pages();

    public void assertTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertTrue("Title is not correct!", actualTitle.contains(expectedTitle));
    }
}
