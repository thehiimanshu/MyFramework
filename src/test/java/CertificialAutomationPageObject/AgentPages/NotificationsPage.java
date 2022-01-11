package CertificialAutomationPageObject.AgentPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationsPage {
public  WebDriver driver;
	
	public  NotificationsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h4[contains(.,'Notifications')]")
	private WebElement notificationsHeader;
	public WebElement getNotificationsHeader()
	{
		return notificationsHeader;
	}
}
