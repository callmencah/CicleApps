package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        plugin = "html:target/HTML_report.html",
        tags = "@Add"
//        @TC01sdTC30
//        @TC31sdTC38
//        @TC39sdTC50
//        @TC51sdTC57
//        @TC058
//        @TC59sdTC61
//        @TC62sdTC72
//        @TC73sdTC80
//        @SearchJumpTo
//        @Add
)
public class runAll {
}
