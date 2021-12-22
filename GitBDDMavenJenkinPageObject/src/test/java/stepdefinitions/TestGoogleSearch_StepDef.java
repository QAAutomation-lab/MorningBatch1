package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import webpages.GoogleSearchPage;

public class TestGoogleSearch_StepDef {

	static WebDriver driver;
	GoogleSearchPage getGoogleSearchPage;
	  @Given("^User is already in Google search page$")
	    public void user_is_already_in_google_search_page() {
	      WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://google.com");	
			getGoogleSearchPage=new GoogleSearchPage(driver);
	    }

	    @When("user types {string} in search input field and clicks on search button")
	    public void user_types_selenium_interview_questions_in_search_input_field(String name) {
	      // driver.findElement(By.name("q")).sendKeys(name,Keys.ENTER);
	    	getGoogleSearchPage.searchText(name);
	    }

	    @Then("user gets search result page with the title {string}")
	    public void user_gets_search_result_page_with_the_title_(String title) {
	       System.out.println(driver.getTitle());
	       System.out.println("EX: "+title);
	    }
	    
	    @When("^user types (.+) in search input field, clicks on search button$")
	    public void user_types_in_search_input_field_clicks_on_search_button(String texttobesearched) {
	    	//driver.findElement(By.name("q")).sendKeys(texttobesearched,Keys.ENTER);
	    	getGoogleSearchPage.searchText(texttobesearched);
	    }
	    @And("^close the opened browser$")
	    public void close_the_opened_browser() {
	    	driver.close();
	    }

	    @Then("^user reached to search result page with the title (.+)$")
	    public void user_reached_to_search_result_page_with_the_title(String expectedtitle){
	    	 System.out.println(driver.getTitle());
		       System.out.println("EX: "+expectedtitle);
		    }

}
