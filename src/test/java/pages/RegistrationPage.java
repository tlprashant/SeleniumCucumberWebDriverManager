package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String userregistration_xpath = "/html/body/center/h1";

    public static void visibility_user_registration_page() throws InterruptedException {
        String actualproductcateogry_fs = driver.findElement(By.xpath(userregistration_xpath)).getText();
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.urlContains("Registration"));
        assertEquals("User Registration Page", actualproductcateogry_fs);

    }

}
