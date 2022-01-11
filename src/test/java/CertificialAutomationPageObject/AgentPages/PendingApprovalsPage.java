package CertificialAutomationPageObject.AgentPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingApprovalsPage {
public  WebDriver driver;
	
	public  PendingApprovalsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//li[contains(.,'Pending Approvals')]")
	private WebElement pendingApprovalsTab;
	public WebElement getPendingApprovalsTab()
	{
		return pendingApprovalsTab;
	}
	
	
	@FindBy(xpath="//h4[contains(.,'Pending Approvals')]")
	private WebElement pendingApprovalsHeader;
	public WebElement getPendingApprovalsHeader()
	{
		return pendingApprovalsHeader;
	}
	
	
	@FindBy(xpath="//*[@class='anticon anticon-share-alt']/parent::span")
	private WebElement policySharesTab;
	public WebElement getPolicySharesTab()
	{
		return policySharesTab;
	}
	
	
	@FindBy(xpath="//*[@class='ant-layout-header']/h4")
	private WebElement policySharesHeader;
	public WebElement getPolicySharesHeader()
	{
		return policySharesHeader;
	}
	
	
	@FindBy(xpath="//*[@class='anticon anticon-issues-close']/parent::span")
	private WebElement policyRequestsTab;
	public WebElement getPolicyRequestsTab()
	{
		return policyRequestsTab;
	}
	
	

	@FindBy(xpath="//*[@class='anticon anticon-check-circle']/parent::span")
	private WebElement policyVerificationTab;
	public WebElement getPolicyVerificationTab()
	{
		return policyVerificationTab;
	}
	
	
	@FindBy(xpath="//*[@class='ant-layout-header']/span/div/div[@class='ant-col ant-col-24']")
	private WebElement clientsHeader;
	public WebElement getclientsHeader()
	{
		return clientsHeader;
	}
}
