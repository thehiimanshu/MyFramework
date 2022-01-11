package CertificialAutomationPageObject.RequesterPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TemplatesPage {
public  WebDriver driver;
	
	public  TemplatesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4[contains(.,'Policy Templates')]")
	private WebElement templatesHeader;
	public WebElement getTemplatesHeaderHeader()
	{
		return templatesHeader;
	}

}
