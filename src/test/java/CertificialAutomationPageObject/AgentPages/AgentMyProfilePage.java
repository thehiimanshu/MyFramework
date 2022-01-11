package CertificialAutomationPageObject.AgentPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentMyProfilePage {
public  WebDriver driver;
	
	public  AgentMyProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4[contains(.,'My Profile')]")
	private WebElement myProfileHeader;
	public WebElement getMyProfileHeader()
	{
		return myProfileHeader;
	}
}
