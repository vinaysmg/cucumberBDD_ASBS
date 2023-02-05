package stepDefnitions.backround;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Background.feature", glue = "stepDefnitions/backround"
 ,plugin = {"pretty", "json:target/cucumber.json"})
public class BackgroundRunnerTest {
}
