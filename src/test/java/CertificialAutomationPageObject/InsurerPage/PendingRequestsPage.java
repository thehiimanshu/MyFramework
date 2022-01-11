package CertificialAutomationPageObject.InsurerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingRequestsPage {
public  WebDriver driver;
	
	public  PendingRequestsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4[contains(.,'Pending Requests & Insurance Requirements')]")
	private WebElement pendingRequestsHeader;
	public WebElement getPendingRequestsHeader()
	{
		return pendingRequestsHeader;
	}
}
