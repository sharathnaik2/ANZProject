package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/AppFeatures/FillDetails.feature"},
		glue = "Stepdefinations",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
		}
		)
public class TestRunner {

}
