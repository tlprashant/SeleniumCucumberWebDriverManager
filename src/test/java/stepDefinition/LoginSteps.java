package stepDefinition;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static pages.LoginPage.*;
import static utility.BrowserDriver.driver;

public class LoginSteps {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendKeys_username();
        sendKeys_password();
        click_login_btn();

    }

    @When("User clicks on the new Registration button")
    public void user_clicks_on_the_new_registration_button() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement regBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("NewRegistration")));
        regBtn.click();
        click_NewRegister_btn();
        System.out.println("=== STEP REACHED ===");

    }

}
