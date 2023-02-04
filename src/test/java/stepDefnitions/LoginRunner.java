package stepDefnitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // requires junit dependancy
@CucumberOptions(features="src/test/resources/Features", glue={"stepDefnitions"},
        monochrome = true, plugin = {"pretty","html:outputs/reports/htmlReports/index.html", "json:outputs/reports/jsonReports/index.json", "junit:outputs/reports/xmlReports/index.xml"},
        tags = "@SmokeScenarios")  // requires cucumber-junit dependancy from io.cucumber
public class LoginRunner {
    /**
     * With the help of runner class we can excute multiple feature files.
     * features and glue are mandatory fields.
     * monochrome is for printing extra details in console
     *
     * for auto generated reports
     * add attribute plugin={"pretty", "path To save report"}
     * plugin = {"pretty","html:outputs/reports/htmlReports/index.html"} for html reports
     * plugin = {"pretty","json:outputs/reports/htmlReports/index.json"} for json reports
     * plugin = {"pretty","junit:outputs/reports/htmlReports/index.xml"} for xml reports
     *
     * tags attribute will execute only scenarios with given tag
     */
}
