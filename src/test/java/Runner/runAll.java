package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Feauters",
        glue = "StepDefinitions",
        plugin = "html:target/HTML_report.html"
)
public class runAll {
}
