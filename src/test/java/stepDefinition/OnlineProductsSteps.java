package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.HomePage.click_hamburger_menu;
import static utility.BrowserDriver.driver;
import static pages.OnlineProductsPage.click_formalshoesdropdown;
import static pages.OnlineProductsPage.getText_formalshoes_firstvalue;
import static pages.OnlineProductsPage.click_Online_Products_link;


public class OnlineProductsSteps {

    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_online_products_page() throws InterruptedException {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        click_hamburger_menu();
        click_Online_Products_link();  // ✅ This is from pages.OnlineProductsPage
    }

    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_formal_shoes_drop_down() {
        click_formalshoesdropdown();   // ✅ This too
    }

    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_products() {
        String productName = getText_formalshoes_firstvalue();  // ✅ This too
        assertEquals("   Classic Cheltenham", productName);
    }
}


