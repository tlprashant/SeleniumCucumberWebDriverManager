package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendKeys_username();
        sendKeys_password();
        click_login_btn();

    }

    @When("User clicks on the new Registration button")
    public void user_clicks_on_the_new_registration_button() throws InterruptedException {
        click_NewRegister_btn();

    }

}
