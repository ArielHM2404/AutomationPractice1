package testrunners;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepsdefinitions"},
        tags = "@SmokeTest or @RegularTest",
        plugin = {"pretty",
                "html:target/SystemTestReports/html.html",
                "json:target/SystemTestReports/json/report.json",
                "junit:target/SystemTestReports/junit/report.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class LoginTest2 {
}
