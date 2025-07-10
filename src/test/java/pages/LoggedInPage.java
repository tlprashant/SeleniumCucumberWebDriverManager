package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggedInPage extends BrowserDriver {

    public static String productcateogry_formalshoes = "//*[text()='Formal Shoes']";
    public static String productcateogry_sportsshoes = "//*[text()='Sports']";
    public static String productcateogry_sneakers = "//*[text()='Sneakers']";


    public static void visibility_productcateogry_formalshoes() throws InterruptedException {
        String actualproductcateogry_fs = driver.findElement(By.xpath(productcateogry_formalshoes)).getText();
        assertEquals("Formal Shoes" , actualproductcateogry_fs);

    }

    public static void visibility_productcateogry_sportsshoes() throws InterruptedException {
        String actualproductcateogry_ss = driver.findElement(By.xpath(productcateogry_sportsshoes)).getText();
        assertEquals("Sports" ,actualproductcateogry_ss );
    }
    public static void visibility_productcateogry_sneakershoes() throws InterruptedException {
    String actualproductcateogry_s = driver.findElement(By.xpath(productcateogry_sneakers)).getText();
        assertEquals("Sneakers" , actualproductcateogry_s);

}
}
