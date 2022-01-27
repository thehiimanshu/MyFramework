package FlashAutomationStepDefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import CertificialAutomationPageObject.AgentPages.ClientsPage;
import CertificialAutomationPageObject.AgentPages.PendingApprovalsPage;
import CertificialAutomationPageObject.RequesterPages.DashboardPage;
import FlashAutomationConfigurations.BaseTest;
import FlashAutomationConfigurations.WaitHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AgentPendingApprovalsSteps {

	public WebDriver driver = BaseTest.driver;
	public static Logger log = LogManager.getLogger(AgentPendingApprovalsSteps.class.getName());

	@When("I select pending approvals tab$")
	public void selectOpenRequestTab() throws IOException, InterruptedException {
		PendingApprovalsPage pendingApprovalsPage = new PendingApprovalsPage(driver);
		ClientsPage clientsPage = new ClientsPage(driver);

		clientsPage.handleReceiveARequestForInsurancePopUp();
		WaitHandler.waitForElementClickable(pendingApprovalsPage.getPendingApprovalsTab(), 20);
		pendingApprovalsPage.getPendingApprovalsTab().click();
		WaitHandler.waitForElementVisible(pendingApprovalsPage.getPendingApprovalsHeader(), 20);
		Assert.assertTrue(pendingApprovalsPage.getPendingApprovalsHeader().isDisplayed());
		clientsPage.handleReceiveARequestForInsurancePopUp();
	}
	
	@Then("I verify that the ([^\"]*) is searched successfully for pending approvals$")
	public void verifyCompanySearch(String companyName) throws IOException, InterruptedException {
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		Thread.sleep(3000);
		for (String company : dashboardPage.getCompanyNameList()) {
			Assert.assertTrue(company.contains(companyName));
		}
	}
	
	
	@And("I click on \"(.+)\" tab for pending approvals$")
	public void clickonVariousPolicySharesTabs(String tabName) throws IOException, InterruptedException {
		PendingApprovalsPage pendingApprovalsPage = new PendingApprovalsPage(driver);
		switch (tabName) {

		case "Policy Shares":
			pendingApprovalsPage.getPolicySharesTab().click();
			break;
			
		case "Policy Requests":
		    pendingApprovalsPage.getPolicyRequestsTab().click();
			break;
			
		case "Policy Verification":
			pendingApprovalsPage.getPolicyVerificationTab().click();
			break;
		}
	}
	
	
	@Then("I verify that \"(.+)\" tab is opened successfully for pending approvals$")
	public void verifyVariousPolicySharesTabs(String tabName) throws IOException, InterruptedException {
		PendingApprovalsPage pendingApprovalsPage = new PendingApprovalsPage(driver);
		
		switch (tabName) {

		case "Policy Shares":
			DashboardPage dashboardPage = new DashboardPage(driver);
			WaitHandler.waitForElementInVisible(dashboardPage.getLoadingSpinner(), 30);
			Assert.assertTrue(pendingApprovalsPage.getPolicySharesHeader().isDisplayed());
			break;
			
		case "Policy Requests":
			//Assert.assertTrue(pendingApprovalsPage.getPolicyRequestsTab().click();
			break;
			
		case "Policy Verification":
			Thread.sleep(5000);
			Assert.assertTrue(pendingApprovalsPage.getclientsHeader().isDisplayed());
			break;
		}
	}
}
