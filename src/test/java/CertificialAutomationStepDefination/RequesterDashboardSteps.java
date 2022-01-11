package CertificialAutomationStepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import CertificialAutomationConfigurations.BaseTest;
import CertificialAutomationConfigurations.DriverFactory;
import CertificialAutomationConfigurations.SeleniumMethods;
import CertificialAutomationConfigurations.WaitHandler;
import CertificialAutomationPageObject.AgentPages.ClientsPage;
import CertificialAutomationPageObject.RequesterPages.DashboardPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequesterDashboardSteps {

	public WebDriver driver = BaseTest.driver;
	public static Logger log = LogManager.getLogger(DriverFactory.class.getName());
	SoftAssert SoftAssert = new SoftAssert();

	@When("I enter ([^\"]*) in search box$")
	public void enterTextDashboardSearchBox(String companyName) throws IOException, InterruptedException, NoSuchElementException {
		
		Thread.sleep(5000);
		DashboardPage dashboardPage = new DashboardPage(driver);
		ClientsPage clientsPage = new ClientsPage(driver);
		dashboardPage.handleWelcomeToCertificialPopUp();
		clientsPage.handleReceiveARequestForInsurancePopUp();
		dashboardPage.getCompanySearchInputBox().sendKeys(companyName);
		WaitHandler.waitForElementClickable(dashboardPage.getCompanySearchIcon(), 20);
		dashboardPage.getCompanySearchIcon().click();

	}

	@Then("I verify that the ([^\"]*) is searched successfully$")
	public void verifyCompanySearch(String companyName) throws IOException, InterruptedException {
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		WaitHandler.waitForElementInVisible(dashboardPage.getLoadingSpinner(), 30);
		for (String company : dashboardPage.getCompanyNameList()) {
			Assert.assertTrue(company.contains(companyName));
		}
	}

	@And("I verify that the ([^\"]*) details is displayed in right panel when I click on company label$")
	public void verifyRightPanelLabel(String companyName) throws IOException, InterruptedException {
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		Assert.assertTrue(dashboardPage.getCompanyNameRightPanel().isDisplayed());
	}

	@When("I hover on filter button$")
	public void hoverFilterButton() throws IOException, NoSuchElementException {
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		ClientsPage clientsPage = new ClientsPage(driver);
		dashboardPage.handleWelcomeToCertificialPopUp();
		clientsPage.handleReceiveARequestForInsurancePopUp();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dashboardPage.getfiltersButton().click();
		//SeleniumMethods.mouseHoverElement(dashboardPage.getfiltersButton());

	}

	@Then("I verify that the filter menu is displayed with following filter options$")
	public void filterMenuOptions(DataTable table) throws IOException, InterruptedException, NoSuchElementException {
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		List<String> expextedFilterOptions = table.asList();
		List<String> AppFilterOptions = dashboardPage.getFilterOptionsList();
		boolean isEqual = expextedFilterOptions.equals(AppFilterOptions);
		Assert.assertTrue(isEqual);
	}

	@And("I select \"(.+)\" option from  \"(.+)\" filter menu$")
	public void selectfiltermenuOptions(String filterValue, String filterType)
			throws IOException, InterruptedException {
		Thread.sleep(5000);
		DashboardPage dashboardPage = new DashboardPage(driver);

		switch (filterType) {

		case "Compliance Review":

		
			SeleniumMethods.mouseHoverElement(dashboardPage.getComplianceReviewFilterOption());

			if (filterValue.equals("Complete")) {
				dashboardPage.getCompleteFilterOption().click();
			} else if (filterValue.equals("Pending")) {
				dashboardPage.getPendingFilterOption().click();
			}

			break;

		case "Policies by Status":
			
			SeleniumMethods.mouseHoverElement(dashboardPage.getPoliciesByStatusFilterOption());
			Thread.sleep(5000);

			if (filterValue.equals("Rejected")) {
				dashboardPage.getRejectedFilterOption().click();
			} else if (filterValue.equals("Canceled")) {
				dashboardPage.getCancelledFilterOption().click();
			} else if (filterValue.equals("Unverified")) {
				dashboardPage.getUnverifiedFilterOption().click();
			}

			break;

		case "Policies by Company Record":

			WaitHandler.waitForElementVisible(dashboardPage.getPoliciesByCompanyRecordFilterOption(), 10);
			SeleniumMethods.mouseHoverElement(dashboardPage.getPoliciesByCompanyRecordFilterOption());
			dashboardPage.getPoliciesByCompanyRecordInputBox().click();
			dashboardPage.getCompanyNameFilter(filterValue).click();

			break;
		}

	}

	@Then("I verify that the \"(.+)\" filter for \"(.+)\" is applied successfully$")
	public void verifyfiltermenuOptions(String filterValue, String filterType) throws IOException {
		DashboardPage dashboardPage = new DashboardPage(driver);
		WaitHandler.waitForElementInVisible(dashboardPage.getLoadingSpinner(), 20);

		switch (filterType) {

		case "Compliance Review":
			if (filterValue.equals("Complete")) {
				Assert.assertEquals(dashboardPage.getComplianceStatusDropdown().getAttribute("title"), "Complete");

			} else if (filterValue.equals("Pending")) {

				Assert.assertEquals(dashboardPage.getComplianceStatusDropdown().getAttribute("title"), "Pending");
			}

			break;

		case "Policies by Status":
			if (filterValue.equals("Rejected")) {
				for (String policiesStatus : dashboardPage.getClientPoliciesStatus())
					Assert.assertEquals(policiesStatus, "Rejected");
			}

			else if (filterValue.equals("Canceled")) {
				for (String policiesStatus : dashboardPage.getClientPoliciesStatus())
					Assert.assertEquals(policiesStatus, "Canceled");
			}

			else if (filterValue.equals("Unverified")) {
				for (String policiesStatus : dashboardPage.getClientPoliciesStatus())
					Assert.assertEquals(policiesStatus, "Unverified");
			}

			break;
		}

	}

	@Then("I verify that reset button is \"(.+)\" when \"(.+)\" filter is selected$")
	public void verifyResetButoonFunctionality(String buttonfunction, String filter) throws InterruptedException {
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		if (filter.equals("no")) {
			boolean buttonStatus = dashboardPage.getResetAllfiltersButton().isEnabled();
			Assert.assertFalse(buttonStatus);

		} else if (filter.equals("any")) {
			if (dashboardPage.getPoliciesByStatusFilterOption().getSize() != null) {
				SeleniumMethods.mouseHoverElement(dashboardPage.getPoliciesByStatusFilterOption());
				Thread.sleep(5000);
				dashboardPage.getRejectedFilterOption().click();
			}

			WaitHandler.waitForElementInVisible(dashboardPage.getLoadingSpinner(), 20);
			WaitHandler.waitForElementVisible(dashboardPage.getfiltersButton(), 10);
			SeleniumMethods.mouseHoverElement(dashboardPage.getfiltersButton());
			boolean buttonStatus = dashboardPage.getResetAllfiltersButton().isEnabled();
			Assert.assertTrue(buttonStatus);

		}

	}

	@Then("I verify that company status is corresponding to the combine status of all policies$")
	public void verifyCompanyStatusWithPolicies(DataTable table) {
		List<Map<Integer, String>> policiesStatus = table.asMaps(Integer.class, String.class);

	}
}
