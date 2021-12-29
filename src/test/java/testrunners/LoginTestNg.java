package testrunners;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepsdefinitions"},
        tags = "@SmokeTest",
        monochrome = true,
        plugin = {
                "json:target/cucumber-reports/cucumber.json", "pretty",
                "html:target/cucumber-html-report/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class LoginTestNg extends AbstractTestNGCucumberTests{
}
