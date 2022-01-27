package FlashAutomationStepDefination;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import FlashAutomationConfigurations.BaseTest;
import FlashAutomationConfigurations.WaitHandler;
import FlashAutomationPageObject.RedBusPages.RedBusBusSearchPage;
import FlashAutomationPageObject.RedBusPages.RedBusHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author sharma_ha
 *
 */
public class RedBusSteps {

	public WebDriver driver = BaseTest.driver;
	public static Logger log = LogManager.getLogger(RedBusSteps.class.getName());

	@When("I search buses from ([^\"]*) to ([^\"]*) for the date ([^\"]*)$")
	public void verifyRedBusSearch(String fromCity, String toCity, String date)
			throws IOException, InterruptedException {

		RedBusHomePage redBusHomePage = new RedBusHomePage(driver);
		Assert.assertTrue(redBusHomePage.getCertificialLogo().isDisplayed());
		
		redBusHomePage.getFromCityInputbox().sendKeys(Keys.chord(Keys.CONTROL, "a"), fromCity);
		redBusHomePage.getCityAutoSuggest().click();
		
		redBusHomePage.getToCityInputbox().sendKeys(Keys.chord(Keys.CONTROL, "a"), toCity);
		redBusHomePage.getCityAutoSuggest().click();
		
		dateSelector(date, redBusHomePage.getCalenderMonthTitle(), redBusHomePage.getNextMonthArrow());
		redBusHomePage.getSearchButton().click();
		
	}
	@Then("I verify that the Red Bus is Searched successfully from ([^\"]*) to ([^\"]*)$")
	     public void verifyRedBusSearch(String fromCity, String toCity) throws IOException, InterruptedException
	     {
		    RedBusBusSearchPage redBusBusSearchPage = new RedBusBusSearchPage(driver);
		    WaitHandler.waitForElementVisible(redBusBusSearchPage.getBusTable(), 30);
		    
		    Assert.assertTrue(redBusBusSearchPage.getSourceCity().getText().equals(fromCity));
		    Assert.assertTrue(redBusBusSearchPage.getDestinationCity().getText().equals(toCity));
		    
		    log.info("Red Bus is Searched successfully from "+ fromCity +" To "+ toCity);
		    BaseTest.log4jInfo("Red Bus is Searched successfully from "+ fromCity +" To "+ toCity);
		  
	     }

	public void dateSelector(String date, WebElement monthTitle, WebElement nextMonthArrow) throws InterruptedException {
		String dateString = null;
		String monthString = null;
		RedBusHomePage redBusHomePage = new RedBusHomePage(driver);

		for (int i = 0; i < date.length(); i++) {
			char ch = date.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

				dateString = date.substring(0, i).trim();
				monthString = date.substring(i, date.length());
				break;
			}
		}
		redBusHomePage.getCalenderField().click();
		
		switch (monthString) {

		case "January 2022":
			
               while(!monthTitle.getText().equalsIgnoreCase("Jan 2022"))
               {
            	   redBusHomePage.getNextMonthArrow().click();
               }
               
			break;
               
		case "February 2022":
			
            while(!monthTitle.getText().equalsIgnoreCase("Feb 2022"))
            {  
         	   redBusHomePage.getNextMonthArrow().click();
            } 

			break;
			
		case "March 2022":
			
			  while(!monthTitle.getText().equalsIgnoreCase("Mar 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }

			break;
			
		case "April 2022":

			  while(!monthTitle.getText().equalsIgnoreCase("Apr 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;
			
		case "May 2022":

			  while(!monthTitle.getText().equalsIgnoreCase("May 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;
			
		case "June 2022":

			  while(!monthTitle.getText().equalsIgnoreCase("Jun 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;
			
		case "July 2022":
			  
			while(!monthTitle.getText().equalsIgnoreCase("July 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;
			
		case "August 2022":

			  while(!monthTitle.getText().equalsIgnoreCase("Aug 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;
			
		case "September 2022":

			  while(!monthTitle.getText().equalsIgnoreCase("Sept 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;
			
		case "October 2022":

			  while(!monthTitle.getText().equalsIgnoreCase("Oct 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;
			
		case "Novermber 2022":
			
			  while(!monthTitle.getText().equalsIgnoreCase("Nov 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;

		case "December 2022":

			  while(!monthTitle.getText().equalsIgnoreCase("Dec 2022"))
	            {  
	         	   redBusHomePage.getNextMonthArrow().click();
	            }
			break;

		}
		
		 for (WebElement ele : redBusHomePage.getbookingDateList()) {
    			String option = ele.getText();
    			
    			if(option.equals(dateString)) {
    				ele.click();
    				break;
     			}
     		} 

	}

}
