package CertificialAutomationStepDefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import CertificialAutomationConfigurations.BaseTest;
import CertificialAutomationConfigurations.DriverFactory;
import CertificialAutomationConfigurations.SeleniumMethods;
import CertificialAutomationConfigurations.WaitHandler;
import CertificialAutomationPageObject.AgentPages.AgentArticlesPage;
import CertificialAutomationPageObject.AgentPages.AgentMyProfilePage;
import CertificialAutomationPageObject.AgentPages.ClientsPage;
import CertificialAutomationPageObject.AgentPages.NotificationsPage;
import CertificialAutomationPageObject.AgentPages.OpenRequestsPage;
import CertificialAutomationPageObject.AgentPages.PendingApprovalsPage;
import CertificialAutomationPageObject.AgentPages.PendingUserPage;
import CertificialAutomationPageObject.CertificialCommonPages.LoginPage;
import CertificialAutomationPageObject.InsurerPage.MyPoliciesPage;
import CertificialAutomationPageObject.InsurerPage.PendingRequestsPage;
import CertificialAutomationPageObject.InsurerPage.SharePoliciesPage;
import CertificialAutomationPageObject.InsurerPage.UpgradePage;
import CertificialAutomationPageObject.RequesterPages.DashboardPage;
import CertificialAutomationPageObject.RequesterPages.RequestPolicyPage;
import CertificialAutomationPageObject.RequesterPages.RequesterMyProfilePage;
import CertificialAutomationPageObject.RequesterPages.TemplatesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	public WebDriver driver = BaseTest.driver;
	public static Logger log = LogManager.getLogger(DriverFactory.class.getName());
	

	@Given("I login to the certificial with ([^\"]*) and ([^\"]*)$")

	public void loginCertificial(String UserName, String password) throws IOException, InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailTextBox().sendKeys(UserName);
		loginPage.getPasswordTextBox().sendKeys(password);
		loginPage.getLoginButton().click();
		SeleniumMethods.verifyPageTitle("Certificial | Digital Insurance Verification");
		Thread.sleep(5000);

	}

	@Then("^I verify \"(.+)\" Page with ([^\"]*)$")

	public void verifyPageNavigation(String page, String PageURL) throws IOException, InterruptedException {
		switch (page) {

		case "Dashboard":
			driver.get(PageURL);
			DashboardPage dashboardPage = new DashboardPage(driver);
			WaitHandler.waitForElementVisible(dashboardPage.getDashboardHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(dashboardPage.getDashboardHeader().isDisplayed(), "Dashboard page is not verified");
			log.info("Dashboard URL is launched successfully");
			System.out.println("Dashboard URL is launched successfully");

			break;

		case "Request Policy":
			driver.get(PageURL);
			RequestPolicyPage requestPolicyPage = new RequestPolicyPage(driver);
			WaitHandler.waitForElementVisible(requestPolicyPage.getRequestPolicyHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(requestPolicyPage.getRequestPolicyHeader().isDisplayed(),
					"Request Policy page is not verified");
			log.info("Request Policy URL is launched successfully");
			System.out.println("Request Policy URL is launched successfully");

			break;

		case "Templates":
			driver.get(PageURL);
			TemplatesPage templatesPage = new TemplatesPage(driver);
			WaitHandler.waitForElementVisible(templatesPage.getTemplatesHeaderHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(templatesPage.getTemplatesHeaderHeader().isDisplayed(),
					"Policy Templates page is not verified");
			log.info("Templates URL is launched successfully");
			System.out.println("Templates URL is launched successfully");


			break;

		case "My Profile":
			driver.get(PageURL);
			RequesterMyProfilePage myProfilePage = new RequesterMyProfilePage(driver);
			WaitHandler.waitForElementVisible(myProfilePage.getMyProfileHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(myProfilePage.getMyProfileHeader().isDisplayed(), "My Profile page is not verified");
			log.info("My Profile URL is launched successfully");
			System.out.println("My Profile URL is launched successfully");
			break;

		case "Clients":
			driver.get(PageURL);
			ClientsPage clientsPage = new ClientsPage(driver);
			WaitHandler.waitForElementVisible(clientsPage.getClientPoliciesHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(clientsPage.getClientPoliciesHeader().isDisplayed(), "Clients page is not verified");
			log.info("Clients URL is launched successfully");
			System.out.println("Clients URL is launched successfully");
			break;

		case "Pending Approvals":
			driver.get(PageURL);
			PendingApprovalsPage pendingApprovalsPage = new PendingApprovalsPage(driver);
			WaitHandler.waitForElementVisible(pendingApprovalsPage.getPendingApprovalsHeader(), 20);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(pendingApprovalsPage.getPendingApprovalsHeader().isDisplayed(),
					"Pending Approvals page is not verified");
			log.info("Pending Approvals URL is launched successfully");
			System.out.println("Pending Approvals URL is launched successfully");
			break;

		case "Open Requests":
			driver.get(PageURL);
			OpenRequestsPage openRequestsPage = new OpenRequestsPage(driver);
			WaitHandler.waitForElementVisible(openRequestsPage.getOpenRequestsHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(openRequestsPage.getOpenRequestsHeader().isDisplayed(),
					"Open Requests page is not verified");
			log.info("Open Requests URL is launched successfully");
			System.out.println("Open Requests URL is launched successfully");
			break;

		case "Notifications":
			driver.get(PageURL);
			NotificationsPage notificationsPage = new NotificationsPage(driver);
			WaitHandler.waitForElementVisible(notificationsPage.getNotificationsHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(notificationsPage.getNotificationsHeader().isDisplayed(),
					"Notifications page is not verified");
			log.info("Notifications URL is launched successfully");
			System.out.println("Notifications URL is launched successfully");
			break;

		case "Agent My profile":
			driver.get(PageURL);
			AgentMyProfilePage agentMyProfilePage = new AgentMyProfilePage(driver);
			WaitHandler.waitForElementVisible(agentMyProfilePage.getMyProfileHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(agentMyProfilePage.getMyProfileHeader().isDisplayed(),
					"Agent's My profile page is not verified");
			log.info("Agent My profile URL is launched successfully");
			System.out.println("Agent My profile URL is launched successfully");
			break;

		case "Pending Users":
			driver.get(PageURL);
			PendingUserPage pendingUserPages = new PendingUserPage(driver);
			WaitHandler.waitForElementVisible(pendingUserPages.getPendingUserHeader(), 20);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(pendingUserPages.getPendingUserHeader().isDisplayed(),
					"Pending Users page is not verified");
			log.info("Pending Users URL is launched successfully");
			System.out.println("Pending Users URL is launched successfully");
			break;

		case "The difference between user and agent":
			Thread.sleep(5000);
			driver.get(PageURL);
			AgentArticlesPage agentArticlesPage = new AgentArticlesPage(driver);
			WaitHandler.waitForElementVisible(agentArticlesPage.getDifferenceBetweenUserAndAgentHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(agentArticlesPage.getDifferenceBetweenUserAndAgentHeader().isDisplayed(),
					"The difference between user and agent page is not verified");
			log.info("The difference between user and agent URL is launched successfully");
			System.out.println("The difference between user and agent URL is launched successfully");
			break;

		case "Registering with an-existing company or a new company":
			Thread.sleep(5000);
			driver.get(PageURL);
			AgentArticlesPage agentArticlesPage1 = new AgentArticlesPage(driver);
			WaitHandler.waitForElementVisible(
					agentArticlesPage1.getRegisteringWithAnExistingCompanyOrNewCompanyHeader(), 10);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(
					agentArticlesPage1.getRegisteringWithAnExistingCompanyOrNewCompanyHeader().isDisplayed(),
					"Registering with an-existing company or a new company page is not verified");
			log.info("Registering with an-existing company or a new company URL is launched successfully");
			System.out.println("Registering with an-existing company or a new company URL is launched successfully");
			
			break;

		case "Share Policies":
			driver.get(PageURL);
			SharePoliciesPage sharePoliciesPage = new SharePoliciesPage(driver);
			WaitHandler.waitForElementVisible(sharePoliciesPage.getSharePoliciesHeader(), 20);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(sharePoliciesPage.getSharePoliciesHeader().isDisplayed(),
					"Share Policies page is not verified");
			log.info("Share Policies URL is launched successfully");
			System.out.println("Share Policies URL is launched successfully");
			break;

		case "My Policies":
			driver.get(PageURL);
			MyPoliciesPage myPoliciesPage = new MyPoliciesPage(driver);
			WaitHandler.waitForElementVisible(myPoliciesPage.getMyPoliciesHeader(), 20);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(myPoliciesPage.getMyPoliciesHeader().isDisplayed(),
					"My Policies page is not verified");
			log.info("My Policies URL is launched successfully");
			System.out.println("My Policies URL is launched successfully");
			break;

		case "Pending Requests":
			driver.get(PageURL);
			PendingRequestsPage pendingRequestsPage = new PendingRequestsPage(driver);
			WaitHandler.waitForElementVisible(pendingRequestsPage.getPendingRequestsHeader(), 20);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(pendingRequestsPage.getPendingRequestsHeader().isDisplayed(),
					"Pending Requests page is not verified");
			log.info("Pending Requests URL is launched successfully");
			System.out.println("Pending Requests URL is launched successfully");
			break;

		case "Upgrade":
			driver.get(PageURL);
			UpgradePage upgradePage = new UpgradePage(driver);
			WaitHandler.waitForElementVisible(upgradePage.getUpgradeHeader(), 20);
			Assert.assertEquals(SeleniumMethods.getPageURL(driver), PageURL);
			Assert.assertTrue(upgradePage.getUpgradeHeader().isDisplayed(), "Upgrade page is not verified");
			log.info("Upgrade URL is launched successfully");
			System.out.println("Upgrade URL is launched successfully");

			break;
		}

	}

}
