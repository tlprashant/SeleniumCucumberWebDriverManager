package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static utility.BrowserDriver.driver;

public class OnlineProductsPage {

    private static final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    // Locators
    private static final By onlineProductsLink = By.linkText("Online Products");
    private static final By formalShoesDropdown = By.cssSelector(".fa.fa-angle-double-down.formalshoedropdown");
    private static final By firstFormalShoeValue = By.xpath("//table[contains(@class,'formalshoetable')]//tr[1]/td[1]");

    public static void click_Online_Products_link() {
        wait.until(ExpectedConditions.elementToBeClickable(onlineProductsLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(formalShoesDropdown));
    }

    public static void click_formalshoesdropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(formalShoesDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstFormalShoeValue));
    }

    public static String getText_formalshoes_firstvalue() {
        WebElement shoeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(firstFormalShoeValue));
        return shoeElement.getText().trim();
    }
}
