package com.NextBase.step_definitions;

import com.NextBase.utilities.BrowserUtils;
import com.NextBase.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
    @After
    public void tearDownScenario(Scenario scenario){
        // taking screenshot
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        } else {
            BrowserUtils.sleep(1);
            Driver.closeDriver();
        }
    }
}
