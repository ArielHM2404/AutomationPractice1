package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;

public class TestExtentReport {

    public ExtentSparkReporter htmlReporter; //Create the HTML file and add config
    public ExtentReports extent; //Attaching Reporter.
    public ExtentTest test; //Maintanbing tc, adding logs status.


    @BeforeTest
    public void setReport() {

//        htmlReporter = new ExtentSparkReporter()
    }
}
