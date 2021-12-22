package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.VtigerLoginPage;

public class TestLoginPage extends SeleniumUtility{

	@Test
	public void testVtigerLogin() {
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		VtigerLoginPage getVtigerLoginPage=new VtigerLoginPage(driver);
				//or
		//VtigerLoginPage getVtigerLoginPage=PageFactory.initElements(driver, VtigerLoginPage.class);
		
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		cleanUp();
	}
}
