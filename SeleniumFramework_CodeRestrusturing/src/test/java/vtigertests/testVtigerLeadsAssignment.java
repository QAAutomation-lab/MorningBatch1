package vtigertests;

import org.jsoup.safety.Cleaner;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class testVtigerLeadsAssignment extends SeleniumUtility {
	WebDriver driver;
	/**
	 * Pre-requisite:
	 * Open browser, enter require app url and enter credentials 
	 */
	@BeforeTest
	public void openBrowserAndUrl() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		typeInput(driver.findElement(By.cssSelector("input#username")), properties.getProperty("username"));
		typeInput(driver.findElement(By.cssSelector("input#password")), properties.getProperty("password"));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
	}

	@Test(priority = 0)
	public void testAddLead() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(
				By.xpath("//a[@title='Leads']")));
		clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		clickOnElement(driver.findElement(By.xpath("//span[text()='None']")));
		clickOnElement(driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]")));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_firstname")),
				properties.getProperty("leadFirstName"));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_lastname")),
				properties.getProperty("leadLastName"));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_phone")), properties.getProperty("leadContactNumber"));
		clickOnElement(driver.findElement(By.id("select2-chosen-12")));
		clickOnElement(driver.findElement(By.xpath("//div[text()='Support Group']")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickOnElement(driver.findElement(By.xpath("//h4[contains(text(),'Leads')]")));
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//a[contains(text(),'Rakesh')]"))));
	}
	/**
	 * 
	 */
	@Test(priority = 1, dependsOnMethods = "testAddLead")
	public void testEditLead() {		
		clickOnElement(driver.findElement(By.xpath("//tr[td[span[span[contains(text(),'"+properties.getProperty("leadContactNumber")+"')]]]]/td[1]//span[@class='more dropdown action']")));		
		clickOnElement(driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[2]/a[1]")));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_company")),
				properties.getProperty("leadCompanyName"));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//span[contains(text(),'Testing')]"))));
	}

	@Test(priority = 2, dependsOnMethods = "testEditLead")
	public void testDeleteLead() {
		clickOnElement(driver.findElement(By.xpath("//tr[td[span[span[contains(text(),'"+properties.getProperty("leadContactNumber")+"')]]]]/td[1]//span[@class='more dropdown action']")));
		clickOnElement(driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[3]/a[1]")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//a[contains(text(),'"+properties.getProperty("leadFirstName")+"')]"))),"Lead not deleted or other lead with same name may be there..");
	}

	@AfterTest
	public void logoutAndCloseBrowser() {
		clickOnElement(driver.findElement(By.xpath("//img[@src='test/logo/vtiger-crm-logo.png']")));
		clickOnElement(driver.findElement(By.xpath("//span[@class='fa fa-user']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Sign Out']")));
		cleanUp();
	}
}
