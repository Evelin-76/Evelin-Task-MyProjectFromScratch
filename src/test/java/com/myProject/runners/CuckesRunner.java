package com.myProject.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "rerun:target/rerun.txt"
                // "html:target/default-html-features" ->to get report.It override itself. No need if we use json
        },
        features = "src/test/resources/features",
        glue = "com/myProject/steps_definitions",
        dryRun = false,
        tags = "@wip"
)

public class CuckesRunner {
}
