package CertificialAutomationPageObject.RequesterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestPolicyPage {
public  WebDriver driver;
	
	public  RequestPolicyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4[contains(.,'Pending Request for Insurance')]")
	private WebElement requestPolicyHeader;
	public WebElement getRequestPolicyHeader()
	{
		return requestPolicyHeader;
	}

}
