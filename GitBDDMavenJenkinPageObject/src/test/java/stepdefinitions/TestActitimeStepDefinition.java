package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestActitimeStepDefinition {
	static WebDriver driver;
	String username,password;
	  @Given("^User is already haveing application URL$")
	    public void user_is_already_haveing_application_url(){
		  WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
	    }

	    @When("^user enter the username and password$")
	    public void user_enter_the_username_and_password(){
	      driver.findElement(By.name("username")).sendKeys(username);
	      driver.findElement(By.name("pwd")).sendKeys(password);
	    }

	    @Then("^Actitime home page will be displayed$")
	    public void actitime_home_page_will_be_displayed() throws InterruptedException{
	    	Thread.sleep(2000);
	      assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track", "Either login is not successful or page not loaded");
	    }

	    @And("^also having username and password$")
	    public void also_having_username_and_password(){
	    	 //will be read from property file
	    	username="admin";
	    	password="manager";
	    }

	    @And("^clicks on login button$")
	    public void clicks_on_login_button(){
	       driver.findElement(By.id("loginButton")).click();
	    }
	    
	    @And("^close the browser$")
	    public void close_the_browser() {
	    	driver.close();
	    }
	    @Given("^User is already having application URL as (.+)$")
	    public void user_is_already_having_application_url_as(String url)  {
	    	WebDriverManager.chromedriver().setup();
		      driver=new ChromeDriver();
			  driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get(url);
	    }

	    @And("^also having username as (.+) and password as (.+) for the application$")
	    public void also_having_username_as_and_password_as_for_the_application(String username, String password){
	    	this.username=username;
	    	this.password=password;
	    }
	    @Then("^Actitime home page will be displayed with the application title as (.+)$")
	    public void actitime_home_page_will_be_displayed_with_the_application_title_as(String title) throws InterruptedException {
	    	Thread.sleep(2000);
		      assertEquals(driver.getTitle(), title, "Either login is not successful or page not loaded");
	    }


}
