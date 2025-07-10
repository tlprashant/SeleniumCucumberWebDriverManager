// package runner;

//import org.junit.platform.suite.api.ConfigurationParameter;
//import org.junit.platform.suite.api.IncludeEngines;
//import org.junit.platform.suite.api.SelectClasspathResource;
//import org.junit.platform.suite.api.Suite;

//import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
//import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

//@Suite
//@IncludeEngines("cucumber")
//@SelectClasspathResource("features") // This means: src/test/resources/features/
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefinition")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
//public class TestRunner {
//} //

package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class TestRunner {

}


