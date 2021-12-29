package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/FeaturesWithTags",
                 glue = {"StepDefinitions"},
                 monochrome = true,
                 tags = "@regression and not @smoke")
public class TestRunnerWithTags {
	
	

}
