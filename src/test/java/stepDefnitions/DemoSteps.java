package stepDefnitions;
// add cucumber dependancy from io.cucumber
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user is on login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("user enters username and password");
    }

    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");
    }

    @Then("user is navigated to homePage")
    public void user_is_navigated_to_home_page() {
        System.out.println("user is navigated to homePage");
    }

}
