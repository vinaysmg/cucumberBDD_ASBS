package stepDefnitions;
// add cucumber dependancy from io.cucumber
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DemoSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user is on login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("user enters username and password");
    }

    @When("^user enters credential (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        System.out.println(this);
        System.out.println("user enters "+username+" and "+password);
    }

    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("click on login button");
    }

    @Then("user is navigated to homePage")
    public void user_is_navigated_to_home_page() {
        System.out.println("user is navigated to homePage");
    }

    @And("^verify home page title (.*)$")
    public void verifyHomePageTitle(String arg0) {
        System.out.println("Verified title "+ arg0);
    }

    @And("verify menus options")
    public void verifyMenusOptions(DataTable dataTable) {
        List<String> strings = dataTable.asList();
        System.out.println("Menu options available are "+ strings);
    }

    @And("verify sub-menu options")
    public void verifySubMenuOptions(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps();

        for(Map<String, String> map : mapList){
            System.out.println(map.get("menu") + ", " + map.get("subMenu"));
        }
    }
}
