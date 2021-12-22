package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class TestVitgerStepDefinition extends SeleniumUtility{

	String appUrl=null;
	WebDriver driver;
	 @Given("^User has a valid application URL$")
	    public void user_has_a_valid_application_url()  {
	        appUrl="https://demo.vtiger.com/vtigercrm/index.php";
	    }

	    @When("^User hits a login page url$")
	    public void user_hits_a_login_page_url()  {
	    	driver=setUp("chrome", appUrl);
	    }

	    @Then("^User should reach to login page with title \"([^\"]*)\"$")
	    public void user_should_reach_to_login_page_with_title_something(String strArg1)  {
	       Assert.assertEquals(getCurrentTitleOfApplication(), strArg1,"User not reached to login page");
	       cleanUp();
	    }
	    
	    @Given("^User has a valid application URL (.+)$")
	    public void user_has_a_valid_application_url(String appurl) {
	    	appUrl=appurl;
	    }

	    @Then("^User should remain in login page with title (.+)$")
	    public void user_should_remain_in_login_page_with_title(String pagetitle) {
	    	Assert.assertEquals(getCurrentTitleOfApplication(), pagetitle,"User not reached to "+pagetitle+"page");
		    cleanUp();
	    }

	    @And("^Enter the user name as (.+)$")
	    public void enter_the_user_name_as(String username) {
	        WebElement un=driver.findElement(By.id("username"));
	        typeInput(un, username);
	    }

	    @And("^Enter the password as (.+)$")
	    public void enter_the_password_as(String password) {
	        WebElement pwd=driver.findElement(By.id("password"));
	        typeInput(pwd, password);
	    }

	    @And("^Click on Signin button$")
	    public void click_on_signin_button() {
	    	 WebElement signInButton=driver.findElement(By.xpath("//button[text()='Sign in']"));
		       clickOnElement(signInButton);
	    }

}
