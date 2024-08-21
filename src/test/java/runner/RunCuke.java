package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", tags = "@Search-Cars or @Search-Used-Cars", glue = {
		"steps" }, monochrome = true, plugin = { "html:target/cucumber-reports/cucumber-html-report.html",
				"json:target/cucumber-reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunCuke extends AbstractTestNGCucumberTests {

	public static void setup() {

	}

}
