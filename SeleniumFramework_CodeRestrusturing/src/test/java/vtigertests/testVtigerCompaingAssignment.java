package vtigertests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class testVtigerCompaingAssignment extends SeleniumUtility {
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
	public void testAddCompaings() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),' Campaigns')]")));

		clickOnElement(driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")));

		typeInput(driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")),properties.getProperty("campaignName"));

		clickOnElement(driver.findElement(By.xpath("//b[@role='presentation']")));
		clickOnElement(driver.findElement(By.xpath("//div[text()='Support Group']")));

		clickOnElement(driver.findElement(By.xpath("//input[@name='closingdate']")));
		clickOnElement(driver.findElement(By.xpath("//td[text()='25']")));

		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));

		clickOnElement(driver.findElement(By.xpath("//h4[contains(text(),' Campaigns ')]")));
		setSleepTime(1000);
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//a[text()='Testing']"))));
	}

	@Test(priority = 1, dependsOnMethods = "testAddCompaings")
	public void testEditCompaings() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),' Campaigns')]")));

		clickOnElement(driver.findElement(By.xpath("//span[@class='dropdown-toggle']")));
		clickOnElement(driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[2]/a[1]")));

		clickOnElement(driver.findElement(By.id("select2-chosen-4")));
		clickOnElement(driver.findElement(By.xpath("//ul[@class='select2-results']/li[3]/div")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		setSleepTime(1000);
		Assert.assertTrue(isElementExist(driver.findElement(By.xpath("//tbody[@class='overflow-y']/tr/td[4]//span[text()=' Active ']"))
				));
	}

	@Test(priority = 2, dependsOnMethods = "testEditCompaings")
	public void testDeleteCompaings() {
		boolean flag = false;
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]")));
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(),' Campaigns')]")));

		clickOnElement(driver.findElement(By.xpath("//span[@class='dropdown-toggle']")));
		clickOnElement(driver.findElement(By.xpath("//body/div[@id='page']/ul[3]/li[3]/a[1]")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
		setSleepTime(1000);
		try {
			
			isElementExist(driver.findElement(By.xpath("//a[text()='Testing']")));
			flag = true;
		} catch (NoSuchElementException e) {
		}
		if (flag) {
			flag = false;
			throw new RuntimeException("Compaing not deleted or other comapaing with same name may be there..");
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