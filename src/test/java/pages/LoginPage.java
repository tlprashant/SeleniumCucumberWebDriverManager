package pages;


import org.openqa.selenium.By;
import utility.BrowserDriver;

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
        driver.findElement(By.id(newregister_btn_id)).click();
    }
}