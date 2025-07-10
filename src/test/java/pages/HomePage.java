package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {


    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_linkText = "Sign In Portal";
    public static String onlineProductsPage_link_linkText = "Online Products";

    public static void click_hamburger_menu() throws InterruptedException {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();

    }

    public static void signin_link_xpath() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_linkText)).click();
    }

    public static void click_OnlineProductsPage_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductsPage_link_linkText)).click();
    }

}
