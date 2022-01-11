package CertificialAutomationPageObject.RequesterPages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	public WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[contains(.,'Dashboard')]")
	private WebElement dashboardHeader;
	public WebElement getDashboardHeader() {
		return dashboardHeader;
	}


	public List<WebElement> getWelcomeToCertificialPopUpHeader() {
		return  driver.findElements(
				By.xpath("//p/strong[text()='Welcome to Certificial!']"));
	}

	
	@FindBy(xpath = "//button[text()='Skip']")
	private WebElement skipButtonwelcomeToCertificialPopUp;
	public WebElement getSkipButtonwelcomeToCertificialPopUp() {
		return skipButtonwelcomeToCertificialPopUp;
	}
	
    
	@FindBy(xpath = "//input[@placeholder='Search'] | //input[@placeholder='Search Clients']")
	private WebElement companySearchInputBox;
	public WebElement getCompanySearchInputBox() {
		return companySearchInputBox;
	}

	@FindBy(xpath = "//i[@aria-label='icon: search']")
	private WebElement companySearchIcon;
	public WebElement getCompanySearchIcon() {
		return companySearchIcon;
	}

	@FindBy(xpath = "//span[@class='ant-page-header-heading-title']/h4")
	private WebElement companyNameRightPanel;
	public WebElement getCompanyNameRightPanel() {
		return companyNameRightPanel;
	}

	@FindBy(xpath = "//*[@class='anticon-spin']")
	private WebElement loadingSpinner;
	public WebElement getLoadingSpinner() {
		return loadingSpinner;
	}

	public List<String> getCompanyNameList() {
		List<String> companyNames = new ArrayList<String>();
		List<WebElement> companiesNamesList = driver.findElements(By.xpath(
				"//div[@class='ant-list-item-meta-avatar']/following-sibling::div/h4[@class='ant-list-item-meta-title']/span | //div[@class='ant-list-item-meta-avatar']/following-sibling::div/h4[@class='ant-list-item-meta-title']/div/h4"));
		for (WebElement ele : companiesNamesList) {
			String company = ele.getText();
			companyNames.add(company);
		}
		return companyNames;
	}

	public WebElement getCompanyName(String companyName) {
		return driver.findElement(
				By.xpath("//h4[@class='ant-list-item-meta-title']/span[contains(.,'" + companyName + "')]"));

	}

	@FindBy(css = "button[class='ant-btn margin-left-sm ant-dropdown-trigger ant-btn-primary ant-btn-background-ghost']")
	private WebElement filtersButton;
	public WebElement getfiltersButton() {
		return filtersButton;
	}

	public List<String> getFilterOptionsList() throws InterruptedException {
		List<String> FilterOptions = new ArrayList<String>();
		Thread.sleep(5000);
		List<WebElement> companiesNamesList = driver
				.findElements(By.xpath("//span[@class='custom-submenu']/i/following-sibling::span"));
		for (WebElement ele : companiesNamesList) {
			Thread.sleep(2000);
			String option = ele.getText();
			Thread.sleep(2000);
			FilterOptions.add(option.trim());
		}
		return FilterOptions;
	}

	@FindBy(xpath = "//span[text()='Compliance Review']")
	private WebElement complianceReviewFilterOption;
	public WebElement getComplianceReviewFilterOption() {
		return complianceReviewFilterOption;
	}

	@FindBy(xpath = "//input[@value='Complete']/parent::span")
	private WebElement completeFilterOption;
	public WebElement getCompleteFilterOption() {
		return completeFilterOption;
	}

	@FindBy(xpath = "//input[@value='Pending']/parent::span")
	private WebElement pendingFilterOption;
	public WebElement getPendingFilterOption() {
		return pendingFilterOption;
	}
	
	@FindBy(xpath = "//div[contains(.,'Compliance Status')]/div[@class='ant-select-selection-selected-value']")
	private WebElement complianceStatusDropdown;
	public WebElement getComplianceStatusDropdown() {
		return complianceStatusDropdown;
	}

	
	@FindBy(xpath = "//input[@value='Expired']")
	private WebElement expiredFilterOption;
	public WebElement getExpiredFilterOption() {
		return expiredFilterOption;
	}

	@FindBy(xpath = "//input[@value='Canceled']")
	private WebElement cancelledFilterOption;
	public WebElement getCancelledFilterOption() {
		return cancelledFilterOption;
	}

	@FindBy(xpath = "//input[@value='Unverified']")
	private WebElement unverifiedFilterOption;
	public WebElement getUnverifiedFilterOption() {
		return unverifiedFilterOption;
	}
	
	@FindBy(xpath = "//input[@value='Rejected']")
	private WebElement rejectedFilterOption;
	public WebElement getRejectedFilterOption() {
		return rejectedFilterOption;
	}

	
	public List<String> getClientPoliciesStatus() {
		List<String> policiesStatus = new ArrayList<String>();
		List<WebElement> policiesStatusList = driver.findElements(By.xpath("//div[@class='policy-sub-title']/h4"));
		for (WebElement status : policiesStatusList) {
			String company = status.getText();
			if(!policiesStatus.contains(company)) {
			policiesStatus.add(company);        }
		}
		
		policiesStatus.removeAll(Arrays.asList("", null));

		return policiesStatus;
	}
	
	
	@FindBy(xpath = "//span[text()='Company Status']")
	private WebElement companyStatusFilterOption;
	public WebElement getCompanyStatusFilterOption() {
		return companyStatusFilterOption;
	}
	
	@FindBy(xpath = "//span[text()='Policies by Status']")
	private WebElement policiesByStatusFilterOption;
	public WebElement getPoliciesByStatusFilterOption() {
		return policiesByStatusFilterOption;
	}

	@FindBy(xpath = "//span[text()='Policies by Company Record']")
	private WebElement policiesByCompanyRecordFilterOption;
	public WebElement getPoliciesByCompanyRecordFilterOption() {
		return policiesByCompanyRecordFilterOption;
	}

	@FindBy(xpath = "//div[contains(.,'Inserted are removed')]/parent::div[@class='ant-select-selection__rendered']")
	private WebElement policiesByCompanyRecordInputBox;
	public WebElement getPoliciesByCompanyRecordInputBox() {
		return policiesByCompanyRecordInputBox;
	}
	

	@FindBy(xpath = "//span[text()='Reset All Filters']/parent::button")
	private WebElement resetAllfiltersButton;
	public WebElement getResetAllfiltersButton() {
		return resetAllfiltersButton;
	}

	public WebElement getCompanyNameFilter(String companyName) {
		return driver.findElement(By.xpath("//li[@role='option' and contains(.,'" + companyName + "')]"));

	}
	
	 public void handleWelcomeToCertificialPopUp()
	    {
		 try{ 
	    int ispresent = getWelcomeToCertificialPopUpHeader().size();		 
		 if(ispresent>0){
		 getSkipButtonwelcomeToCertificialPopUp().click();
		 Thread.sleep(5000);
		 } }
		 catch(Exception e) {e.printStackTrace();}
	    }

}
