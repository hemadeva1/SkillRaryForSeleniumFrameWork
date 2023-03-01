package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//Declaration
	@FindBy(xpath ="//img[@alt='SkillRary']")
	private WebElement logo;
	@FindBy(xpath="//a[text()='GEARS']" )
	private WebElement gearsTab;
	@FindBy(xpath="//u1[@class='dropdown-menu gear_menu']/descentdent::a[text()='SkillRary Demo App']")
	private WebElement skillraryDemoAppLink;
	@FindBy(xpath="//input[@placeholder='Search for Courses']")
	private WebElement searchTF;
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchButton;
	
	//Initialization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public WebElement getLogo() {
		return logo;
		 
		
	}
	public void  clickGears() {
		gearsTab.click();
	}
	public void clickSkillraryDemoApp() {
		skillraryDemoAppLink.click();
	}
	public void searchFor(String data) {
		searchTF.sendKeys(data);
		searchButton.click();
	}

}
