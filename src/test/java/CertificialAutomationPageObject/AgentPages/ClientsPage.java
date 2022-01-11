package CertificialAutomationPageObject.AgentPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsPage {
public  WebDriver driver;
	
	public  ClientsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4[contains(.,'Client Policies')]")
	private WebElement clientPoliciesHeader;
	public WebElement getClientPoliciesHeader()
	{
		return clientPoliciesHeader;
	}
	
	public List<WebElement> getReceiveARequestForInsurancePopUpHeader() {
		return  driver.findElements(
				By.xpath("//p/strong[text()='Receive a Request for Insurance or DIV?']"));
	}

	
	@FindBy(xpath = "//button[text()='Skip']")
	private WebElement skipButtonwelcomeToCertificialPopUp;
	public WebElement getSkipButtonwelcomeToCertificialPopUp() {
		return skipButtonwelcomeToCertificialPopUp;
	}
	
	
	public WebElement getClientName(String clientName) {
		return driver.findElement(
				By.xpath("//div[@class='ant-list-item-meta-avatar']/following-sibling::div/h4[@class='ant-list-item-meta-title']/span/h4[contains(.,'" + clientName + "')]"));

	}
	
	@FindBy(xpath="//div[@class='policy-sub-title']/h4")
	private WebElement policiesStatus;
	public WebElement getPoliciesStatus()
	{
		return policiesStatus;
	}
	
	@FindBy(xpath = "//button/span[contains(.,'I')]/parent::button")
	private WebElement issueCOIButton;
	public WebElement getIssueCOIButton() {
		return issueCOIButton;
	}
	
	@FindBy(xpath = "//div[@class='ant-drawer-header']/div[contains(.,'Issue COI')]")
	private WebElement issueCOISideBarheader;
	public WebElement getIssueCOISideBarheader() {
		return issueCOISideBarheader;
	}
	
	@FindBy(xpath = "//i[@class='anticon anticon-eye']/parent::button")
	private WebElement previewAndDownloadCOIButton;
	public WebElement getPreviewAndDownloadCOIButton() {
		return previewAndDownloadCOIButton;
	}
	
	@FindBy(xpath = "//span[contains(.,'Manage Shares')]/parent::button")
	private WebElement manageSharesButton;
	public WebElement getManageSharesButton() {
		return manageSharesButton;
	}
	
	
	@FindBy(xpath = "//span[contains(.,'Add New Policy')]/parent::button")
	private WebElement addNewPolicyButton;
	public WebElement getAddNewPolicyButton() {
		return addNewPolicyButton;
	}
	
	
	@FindBy(xpath = "//div[@class='ant-drawer-title' and contains(.,'Add New Policy')]")
	private WebElement addNewPolicySidebarHeader;
	public WebElement getAddNewPolicySidebarHeader() {
		return addNewPolicySidebarHeader;
	}
	
	
	@FindBy(xpath = "//span[text()='Policies by Status']")
	private WebElement policiesByStatus;
	public WebElement getPoliciesByStatus() {
		return policiesByStatus;
	}
	
	
	@FindBy(xpath = "//span/h4[@class='ant-typography']")
	private WebElement clientNameAsManageSharesHeader;
	public WebElement getClientNameAsManageSharesHeader() {
		return clientNameAsManageSharesHeader;
	}

	
	public List<WebElement> getSharedCompanyNameList() {
		List<WebElement> companiesNamesList = driver.findElements(By.xpath(
				"//div[@class='ant-list-item-meta-avatar']/following-sibling::div/h4[@class='ant-list-item-meta-title']/div/h4"));
		return companiesNamesList;
	}
	
	
	@FindBy(xpath = "//span[contains(.,'Back')]/parent::button")
	private WebElement backButton;
	public WebElement getBackButton() {
		return backButton;
	}
	
	
	@FindBy(xpath = "//i[@class='anticon anticon-file-protect']/parent::button")
	private WebElement generateAndDownloadCOIButtonManageShares;
	public WebElement getGenerateAndDownloadCOIButtonManageShares() {
		return generateAndDownloadCOIButtonManageShares;
	}
	
	@FindBy(xpath = "//i[@class='anticon anticon-paper-clip']/parent::button")
	private WebElement allAttachmentsButtonManageShares;
	public WebElement getAllAttachmentsButtonManageShares() {
		return allAttachmentsButtonManageShares;
	}
	
	
	@FindBy(xpath = "//i[@class='anticon anticon-history']/parent::button")
	private WebElement downloadCompanyHistoryButtonManageShares;
	public WebElement getDownloadCompanyHistoryButtonManageSharess() {
		return downloadCompanyHistoryButtonManageShares;
	}
	
	
	
	public void handleReceiveARequestForInsurancePopUp()
    {
	 try{ 
    int ispresent = getReceiveARequestForInsurancePopUpHeader().size();		 
	 if(ispresent>0){
	 getSkipButtonwelcomeToCertificialPopUp().click();
	 Thread.sleep(5000);
	 } }
	 catch(Exception e) {e.printStackTrace();}
    }
	
	

}
