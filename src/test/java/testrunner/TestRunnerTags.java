package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke and @regression and not @perf", features = {"src/test/resources/FeatureswithTags"},
        glue = {"org/example/StepDefinitions"},
        plugin = {"pretty", "html:target/HTMLReport.html"})

public class TestRunnerTags extends AbstractTestNGCucumberTests {

}
