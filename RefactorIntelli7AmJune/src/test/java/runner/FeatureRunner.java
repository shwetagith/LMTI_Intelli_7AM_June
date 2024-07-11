package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinition","hooks"},
        tags = "@Amazon01",
        plugin = {"pretty",
                   "html:target/HtmlReport.html",
                    "junit:target/JunitReport.xml",
                    "json:target/JsonReport.json"
                             }
)

public class FeatureRunner {
}
