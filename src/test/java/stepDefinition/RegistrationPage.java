package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.RegistrationPage.visibility_user_registration_page;

public class RegistrationPage {

    @Then("User should be able to view the New Registration page")
    public void user_should_be_able_to_view_the_new_registration_page() throws InterruptedException {
        visibility_user_registration_page();

    }



}
