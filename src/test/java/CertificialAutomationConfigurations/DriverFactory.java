package CertificialAutomationConfigurations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @Author: Himanshu Sharma
 * @Description: Initialize the driver and perform the initial configurations
 */
public class DriverFactory  {
	public static WebDriver driver;
	public Properties propApplication;
	public Properties propEnv;
	public static Logger log = LogManager.getLogger(DriverFactory.class.getName());

	/** 
	 * This method is to initialize the driver and perform the initial configurations
	 * 
	 *@author Himanshu_Sharma
	 *@return driver instance 
	 */
	
public WebDriver initializeDriver() throws IOException
{
		
	// Code to fetch the data from application.properties file
	propApplication = new Properties();
	FileInputStream fisApplication = new FileInputStream(System.getProperty("user.dir")+"/resources/application.properties");
	propApplication.load(fisApplication);
	 
	String platformName = propApplication.getProperty("platform");
	 String browserName = propApplication.getProperty("browser");
	 //String driverPath = System.getProperty("user.dir")+"\\"+propApplication.getProperty("driverPath")+"\\";
	 
	 String driverPath = propApplication.getProperty("driverPath");
	 	 
	 long defaulTimeout =Long.parseLong(propApplication.getProperty("timeout"));
	 String maximizeValue = propApplication.getProperty("maximize");
		 
	// Code to fetch the data from env.properties file
		propEnv = new Properties();
		FileInputStream fisEnv = new FileInputStream(System.getProperty("user.dir")+"/resources/env.properties");
		propEnv.load(fisEnv);
				
	 
	 if (browserName.equals("chrome"))
	 {
		 if (platformName.equals("windows"))
		 {
		 System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
		 }
		 
		 else if (platformName.equals("linux"))
		 {
		 System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver");
		 }
		 
		  driver = new ChromeDriver();
	 }
	 else if (browserName.equals("firefox"))
	 {
		 if (platformName.equals("windows"))
		 {
		 System.setProperty("webdriver.gecko.driver",driverPath+"geckodriver.exe");
		 }
		 
		 else if (platformName.equals("linux"))
		 {
			 System.setProperty("webdriver.gecko.driver",driverPath+"geckodriver"); 
		 }
		 
		  driver = new FirefoxDriver();
	 }
	 else if (browserName.equals("IE"))
	 {
		 if (platformName.equals("windows"))
		 {
		 System.setProperty("webdriver.ie.driver",driverPath+"IEDriverServer.exe");
		 }
		 
		 else if (platformName.equals("linux"))
		 {
			 System.setProperty("webdriver.ie.driver",driverPath+"IEDriverServer");
		 }
		  driver = new InternetExplorerDriver();
	 }
	 
	 else if (browserName.equals("headless"))
	 {
		 if (platformName.equals("windows"))
		 {
		 
		 System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
		 }
		 
		 else if (platformName.equals("linux"))
		 {
			 System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver");
		 }
		 
		  ChromeOptions options = new ChromeOptions();
	        
	        //add the headless argument
	        options.addArguments("headless");
	        options.addArguments("--test-type");
	        options.addArguments("--disable-gpu");
	        options.addArguments("--no-first-run");
	        options.addArguments("--no-default-browser-check");
	        options.addArguments("--ignore-certificate-errors");
	        options.addArguments("--window-size=1920,1080");
	        options.addArguments("--disable-extensions");
	        options.addArguments("--proxy-server='direct://'");
	        options.addArguments("--proxy-bypass-list=*");
	        options.addArguments("--disable-gpu");
	        options.addArguments("--disable-dev-shm-usage");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--ignore-certificate-errors");
	  
	        //pass the options parameter in the Chrome driver declaration
	        driver = new ChromeDriver(options);
	        		  	 }
	 
	 log.info("Driver is initialised successfully");
		
	 if(maximizeValue.equals("true")) {
		 driver.manage().window().maximize();
		 }
	 
    driver.manage().timeouts().implicitlyWait(defaulTimeout,TimeUnit.SECONDS);
    
	 return driver;
	 
	}

}
