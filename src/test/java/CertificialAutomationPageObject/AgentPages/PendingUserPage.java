package CertificialAutomationPageObject.AgentPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingUserPage {
public  WebDriver driver;
	
	public  PendingUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4[contains(.,'My Pending Users')]")
	private WebElement pendingUserHeader;
	public WebElement getPendingUserHeader()
	{
		return pendingUserHeader;
	}
}
