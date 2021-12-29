package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/FeatureForBackground",
                 glue = {"BackgroundSteps"},
                 monochrome = true,
                 plugin = {"pretty","html:target/HTMLReport.html",
                          "json:target/JsonReport/report1.json",
                          "junit:target/JUnitReport/report1.xml"})
public class TestRunnerBackground {

}
