package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class OnlineProductsPage extends BrowserDriver {

    // Locators
    private static final By ONLINE_PRODUCTS_LINK = By.linkText("Online Products");
    private static final By FORMAL_SHOES_DROPDOWN = By.cssSelector(".formalshoedropdown");
    private static final By FORMAL_SHOES_TABLE_FIRST_CELL = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]");

    // ⬇ OLD name preserved for compatibility with step definitions

    public static void click_Online_Products_link() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(ONLINE_PRODUCTS_LINK));
        link.click();
    }

    public static void click_formalshoesdropdown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(FORMAL_SHOES_DROPDOWN));
        dropdown.click();
    }

    public static String getText_formalshoes_firstvalue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cell = wait.until(ExpectedConditions.visibilityOfElementLocated(FORMAL_SHOES_TABLE_FIRST_CELL));
        return cell.getText();
    }
}



