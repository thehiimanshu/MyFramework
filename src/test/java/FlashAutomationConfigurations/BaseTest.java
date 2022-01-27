package FlashAutomationConfigurations;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseTest extends DriverFactory {
	public static Scenario scenario;
	static SimpleDateFormat formatter = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss");
	static Date sysdate = new Date();
	public static ExtentTest test;
	public ExtentReports extent;

	@Before

	/**
	 * This method is to perform all the initial configurations before a test starts
	 * 
	 * @author Himanshu_Sharma
	 * @throws IOException
	 */
	public void launchingBroswer(Scenario scenario) throws IOException {
		this.scenario = scenario;

		// Initiating the configurations for extent Reports
		String extendReportName = "ExecutionReport" + "_" + System.getProperty("user.name") + formatter.format(sysdate)
				+ ".html";
		String executionReportPath = System.getProperty("user.dir") + "\\test-output" + "\\reports\\"
				+ extendReportName;

		extent = new ExtentReports(executionReportPath, true);
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\resources\\extent-config.xml"));
		test = extent.startTest(scenario.getName());

		// Initializing the webdriver
		driver = initializeDriver();
		
		log.info("Driver is initialised successfully");
		log4jInfo("Driver is initialised successfully");
		String url = propEnv.getProperty("baseurl");

		driver.get(url);
		log.info("URL is launched successfully: " +url + "\n");
		log4jInfo("URL is launched successfully: " +url );
		
	}

	/************************
	 * @Purpose- Handling extent logs and log4js log
	 *******************************/
	public static void log4jInfo(String message) {
		Logger logger = LogManager.getLogger(BaseTest.class.getName());
		logger.info(message);
		try {

			test.log(LogStatus.PASS, message);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void log4jError(String message) {
		Logger logger = LogManager.getLogger(BaseTest.class.getName());
		logger.error(message);
		try {

			test.log(LogStatus.FAIL, message);
			// takeScreenShot();

		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void log4jfatal(String message) {
		Logger logger = LogManager.getLogger(BaseTest.class.getName());
		logger.fatal(message);

	}

	@After

	/**
	 * This method is to kill all the driver instances after the execution
	 * 
	 * @author Himanshu_Sharma
	 * @throws IOException
	 */
	public void testDown() {
		extent.endTest(test);
		extent.flush();
		extent.close();
		driver.close();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
