package FlashAutomationConfigurations;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * @Author: Himanshu Sharma
 * @Description: Various Selenium Functions to handle operations on Web Elements
 */

public class SeleniumMethods {

	
	
	public static WebDriver driver = BaseTest.driver;
	public Properties prop;
	

	/**
	 * This method is to take the screen shot at any instance and place the file in reports
	 */
	public static void getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
         String DestFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
         FileUtils.copyFile(SrcFile, new File(DestFile));
	}
	

	
	/**
	 * This method is to take the mouse controller on a particular WebElement
	 */
	public static void mouseHoverElement(WebDriver driver, WebElement path) {
		Actions action = new Actions(driver);
		action.moveToElement(path).perform();
	}

	
	
	/**
	 * This method is to right click on a particular WebElement
	 */
	public static void rightClickOnElementAndOpenIncognintoMode(WebDriver driver, WebElement path) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(path).contextClick(path).perform();
		
	}

	
	
	public String dateFormat(String myDate) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = myDate;
		Date date = sdf.parse(dateInString);
		String d = date.toString();// Sat May 30 00:00:00 IST 2015
		String sub = d.substring(4, 10);
		return sub;
	}

	
	/**
	 * This method is to close all browser instances
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();

	}

	
	/**
	 * This method is to switch the WebDriver controller to another tab/window
	 */
	public static void switchToWindow(WebDriver driver, String window) {

		//Get handles of the windows
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        
        if(window.equals("parent")) {
        	driver.switchTo().window(parentWindow);}
        else if(window.equals("child")) {
        	driver.switchTo().window(childWindow);}
        
	}
        
	
	
	public static void SelectElementInList(List<WebElement> locatorXpath, String Value) {
		try {
			List<WebElement> listElement = locatorXpath;
			for (WebElement listItem : listElement) {
				String v = listItem.getText();
				if (v.equalsIgnoreCase(Value)) {
					listItem.click();
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	
	/**
	 * Select the element in List using specified text
	 * 
	 * @param element     - Element locator
	 * @param visibleText - Selection text
	 */
	public static void selectByVisibleText(WebElement element, String visibleText) {

		try {
			WaitHandler.waitForElementClickable(element,10);
			Select selObj = new Select(element);
			selObj.selectByVisibleText(visibleText);
		} catch (Exception ex) {

		}
	}

	/**
	 * @Desc - Select the dropdown element using index
	 * @param element       - Element locator
	 * @param index - Index number for selection
	 */

	public static void selectByIndex(WebElement element, int index) {

		try {
			WaitHandler.waitForElementClickable(element,10);
			Select selObj = new Select(element);
			selObj.selectByIndex(index);
		} catch (Exception ex) {

		}
	}

	//

	/**
	 * @Description - Select the dropdown / list item using specified value
	 * @param element - Element locator
	 * @param Value   - Value to be selected in drop down
	 */
	public static void selectByValue(WebElement element, String Value) {

		try {
			WaitHandler.waitForElementClickable(element,10);
			Select selObj = new Select(element);
			selObj.selectByValue(Value);
		} catch (Exception ex) {

		}
	}

	
	/**
	 * Get the text contents from specified element
	 * 
	 * @param element - Element locator
	 */
	public static void getText(WebElement element) {
		try {
			WaitHandler.waitForElementClickable(element,10);
			element.getText();

		} catch (Exception ex) {

		}
	}
	

	/**
	 * Get attribute value of the specified element
	 * 
	 * @param element       - Element locator
	 * @param attributeName - Name of the Attribute
	 */
	public static void getAttribute(WebElement element, String attributeName) {
		try {
			WaitHandler.waitForElementClickable(element,10);
			element.getAttribute(attributeName);

		} catch (Exception ex) {

		}
	}
	
	

	/**
	 * Get attribute value of the specified element
	 * 
	 * @param element      - Element locator
	 * @param propertyName - CSS property to retrieve
	 */
	public static void getCSSValue(WebElement element, String propertyName) {

		try {
			WaitHandler.waitForElementClickable(element,10);
			element.getCssValue(propertyName);

		} catch (Exception ex) {

		}
	}

	
	
	/**
	 * Get size of element
	 * 
	 * @param element - Element locator
	 */
	public static void getSize(WebElement element) {

		try {
			WaitHandler.waitForElementClickable(element,10);
			element.getSize();

		} catch (Exception ex) {

		}
	}
	
	

	/**
	 * Get location of the specified element
	 * 
	 * @param element - Element locator
	 */
	public static void getLocation(WebElement element) {

		try {
			WaitHandler.waitForElementClickable(element,10);
			element.getLocation();
		} catch (Exception ex) {

		}
	}
	
	
	
	/**
	 * 
	 * @param element - Element to mouse Hover on
	 */
	public static void mouseHoverElement(WebElement element) {
		Actions action = new Actions(driver);
		WaitHandler.waitForElementClickable(element,10);
		action.moveToElement(element).perform();
	}

	
	
	public static void ClickAndType(WebElement element , String text)
	{
		Actions action = new Actions(driver);
		WaitHandler.waitForElementClickable(element,10);
		action.click(element).sendKeys(text).sendKeys(Keys.TAB).perform();
	}

	
	
	/**
	 * Navigate to the specified page
	 * 
	 * @param url - URL of the page
	 */
	public static void NavigateToPage(String url) {
		driver.get(url);
		WaitHandler.waitForPageToLoad();
	}
		
	
	

	/**
	 *  Function to scroll to the top of page
	 */
	public static void javaExecuterTopscroll() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window. scrollBy(0,0)");
	}
	
	

	/**
	 * Javascript Executor Click Function
	 * @param element
	 */
	public static void javaExecuterClick(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WaitHandler.waitForElementClickable(element,10);
		js.executeScript("arguments[0].click();", element);
	}

	
	/**
	 * Javascript Executor sendkeys Function
	 * @param element
	 */
	public static void javaExecuterType(WebElement element,String text ) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WaitHandler.waitForElementClickable(element,10);
		js.executeScript("arguments[0].value='" + text + "'", element);
	}
	
	
	/**
	 * Javascript Executor Page up Function
	 * @param element
	 */
	public static void javaExecuterTopscroll(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window. scrollBy(0,0)");
	}

	
	public static void javaExecuterClick(WebDriver driver, WebElement Path) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", Path);
	}

	
	/**
	 * Javascript Executor Function to scroll upto specific element
	 * @param element
	 */
	public static void scrollTillElement(WebDriver driver, WebElement path) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", path);

	}

	/**
	 *  Function to verify the title of a specific Page
	 * @param element
	 */
	public static void verifyPageTitle(String pageTitle) {
		try {
			String actualTite = driver.getTitle();
			Assert.assertEquals(actualTite, pageTitle);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	

	/**
	 *  Function to verify the title of a specific Page
	 * @param element
	 */
	public static String getPageURL(WebDriver driver) {
		
		return driver.getCurrentUrl();
	}


}
