package CertificialAutomationPageObject.RequesterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequesterMyProfilePage {
	
public  WebDriver driver;
	
	public  RequesterMyProfilePage(WebDriver driver) {
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
