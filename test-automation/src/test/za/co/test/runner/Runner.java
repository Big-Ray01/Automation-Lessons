package za.co.test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/za/co/test/featureFiles/automation.feature", // Path to feature files
        glue = {"za.co.test.stepDef"}, // Package with step definitions// Reports
        tags = "@Test", // Run scenarios with this tag
        plugin = {"pretty", "html: Execution/cucumber.html"},//Reports
        monochrome = true // Cleaner console output
)

public class Runner {

}
