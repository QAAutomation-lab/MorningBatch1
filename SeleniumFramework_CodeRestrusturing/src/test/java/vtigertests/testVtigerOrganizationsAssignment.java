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

public class testVtigerOrganizationsAssignment extends SeleniumUtility {
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
	public void testAddOrganization() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(
				By.xpath("//a[@title='Organizations' and @href='index.php?module=Accounts&view=List&app=MARKETING']"))
				);
		clickOnElement(driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")));

		typeInput(driver.findElement(By.id("Accounts_editView_fieldName_accountname")),properties.getProperty("orgName"));
		clickOnElement(driver.findElement(By.xpath("//td[@class='fieldValue']/div[@id='s2id_autogen7']")));
		clickOnElement(driver.findElement(By.xpath("//div[text()='Marketing Group']")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));

		clickOnElement(driver.findElement(By.xpath("//h4[contains(text(),'Organizations')]")));
		setSleepTime(1000);
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//a[contains(text(),'INSPIROY')]"))));
	}

	@Test(priority = 1, dependsOnMethods = "testAddOrganization")
	public void testEditOrganization() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(
				By.xpath("//a[@title='Organizations' and @href='index.php?module=Accounts&view=List&app=MARKETING']"))
				);
		clickOnElement(driver.findElement(By.xpath("//a[text()='INSPIROY']")));
		clickOnElement(driver.findElement(By.id("Accounts_detailView_basicAction_LBL_EDIT")));
		typeInput(driver.findElement(By.id("Accounts_editView_fieldName_bill_city")),properties.getProperty("orgCity"));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));

		clickOnElement(driver.findElement(By.xpath("//h4[contains(text(),'Organizations')]")));
		setSleepTime(1000);
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//span[contains(text(),'Pune')]"))));
	}

	@Test(priority = 2, dependsOnMethods = "testEditOrganization")
	public void testDeleteContact() {
		boolean flag = false;
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(
				By.xpath("//a[@title='Organizations' and @href='index.php?module=Accounts&view=List&app=MARKETING']"))
				);
		clickOnElement(driver.findElement(By.xpath("//a[text()='INSPIROY']")));
		clickOnElement(driver.findElement(By.xpath("//div[@class='btn-group']//button[@class='btn btn-default dropdown-toggle']"))
				);
		clickOnElement(driver.findElement(By.xpath("//a[text()='Delete Organization']")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
		setSleepTime(1000);
		try {
			isElementExist(driver.findElement(By.xpath("//a[contains(text(),'INSPIROY')]")));
			flag = true;
		} catch (NoSuchElementException e) {
		}
		if (flag) {
			flag = false;
			throw new RuntimeException("Organization not deleted or other organization with same name may be there..");
		}
	}

	@AfterMethod
	public void logoutAndCloseBrowser() {
		clickOnElement(driver.findElement(By.xpath("//img[@src='test/logo/vtiger-crm-logo.png']")));
		clickOnElement(driver.findElement(By.xpath("//span[@class='fa fa-user']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Sign Out']")));
		driver.close();
	}
}
