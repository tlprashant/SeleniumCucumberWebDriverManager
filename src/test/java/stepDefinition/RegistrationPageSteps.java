package stepDefinition;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static pages.LoginPage.click_NewRegister_btn;
import static pages.RegistrationPage.verifyRegistrationPage;
import static pages.RegistrationPage.verifyNameFieldPresent;
import static utility.BrowserDriver.driver;

public class RegistrationPageSteps {

    @Then("User should be able to view the New Registration page")
    public void user_should_be_able_to_view_the_new_registration_page() {
        try {
            verifyRegistrationPage();
            verifyNameFieldPresent();

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("registration_page_debug.png"));

            System.out.println("User Registration page and Name field verified successfully.");
        } catch (Exception e) {
            System.err.println("Registration page validation failed: " + e.getMessage());
            Assert.fail("User Registration Page or Name field not visible");
        }
    }
}


