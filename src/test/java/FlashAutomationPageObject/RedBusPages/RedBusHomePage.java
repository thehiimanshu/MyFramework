package FlashAutomationPageObject.RedBusPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusHomePage {

	
    public  WebDriver driver;
	
	public  RedBusHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='redbus-logo home-redirect']")
	private WebElement redBusLogo;
	public WebElement getCertificialLogo()
	{
		return redBusLogo;
	}
	
	
	@FindBy(xpath="//input[@data-message='Please enter a source city']")
	private WebElement fromCityInputbox;
	public WebElement getFromCityInputbox()
	{
		return fromCityInputbox;
	}
	
	@FindBy(xpath="//ul[@class='autoFill homeSearch']/li[1]")
	private WebElement cityAutoSuggest;
	public WebElement getCityAutoSuggest()
	{
		return cityAutoSuggest;
	}
	
	
	@FindBy(xpath="//input[@data-message='Please enter a destination city']")
	private WebElement toCityInputbox;
	public WebElement getToCityInputbox()
	{
		return toCityInputbox;
	}
	
	
	@FindBy(xpath="//input[@id='onward_cal']")
	private WebElement calenderField;
	public WebElement getCalenderField()
	{
		return calenderField;
	}
	
	
	@FindBy(xpath="//td[@class='monthTitle']")
	private WebElement calenderMonthTitle;
	public WebElement getCalenderMonthTitle()
	{
		return calenderMonthTitle;
	}
	
	
	@FindBy(xpath="//td[@class='next']")
	private WebElement nextMonthArrow;
	public WebElement getNextMonthArrow()
	{
		return nextMonthArrow;
	}
	

	@FindBy(xpath="//button[@id='search_btn']")
	private WebElement searchButton;
	public WebElement getSearchButton()
	{
		return searchButton;
	}
	
	
	public List<WebElement> getbookingDateList() {
		return  driver.findElements(
				By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
	}
}
