package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;


public class FirstTest extends BaseClass {
@Test

public void firstTest() {
	SoftAssert soft = new SoftAssert();
	
    home.clickGears();
	home.clickSkillraryDemoApp();
	web.switchToChildBrowser();
	
	soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerce");
	demoApp.mouseHoverToCourse(web);
	demoApp.clickSeleniumTraining();
	
	soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
	selenium.doubleclickPlusButton(web);
	selenium.clickAddToCart();
	web.handleAlert();
	
	soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
	soft.assertAll();
	
	
}
}
