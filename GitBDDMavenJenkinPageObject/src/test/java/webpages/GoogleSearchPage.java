package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	By serachName=By.name("q");
	
	public void searchText(String textToBeSearched) {
		driver.findElement(serachName).sendKeys(textToBeSearched,Keys.ENTER);
	}
}
