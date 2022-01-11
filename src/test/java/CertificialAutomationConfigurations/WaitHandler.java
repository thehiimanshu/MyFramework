package CertificialAutomationConfigurations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @Author: Himanshu Sharma
 * @Description: Function to handle Explicit wait for Web Elements
 */

public class WaitHandler {

	public static WebDriver driver = BaseTest.driver;
	public static WebDriverWait wait = null;
	
	/*
	 * 
	 * Wait until element is ready to perform click operation
	 * 
	 */
	public static void waitForElementClickable(WebElement element, long waitTime) {
		
		try { 	
			wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}

	/*
	 * Wait until element is visible to perform any operation
	 */
	public static void waitForElementVisible(WebElement element, long waitTime) {
		
		try {
			
			wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}

	/*
	 * Wait until element with associated text is invisible
	 */
	public static void waitForElementInVisible(WebElement element, long waitTime) {
		

		try {
			wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}

	/*
	 * Wait until element is visible
	 */
	public static void waitForElementIsVisible(By webElement, long waitTime) {
		

		try {
			wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(webElement));
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}

	
	/*
	 * Wait until element is selected
	 */
	public static void waitForElementIsSelected(WebElement element, long waitTime) {
		

		try {
			wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.elementToBeSelected(element));
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}

	/*
	 * Wait until all of the expected conditions(element i visible and clickable)
	 * are satisfied
	 */
	public static void waitForAllConditions(WebElement element, long waitTime) {
		

		try {
			wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(element),
					ExpectedConditions.elementToBeClickable(element)));
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}

	/*
	 * Wait until attribute of an webElement contains some text
	 */
	public static void waitForElementAttributeContains(WebElement element, String attribute, String value, long waitTime) {
		

		try {
			wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.attributeContains(element, attribute, value));
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}

	/*
	 * 
	 * Description : Wait until webElement contains the specified text
	 * 
	 * @Params element - element inside which text to be verified text - String to
	 * be verified in element
	 */
	public static void waitForElementTextContains(WebElement element, String text, long waitTime) {
		

		try {
			wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}

	/*
	 * Wait until page is loaded successfully
	 */
	public static void waitForPageToLoad() {
		
		try {

			ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");

				}
			};

			wait = new WebDriverWait(driver, 15);
			wait.until(pageLoadCondition);
		} catch (Exception ex) {
			throw ex;
		} finally {

		}
	}


}