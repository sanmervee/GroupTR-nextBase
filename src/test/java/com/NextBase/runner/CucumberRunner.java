package com.NextBase.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",
        glue = "com/NextBase/step_definitions",
        dryRun = false,
        plugin = "html:target/Cucumber.html",
        tags = "@login"


)
public class CucumberRunner {
}
