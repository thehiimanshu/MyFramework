package FlashAutomationPageObject.RedBusPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusBusSearchPage {

	
    public  WebDriver driver;
	
	public  RedBusBusSearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[@class='src']")
	private WebElement sourceCity;
	public WebElement getSourceCity()
	{
		return sourceCity;
	}
	
	@FindBy(xpath="//span[@class='dst']")
	private WebElement destinationCity;
	public WebElement getDestinationCity()
	{
		return destinationCity;
	}
	
	@FindBy(xpath="//span[@class='dst']")
	private WebElement busTable;
	public WebElement getBusTable()
	{
		return busTable;
	}
}
