package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

@Test
public class ThirdTest extends BaseClass {
	public void ThirdTest() {
	SoftAssert soft = new SoftAssert();
	 
	home.searchFor("core java ffor selenium");
	soft.assertEquals(coreJava.getPageHeader(),"CORE JAVA FOR SELENIUM");
	
	corejava.clickCoreJavaForSeleniumLink();
	soft.assertAll(javaVideo.getPageHeader);
	|"Core Java For Selenium Traning");
	javaVideo.clickCloseCookies();
	web.SwitchToFrame();
	javaVideo.clickPlayButton();
	Thread.sleep(2000);
	javaVideo.clickPauseButton();
	
	web.switchBackFromFrame();
	
	javaVideo.clickAddToWishList();
	
	soft.assertAll()
	
}
