package au.com.cba.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"au/com/cba/steps"},
        tags = {"~@in_progress"},
        format = { "pretty", "json:target/cucumber.json" }
)

public class TestSuiteRunner extends AbstractTestNGCucumberTests {
}