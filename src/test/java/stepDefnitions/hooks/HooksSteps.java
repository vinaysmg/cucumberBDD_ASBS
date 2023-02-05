package stepDefnitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksSteps {
    @Before(order = 2)
    public void beforeScenario(){
        System.out.println("This is from @Before1");
    }

    @Before(order = 1, value = "@Tag1")
    public void beforeScenario2(){
        System.out.println("This is from @Before2");
    }

    @After(order = 2)
    public void afterScenario(){
        System.out.println("This is from @After1");
    }

    @After(order = 1, value = "@Tag1")
    public void afterScenario2(){
        System.out.println("This is from @After2");
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("          This is from @BeforeStep1");
    }


    @AfterStep
    public void afterStep(){
        System.out.println("           This is from @AfterStep1");
    }

    @Given("given step")
    public void given_step() {
        System.out.println("                                  given_step      ");
    }

    @When("when step")
    public void when_step() {
        System.out.println("                                  when_step        ");
    }

    @Then("Then step")
    public void then_step() {
        System.out.println("                                  then_step        ");
    }
}
