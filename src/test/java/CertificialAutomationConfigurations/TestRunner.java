package CertificialAutomationConfigurations;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

/**
 * @Author: Himanshu Sharma
 * @Description: Configures all files path and triggers the test execution
 */

@CucumberOptions(features = "src/test/java/Feature Files", glue = { "CertificialAutomationStepDefination",
		"CertificialAutomationConfigurations", "CertificialAutomationPageObject" }, strict = true, monochrome = true,
		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		 //tags = "@Insurer_Page_Navigation"
		 //tags = "@Agent_Page_Navigation"
       	 //tags = "@Requester_Page_Navigation"
		 //tags = "@Certificial_Page_Navigation"
	     //tags = "@Agent_Search"
		   tags = "@Test4"
		 )

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
