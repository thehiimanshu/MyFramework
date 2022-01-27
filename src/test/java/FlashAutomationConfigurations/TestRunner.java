package FlashAutomationConfigurations;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

/**
 * @Author: Himanshu Sharma
 * @Description: Configures all files path and triggers the test execution
 */

@CucumberOptions(features = "src/test/java/Feature Files", glue = { "FlashAutomationStepDefination",
		"FlashAutomationConfigurations", "FlashAutomationPageObject" }, strict = true, monochrome = true,
		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		
		   tags = "@Red_Bus_Search"
		 )

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
