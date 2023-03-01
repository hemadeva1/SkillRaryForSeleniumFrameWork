package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebdriverUtility;

public class SeleniumTrainingPage {
//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageheader;
	@FindBy(id="add")
	private WebElement plusButton;
	@FindBy(xpath="//button[.=' Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@id='callout']")
	private WebElement itemAddedMessage;
	
	//Initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	//Utilization
	public String getPageHeader() {
		return pageheader.getText();
	}
	public void doubleclickPlusButton (WebdriverUtility web) {
		web.doubleClickOnElement(plusButton);
	}
	public void clickAddToCart() {
		addToCartButton.click();
	}
	public WebElement getItemAddedMessage() {
		return itemAddedMessage;
	}
}
