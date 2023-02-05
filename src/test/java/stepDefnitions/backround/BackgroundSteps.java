package stepDefnitions.backround;

import io.cucumber.java.en.*;

public class BackgroundSteps {


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user_is_on_login_page");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("user_enters_username_and_password");
    }
    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("click_on_login_button");
    }
    @Then("user is navigated to homePage")
    public void user_is_navigated_to_home_page() {
        System.out.println("user_is_navigated_to_home_page");
    }

    @When("user clicks on account button")
    public void user_clicks_on_account_button() {
        System.out.println("         user_clicks_on_account_button");
    }
    @Then("logout link is displayed")
    public void logout_link_is_displayed() {
        System.out.println("        logout_link_is_displayed");
    }

    @When("user clicks on hamberger menu")
    public void user_clicks_on_hamberger_menu() {
        System.out.println("        user_clicks_on_hamberger_menu");
    }
    @Then("summary link is displayed")
    public void summary_link_is_displayed() {
        System.out.println("        summary_link_is_displayed");
    }
}
