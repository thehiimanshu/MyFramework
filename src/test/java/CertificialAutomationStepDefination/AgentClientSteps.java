package CertificialAutomationStepDefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import CertificialAutomationConfigurations.BaseTest;
import CertificialAutomationConfigurations.DriverFactory;
import CertificialAutomationConfigurations.SeleniumMethods;
import CertificialAutomationConfigurations.WaitHandler;
import CertificialAutomationPageObject.AgentPages.ClientsPage;
import CertificialAutomationPageObject.RequesterPages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AgentClientSteps {

	public WebDriver driver = BaseTest.driver;
	public static Logger log = LogManager.getLogger(DriverFactory.class.getName());
	
	@Then("I verify that Issue COI side bar is displayed when I click on Issue COI button$")
	public void verifyIssueCOIButton() throws IOException, InterruptedException {
		ClientsPage clientsPage = new ClientsPage(driver);
		clientsPage.handleReceiveARequestForInsurancePopUp();
		WaitHandler.waitForElementClickable(clientsPage.getIssueCOIButton(), 10);
		clientsPage.getIssueCOIButton().click();
		Assert.assertTrue(clientsPage.getIssueCOISideBarheader().isDisplayed());
	} 
	
	@Then("I verify that a preview to download COI is displayed when I click on preview & Download COI Button$")
	public void verifyPreviewAndDownloadCOIButton() throws IOException, InterruptedException {
		ClientsPage clientsPage = new ClientsPage(driver);
		clientsPage.handleReceiveARequestForInsurancePopUp();
		WaitHandler.waitForElementClickable(clientsPage.getPreviewAndDownloadCOIButton(), 10);
		String parent = driver.getWindowHandle();
		clientsPage.getPreviewAndDownloadCOIButton().click();
		Thread.sleep(5000);
		SeleniumMethods.switchToWindow(driver, "child");
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("blob:https://test.certificial.com"));
		driver.switchTo().window(parent);
	} 
	
	
	@When("I click on manage shares button for client ([^\"]*)$")
	public void verifyManageSharesButton(String clientName) throws IOException, InterruptedException {
		ClientsPage clientsPage = new ClientsPage(driver);
		DashboardPage dashboardPage = new DashboardPage(driver);
		clientsPage.handleReceiveARequestForInsurancePopUp();
		clientsPage.getClientName(clientName).click();
		WaitHandler.waitForElementInVisible(dashboardPage.getLoadingSpinner(), 20);
		WaitHandler.waitForElementClickable(clientsPage.getManageSharesButton(), 10);
		clientsPage.getManageSharesButton().click();
		WaitHandler.waitForElementInVisible(dashboardPage.getLoadingSpinner(), 20);
	}
	
	
	@And("I verify that all companies associated with client ([^\"]*) are displayed$")
	public void verifypolicyshares(String clientName) throws IOException, InterruptedException {
		ClientsPage clientsPage = new ClientsPage(driver);
		DashboardPage dashboardPage = new DashboardPage(driver);
		clientsPage.handleReceiveARequestForInsurancePopUp();
		for(WebElement company: clientsPage.getSharedCompanyNameList())
		{
		company.click();
		WaitHandler.waitForElementInVisible(dashboardPage.getLoadingSpinner(), 20);
		String header = clientsPage.getClientNameAsManageSharesHeader().getText();
		Assert.assertEquals(header, "Policy Shares - "+clientName);
		}
	}
	
	@And("I verify that agent clients page is displayed when I click on manage shares back button$")
	public void verifyManagepolicysharesBAckButton() throws IOException, InterruptedException {
		ClientsPage clientsPage = new ClientsPage(driver);
		clientsPage.getBackButton().click();
		Assert.assertTrue(clientsPage.getClientPoliciesHeader().isDisplayed());
		
	}
	
	@And("I verify that \"(.+)\" button is getting displayed$")
	public void verifyVariousButtonsForManageShares(String buttonName) throws IOException, InterruptedException {
		
		ClientsPage clientsPage = new ClientsPage(driver);
		clientsPage.handleReceiveARequestForInsurancePopUp();
		Thread.sleep(5000);
		switch (buttonName) {

		case "Generate & Download COI":
			Assert.assertTrue(clientsPage.getGenerateAndDownloadCOIButtonManageShares().isDisplayed());
			break;
			
		case "All Attachments":
			Assert.assertTrue(clientsPage.getAllAttachmentsButtonManageShares().isDisplayed());

			break;
			
			
		case "Download Company History":

			Assert.assertTrue(clientsPage.getDownloadCompanyHistoryButtonManageSharess().isDisplayed());
			break;

		case "Issue COI":
			Assert.assertTrue(clientsPage.getIssueCOIButton().isDisplayed());
			break;
			
			
		case "Add New Policy":
			clientsPage.getAddNewPolicyButton().click();
			Assert.assertTrue(clientsPage.getAddNewPolicySidebarHeader().isDisplayed());
			break;

		}
		
	}
	
}
