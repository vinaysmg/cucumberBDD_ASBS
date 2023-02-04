package stepDefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSearchSteps {
    private WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.get("https://www.google.com");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Kranti");
    }

    @When("hits enter")
    public void hits_enter() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search result")
    public void user_is_navigated_to_search_result() {
        System.out.println(" Search page opened?, "+driver.getTitle().contains("Kranti"));
        driver.quit();
    }
}
