package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationPage extends BrowserDriver {

    // Locators
    private static final By headerLocator = By.xpath("//h1[normalize-space()='User Registration Page']");
    private static final By nameLocator = By.id("name");
    private static final By emailLocator = By.id("email");
    private static final By passwordLocator = By.id("password");
    private static final By confirmPasswordLocator = By.id("confirmpassword");
    private static final By submitButtonLocator = By.xpath("//input[@type='submit' and @value='Register']");

    // Verify URL and header text
    public static void verifyRegistrationPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        boolean urlContainsRegistration = wait.until(ExpectedConditions.urlContains("Registration"));
        assertTrue(urlContainsRegistration, "URL does not contain 'Registration'");

        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(headerLocator));
        assertEquals("User Registration Page", header.getText().trim(), "Page header mismatch");
    }

    // Verify name field is visible
    public static void verifyNameFieldPresent() {
        WebElement nameInput = driver.findElement(nameLocator);
        assertTrue(nameInput.isDisplayed(), "Name input field not visible");
    }

    // Fill the registration form fields
    public static void fillRegistrationForm(String name, String email, String password, String confirmPassword) {
        WebElement nameInput = driver.findElement(nameLocator);
        nameInput.clear();
        nameInput.sendKeys(name);

        WebElement emailInput = driver.findElement(emailLocator);
        emailInput.clear();
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(passwordLocator);
        passwordInput.clear();
        passwordInput.sendKeys(password);

        WebElement confirmPasswordInput = driver.findElement(confirmPasswordLocator);
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    // Submit the registration form
    public static void submitForm() {
        WebElement submitBtn = driver.findElement(submitButtonLocator);
        submitBtn.click();
    }
}

