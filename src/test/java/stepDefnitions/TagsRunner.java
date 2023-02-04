package stepDefnitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Tags.feature", glue = "src/test/java/stepDefnitions",
    tags = "@all")
public class TagsRunner {
    /**
     *  tags = "@all"
     *      scenarios 1 to 5
     *
     *  tags = "@Smoke"
     *      scenario 1, scenario4
     *
     *  tags = "@Smoke or @Regression"
     *       scenario 1, scenario 2, scenario 4
     *
     *  tags = "@Smoke and @Regression"
     *      scenario 4
     *  tags = "@Smoke or @Regression and @Important"
     *      scenario 1, scenario 4
     *
     *  tags = "(@Smoke or @Regression) and @Important"
     *      scenario 5
     *
     *  tags = "@Smoke and not @Regression"
     *      scenario 1, scenario 5
     */
}
