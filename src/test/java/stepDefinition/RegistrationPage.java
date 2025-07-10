package stepDefinition;

import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

import static pages.RegistrationPage.visibility_user_registration_page;
import static utility.BrowserDriver.driver;

public class RegistrationPage {

    @Then("User should be able to view the New Registration page")
    public void user_should_be_able_to_view_the_new_registration_page() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h2[contains(text(),'User Registration Page')]")
            ));
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("registration_page_debug.png"));

            Assert.assertTrue(header.isDisplayed());
            System.out.println("User Registration page is displayed correctly.");

        } catch (Exception e) {
            System.err.println("Registration page validation failed: " + e.getMessage());
            Assert.fail("User Registration Page not visible");
        }
        visibility_user_registration_page();
    }
}

