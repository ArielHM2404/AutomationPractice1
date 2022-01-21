package testrunners;

//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepsdefinitions"},
        tags = "@Shopping",
        monochrome = true,
        plugin = {
                "json:target/cucumber-reports/cucumber.json", "pretty",
                "html:target/cucumber-html-report/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })

public class ShopRunnerTestNG extends AbstractTestNGCucumberTests{
}
