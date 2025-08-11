package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class LoginPage extends BrowserDriver {


    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_btn_xpath = "//*[@id=\"second_form\"]/input";
    public static String newregister_btn_id = "NewRegistration";

    public static void sendKeys_username() throws InterruptedException {
        driver.findElement(By.id(username_text_id)).sendKeys("Scott.gale@gmail.com");

    }

    public static void sendKeys_password() throws InterruptedException {
        driver.findElement(By.id(password_text_id)).sendKeys("P@sword!");

    }

    public static void click_login_btn() {
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void click_NewRegister_btn() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(05));

            // Wait for presence first
            WebElement newRegisterButton = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.id("NewRegistration"))
            );

            // Then wait for visibility
            wait.until(ExpectedConditions.visibilityOf(newRegisterButton));

            // Then wait for clickability
            wait.until(ExpectedConditions.elementToBeClickable(newRegisterButton));

            newRegisterButton.click();
            System.out.println("✅ Clicked on 'New User? Register Here!' button.");

        } catch (Exception e) {
            throw new AssertionError("❌ Could not click on New Registration button: " + e.getMessage(), e);
        }
    }

}