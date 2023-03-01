package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(xpath="//img[@id='java']")
	private WebElement javaImage;
	@FindBy(xpath="//div[@id='cart Area']")
	private WebElement myCartArea;
	@FindBy(xpath="//footer/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public WebElement getJavaImage() {
		return javaImage;
	}
	public WebElement getMyCartArea() {
		return myCartArea;
		
	}
	public WebElement getFacbookIcon() {
		return facebookIcon;
	}
	public void clickFacebookIcon() {
		facebookIcon.click();
	}
	

}
