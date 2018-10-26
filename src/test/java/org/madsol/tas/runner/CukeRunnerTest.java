package org.madsol.tas.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "org.madsol.tas",
        features = "src/test/resources/features",
        plugin = {
                "pretty",
                "timeline:target/timeline-report",
                "json:target/json-report/cucumber.json"
        })
public class CukeRunnerTest {
}
