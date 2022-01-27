package FlashAutomationConfigurations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @Author: Himanshu Sharma
 * @Description: Invokes the corresponding listeners while execution
 */

public class Listeners implements ITestListener{
	  
	public static Logger log = LogManager.getLogger(Listeners.class.getName());
	
	
	
	/**
	   * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
	   * filled with the references to class, method, start millis and status.
	   *
	   * @param result the partially filled <code>ITestResult</code>
	   * @see ITestResult#STARTED
	   */
	   @Override
	   public void onTestStart(ITestResult result) {
		   
		   System.out.println("New Test Started "+"\n");
		   log.info("New Test Started ");
		  }

	   
	   
	   
		  /**
		   * Invoked each time a test succeeds.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS
		   */
	      @Override  
		  public void onTestSuccess(ITestResult result) {
	    	  System.out.println("Test Successfully Passed and Finished: '" +BaseTest.scenario.getName()+"'"+"\n");
			   log.info("Test Successfully Passed and Finished: " +BaseTest.scenario.getName());
			   BaseTest.log4jInfo("Test Successfully Passed and Finished: " +BaseTest.scenario.getName());
		  }

	      

		  /**
		   * Invoked each time a test fails.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#FAILURE
		   */
	      @Override
		  public void onTestFailure(ITestResult result) {
	    	  
	    	  WebDriver driver= null;
	    	  /*
				 * try { driver= (WebDriver)
				 * result.getTestClass().getRealClass().getDeclaredField("driver").get(result.
				 * getInstance()); } catch (IllegalArgumentException | IllegalAccessException |
				 * NoSuchFieldException | SecurityException e) { e.printStackTrace(); }
				 */
	    	  
	    	  String testCaseName=result.getName().toString().trim();
	          ITestContext context = result.getTestContext();
	          driver = (WebDriver)context.getAttribute("driver");
	    	  
	    	  
	    	    log.info("Test case '"+ BaseTest.scenario.getName()+"' is failed");
	    	    log.info("StackTrace Result: " + Thread.currentThread().getStackTrace());
	    	    System.out.println("Test case '"+ BaseTest.scenario.getName()+"' is failed"+"\n");
	    	    
	    	// Take screenshot of failed tests
			/*
			 * try { SeleniumMethods.getScreenshotPath(testCaseName,driver); } catch
			 * (IOException e) { e.printStackTrace(); }
			 */
	    	 
		  }

	           
		  /**
		   * Invoked each time a test is skipped.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SKIP
		   */
	      @Override
		  public void onTestSkipped(ITestResult result) {
	    	  
	    	  System.out.println("Test Skipped " +result.getName()+"\n");
			   log.info("Test Skipped " +result.getName());
		  }

	      
}
