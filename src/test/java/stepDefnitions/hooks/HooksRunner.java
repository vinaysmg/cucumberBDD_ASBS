package stepDefnitions.hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Hooks.feature", glue = "stepDefnitions/hooks"
     ,monochrome = true)
public class HooksRunner {
}
