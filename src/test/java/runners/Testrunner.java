package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "src/test/java/features",
    glue= ("seleniumgluecode"),
    plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:resources/cucumber-reports/report.html"},
    snippets= CAMELCASE
)


//solo una vez

public class Testrunner {
}
