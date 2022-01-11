package CertificialAutomationPageObject.AgentPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenRequestsPage {
public  WebDriver driver;
	
	public  OpenRequestsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

		
	@FindBy(xpath="//li[contains(.,'Open Requests')]")
	private WebElement openRequestsTab;
	public WebElement getOpenRequestsTab()
	{
		return openRequestsTab;
	}
	
	
	@FindBy(xpath="//h4[contains(.,'Open Requests & Insurance Requirements')]")
	private WebElement openRequestsHeader;
	public WebElement getOpenRequestsHeader()
	{
		return openRequestsHeader;
	}
	
	@FindBy(xpath = "//i[@class='anticon anticon-cloud-upload']/parent::button")
	private WebElement certificateUploadButton;
	public WebElement getCertificateUploadButton() {
		return certificateUploadButton;
	}
	
	@FindBy(xpath = "//i[@class='anticon anticon-paper-clip']/parent::button")
	private WebElement allAttachmentsButton;
	public WebElement getAllAttachmentsButton() {
		return allAttachmentsButton;
	}
	
	
	@FindBy(xpath="//i[@class='anticon anticon-check']/parent::button | //button[@class='ant-btn action-button success-button  ant-btn-primary ant-btn-circle-outline ant-btn-icon-only']")
	private WebElement respondToRequestButton;
	public WebElement getRespondToRequestButton()
	{
		return respondToRequestButton;
	}
	
	@FindBy(xpath="//i[@class='anticon anticon-close']/parent::button")
	private WebElement denyRequestButton;
	public WebElement getDenyRequestButton()
	{
		return denyRequestButton;
	}
	
	
	@FindBy(xpath="//div[@class='ant-drawer-header']/div[contains(.,'Respond to policy request')]")
	private WebElement respondToRequestPolicySidebarHeader;
	public WebElement getRespondToRequestPolicySidebarHeader()
	{
		return respondToRequestPolicySidebarHeader;
	}

	
	public WebElement getRespondPolicySelectionStatus(String responseStep)
	{
	    return driver.findElement(By.xpath("//div[@class='ant-steps-item-title' and contains(.,'"+responseStep+"')]/parent::div/parent::div/parent::div")); 
	}
	
	
	
	@FindBy(xpath="//span[contains(.,'Next')]/parent::button")
	private WebElement respondToRequestNextButton;
	public WebElement getRespondToRequestNextButton()
	{
		return respondToRequestNextButton;
	}

}
