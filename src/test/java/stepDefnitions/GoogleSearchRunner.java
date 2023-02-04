package stepDefnitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/GoogleSearch.feature", glue = "stepDefnitions", monochrome = true,
    plugin = {"pretty","html:outputs/reports/htmlReports/index.html"})
public class GoogleSearchRunner {
}
