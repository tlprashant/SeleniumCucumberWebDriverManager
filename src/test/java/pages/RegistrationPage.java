package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utility.BrowserDriver.driver;

public class RegistrationPage {

    // Locators
    private static final By pageHeader = By.xpath("//h1[text()='User Registration Page']");
    private static final By nameField = By.xpath("/html/body/center/h1");

    // Verify Registration Page is loaded
    public static void verifyRegistrationPage() {
        try {
            WebElement header = driver.findElement(pageHeader);
            Assert.assertTrue("User Registration Page header not found!", header.isDisplayed());
            System.out.println("✅ User Registration Page header verified.");
        } catch (Exception e) {
            throw new AssertionError("❌ Failed to verify User Registration Page: " + e.getMessage(), e);
        }
    }

    // Verify Name field is visible
    public static void verifyNameFieldPresent() {
        try {
            WebElement name = driver.findElement(nameField);
            Assert.assertTrue("Name field is not visible on Registration page!", name.isDisplayed());
            System.out.println("✅ Name field is visible.");
        } catch (Exception e) {
            throw new AssertionError("❌ Failed to verify Name field: " + e.getMessage(), e);
        }
    }
}





