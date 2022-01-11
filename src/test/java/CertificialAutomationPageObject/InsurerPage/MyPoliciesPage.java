package CertificialAutomationPageObject.InsurerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPoliciesPage {
public  WebDriver driver;
	
	public  MyPoliciesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4/span[contains(.,'My Policies')]")
	private WebElement myPoliciesHeader;
	public WebElement getMyPoliciesHeader()
	{
		return myPoliciesHeader;
	}
}
