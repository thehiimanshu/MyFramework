package CertificialAutomationStepDefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import CertificialAutomationConfigurations.BaseTest;
import CertificialAutomationConfigurations.DriverFactory;
import CertificialAutomationConfigurations.WaitHandler;
import CertificialAutomationPageObject.AgentPages.ClientsPage;
import CertificialAutomationPageObject.AgentPages.OpenRequestsPage;
import CertificialAutomationPageObject.RequesterPages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AgentOpenRequestSteps {
	
	public WebDriver driver = BaseTest.driver;
	public static Logger log = LogManager.getLogger(DriverFactory.class.getName());
	
	@When("I select open request tab$")
	public void selectOpenRequestTab() throws IOException, InterruptedException {
		OpenRequestsPage openRequestsPage = new OpenRequestsPage(driver);
		ClientsPage clientsPage = new ClientsPage(driver);
		
		clientsPage.handleReceiveARequestForInsurancePopUp();
		WaitHandler.waitForElementClickable(openRequestsPage.getOpenRequestsTab(), 20);		
		openRequestsPage.getOpenRequestsTab().click();
		WaitHandler.waitForElementVisible(openRequestsPage.getOpenRequestsHeader(),20);
		Assert.assertTrue(openRequestsPage.getOpenRequestsHeader().isDisplayed());
		clientsPage.handleReceiveARequestForInsurancePopUp();
	} 
	
	@When("I click on respond to request button$")
	public void verifyRespondToRequestButton() throws IOException, InterruptedException {
		OpenRequestsPage openRequestsPage = new OpenRequestsPage(driver);
		DashboardPage dashboardPage = new DashboardPage(driver);
		WaitHandler.waitForElementInVisible(dashboardPage.getLoadingSpinner(), 20);
		openRequestsPage.getRespondToRequestButton().click();
		Thread.sleep(5000);
		WaitHandler.waitForElementVisible(openRequestsPage.getRespondToRequestPolicySidebarHeader(), 10);
		Assert.assertTrue(openRequestsPage.getRespondToRequestPolicySidebarHeader().isDisplayed());
	}
	
	
	@Then("I verify end to end flow for Respond to policy request$")
	public void verifyRespondToPolicyFlow() throws IOException, InterruptedException {
		OpenRequestsPage openRequestsPage = new OpenRequestsPage(driver);
		
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Policy Selection").getAttribute("class").contains("item-active"));
		openRequestsPage.getRespondToRequestNextButton().click();
		Thread.sleep(3000);
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Policy Selection").getAttribute("class").contains("item-finish"));
		
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Remarks").getAttribute("class").contains("item-active"));
		openRequestsPage.getRespondToRequestNextButton().click();
		Thread.sleep(3000);
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Remarks").getAttribute("class").contains("item-finish"));
		
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Additional Documents").getAttribute("class").contains("item-active"));
		openRequestsPage.getRespondToRequestNextButton().click();
		Thread.sleep(3000);
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Additional Documents").getAttribute("class").contains("item-finish"));
				
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Cert Holder Info").getAttribute("class").contains("item-active"));
		openRequestsPage.getRespondToRequestNextButton().click();
		Thread.sleep(3000);
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Cert Holder Info").getAttribute("class").contains("item-finish"));
		
		Assert.assertTrue(openRequestsPage.getRespondPolicySelectionStatus("Summary").getAttribute("class").contains("item-active"));
		
	}
	
	@And("I verify that \"(.+)\" button is getting displayed for agent open request$")
	public void verifyVariousButtonsForManageShares(String buttonName) throws IOException, InterruptedException {
		OpenRequestsPage openRequestsPage = new OpenRequestsPage(driver);
		ClientsPage clientsPage = new ClientsPage(driver);
		clientsPage.handleReceiveARequestForInsurancePopUp();
		Thread.sleep(5000);
		switch (buttonName) {

		case "Certificate Upload":
			Assert.assertTrue(openRequestsPage.getCertificateUploadButton().isDisplayed());
			break;
			
		case "All Attachments":
			Assert.assertTrue(openRequestsPage.getAllAttachmentsButton().isDisplayed());
			break;
			
		case "Respond To request":
			Assert.assertTrue(openRequestsPage.getRespondToRequestButton().isDisplayed());
			break;

		case "Deny Request":
			Assert.assertTrue(openRequestsPage.getDenyRequestButton().isDisplayed());
			break;
		
		}
		
	}
}
