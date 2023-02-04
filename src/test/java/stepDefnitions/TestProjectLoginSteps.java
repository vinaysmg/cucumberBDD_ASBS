package stepDefnitions;

import enums.Browsers;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import util.DriverManagerUtil;

public class TestProjectLoginSteps {
    private WebDriver driver = null;
    private LoginPage loginPage = null;

    @Given("{string} browser is open")
    public void browser_is_open(String string) {
        DriverManagerUtil.initDriver(Browsers.valueOf(string.toUpperCase()));
        driver = DriverManagerUtil.getDriver();
    }

    @Given("user in TestProject login page")
    public void user_in_test_project_login_page() {
        driver.get("https://testproject.io");
        loginPage = new LoginPage();
        loginPage.clickLogin();
        String currentWindow = driver.getWindowHandle();
        for(String window : driver.getWindowHandles()){
           if(!window.equals(currentWindow))
               driver.switchTo().window(window);
        }
    }

    @When("^user enters TestProject (.*) and (.*)$")
    public void user_enters_test_project_abcd_and(String username, String password) {
       loginPage.enterUserName(username);
       loginPage.enterPassword(password);
    }

    @When("user clicks on loginButton")
    public void user_clicks_on_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user is navigated to TestProject homePage")
    public void user_is_navigated_to_test_project_home_page() {
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
