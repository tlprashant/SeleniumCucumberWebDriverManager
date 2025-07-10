package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BrowserDriver;


public class Hooks {

    @Before
    public void setUp() {
        BrowserDriver.initializeDriver();  // This method should launch ChromeDriver and set driver
    }

    @After
    public void tearDown() {
        BrowserDriver.driver = null;
      //  if (driver != null) {
        //    driver.quit();
        }
    }


