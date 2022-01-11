package CertificialAutomationConfigurations;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class BaseTest  extends DriverFactory {
	public static Scenario scenario;
	
	@Before

	/**
	 * This method is to perform all the initial configurations before a test starts
	 * 
	 * @author Himanshu_Sharma
	 * @throws IOException
	 */
	public void launchingBroswer(Scenario scenario) throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialised successfully");

		String url = propEnv.getProperty("baseurl");
		
		driver.get(url);
		log.info("URL is launched successfully");
		System.out.println("URL is launched successfully");
		System.out.println(url+"\n");
		this.scenario = scenario;
	}

	
	  @After
	  
	  /**
		 * This method is to kill all the driver instances after the execution
		 * 
		 * @author Himanshu_Sharma
		 * @throws IOException
		 */
		 public void testDown() { driver.close(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	  }

}
