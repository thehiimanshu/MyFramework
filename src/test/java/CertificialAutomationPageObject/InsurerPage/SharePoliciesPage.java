package CertificialAutomationPageObject.InsurerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SharePoliciesPage {
public  WebDriver driver;
	
	public  SharePoliciesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4[contains(.,'Policy Shares')]")
	private WebElement sharePoliciesHeader;
	public WebElement getSharePoliciesHeader()
	{
		return sharePoliciesHeader;
	}
}
