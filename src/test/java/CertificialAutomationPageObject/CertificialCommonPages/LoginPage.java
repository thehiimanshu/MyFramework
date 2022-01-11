package CertificialAutomationPageObject.CertificialCommonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public  WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//img[@src='/static/media/certificial-logo-white-final.18958aa0.png']")
	private WebElement certificialLogo;
	public WebElement getCertificialLogo()
	{
		return certificialLogo;
	}
	
	
	@FindBy(xpath="//h1[contains(.,'Sign In')]")
	private WebElement textSignIn;
	public WebElement getTextSignIn()
	{
		return textSignIn;
	}
	
	
	
	@FindBy(xpath="//label[@title='Email']")
	private WebElement emailLabel;
	public WebElement getEmailLabel()
	{
		return emailLabel;
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement emailTextBox;
	public WebElement getEmailTextBox()
	{
		return emailTextBox;
	}
	
	
	@FindBy(xpath="//label[@title='Password']")
	private WebElement passwordLabel;
	public WebElement getPasswordLabel()
	{
		return passwordLabel;
	}
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordTextBox;
	public WebElement getPasswordTextBox()
	{
		return passwordTextBox;
	}
	
	
	@FindBy(xpath="//a[contains(.,'Forgot password?')]")
	private WebElement linkForgotPassword;
	public WebElement getLinkForgotPassword()
	{
		return linkForgotPassword;
	}
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	
	@FindBy(xpath="//span[contains(.,'User')]/parent::button")
	private WebElement userButton;
	public WebElement getUserButton()
	{
		return userButton;
	}
	
	
	@FindBy(xpath="//span[contains(.,'Agent')]/parent::button")
	private WebElement agentButton;
	public WebElement getAgentButton()
	{
		return agentButton;
	}
	
	
	
}
