package vtigertests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class testVtigerContactsAssignment extends SeleniumUtility {
	WebDriver driver;

	@BeforeMethod
	public void openBrowserAndUrl() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userNameField = driver.findElement(By.cssSelector("input#username"));
		typeInput(userNameField, properties.getProperty("username"));

		WebElement passwordField = driver.findElement(By.cssSelector("input#password"));
		typeInput(passwordField, properties.getProperty("password"));
		
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
	}

	@Test(priority = 0)
	public void testAddContact() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(
				By.xpath("//a[@title='Contacts' and @href='index.php?module=Contacts&view=List&app=MARKETING']")));

		clickOnElement(driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")));

		clickOnElement(driver.findElement(By.xpath("//span[text()='None']")));
		clickOnElement(driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[5]")));
		typeInput(driver.findElement(By.id("Contacts_editView_fieldName_firstname")),properties.getProperty("contachFirstName"));
		typeInput(driver.findElement(By.id("Contacts_editView_fieldName_lastname")), properties.getProperty("contactLastName"));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));

		clickOnElement(driver.findElement(By.xpath("//h4[contains(text(),'Contacts')]")));
		setSleepTime(1000);
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//a[contains(text(),'Salman')]"))));
	}

	@Test(priority = 1, dependsOnMethods = "testAddContact")
	public void testEditContact() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(
				By.xpath("//a[@title='Contacts' and @href='index.php?module=Contacts&view=List&app=MARKETING']")));

		clickOnElement(driver.findElement(By.xpath("//a[text()='Salman']")));
		clickOnElement(driver.findElement(By.id("Contacts_detailView_basicAction_LBL_EDIT")));

		typeInput(driver.findElement(By.id("Contacts_editView_fieldName_title")), properties.getProperty("contactTitle"));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		clickOnElement(driver.findElement(By.xpath("//h4[contains(text(),'Contacts')]")));
		setSleepTime(1000);
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//span[contains(text(),'Automation Tester')]"))));
	}

	@Test(priority = 2, dependsOnMethods = "testEditContact")
	public void testDeleteContact() {
		boolean flag = false;
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(
				By.xpath("//a[@title='Contacts' and @href='index.php?module=Contacts&view=List&app=MARKETING']")));

		clickOnElement(driver.findElement(By.xpath("//a[text()='Salman']")));
		clickOnElement(driver
				.findElement(By.xpath("//div[@class='btn-group']//button[@class='btn btn-default dropdown-toggle']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Delete Contact']")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
		setSleepTime(1000);
		try {
			isElementExist(driver.findElement(By.xpath("//a[contains(text(),'Salman')]")));
			flag = true;
		} catch (NoSuchElementException e) {
		}
		if (flag) {
			flag = false;
			throw new RuntimeException("Contact not deleted or other contact with same name may be there..");
		}
	}

	@AfterMethod
	public void logoutAndCloseBrowser() {
		clickOnElement(driver.findElement(By.xpath("//img[@src='test/logo/vtiger-crm-logo.png']")));
		clickOnElement(driver.findElement(By.xpath("//span[@class='fa fa-user']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Sign Out']")));
		cleanUp();
	}
}
