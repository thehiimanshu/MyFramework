package CertificialAutomationPageObject.AgentPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentArticlesPage {
public  WebDriver driver;
	
	public  AgentArticlesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h1[contains(.,'The difference between \"User\" and \"Agent\".')]")
	private WebElement differenceBetweenUserAndAgentHeader;
	public WebElement getDifferenceBetweenUserAndAgentHeader()
	{
		return differenceBetweenUserAndAgentHeader;
	}
	
	
	
	@FindBy(xpath="//h1[contains(.,'Registering with an \"Existing Company\" or a \"New Company\"')]")
	private WebElement registeringWithAnExistingCompanyOrNewCompanyHeader;
	public WebElement getRegisteringWithAnExistingCompanyOrNewCompanyHeader()
	{
		return registeringWithAnExistingCompanyOrNewCompanyHeader;
	}
}
