package com.NextBase.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/NextBase-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features ="src/test/resources/features",
        glue = "com/NextBase/step_definitions",
        dryRun = false,
        tags = "@send"
)
public class CucumberRunner {
}
