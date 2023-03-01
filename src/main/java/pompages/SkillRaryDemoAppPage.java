 package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebdriverUtility;

public class SkillRaryDemoAppPage {
	//Declaration
	@FindBy(xpath="//div[@class='navbar-header']")
	private WebElement  pageHeader;
	@FindBy(id="course")
	private WebElement  courseTab;
	@FindBy (xpath="//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement seleniumTraningLink;
	@FindBy (xpath="//select[@name='addresstype']")
	private WebElement categoryDropDown;
	@FindBy (xpath="//a[text()='contactUs']")
	private WebElement contactUsLink;
	
	
	//Initialization
	
	public SkillRaryDemoAppPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//Utilization
	
	public String  getPageHeader() {
		return pageHeader.getText();
		}
	public void mouseHoverToCourse(WebdriverUtility web) {
		web.mouseHover(courseTab);
	}
	public void clickSeleniumTraining() { 
		seleniumTraningLink.click();
	}
	public void selectCategory(WebdriverUtility web,int index) {
		web.dropdown(categoryDropDown,index);
		
	}
	public WebElement getContactUs() {
		return contactUsLink;
	}
	
	public void clickContactUs() {
		contactUsLink.click();
	}
	

}
