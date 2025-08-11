package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",     // Path to your feature files
        glue = {"stepDefinition"},                    // Step definitions package
        plugin = {
                "pretty",                             // Console output in readable format
                "html:target/cucumber-reports.html",  // HTML report
                "json:target/cucumber.json"           // JSON report
        },
        monochrome = true                             // Removes unreadable characters in console
)
public class JUnit4TestRunnerTest {
        // No code needed here — Cucumber will run based on annotations above
}




