package CertificialAutomationPageObject.InsurerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgradePage {
public  WebDriver driver;
	
	public  UpgradePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h1[contains(.,'Choose your Plan')]")
	private WebElement upgradeHeader;
	public WebElement getUpgradeHeader()
	{
		return upgradeHeader;
	}
}
