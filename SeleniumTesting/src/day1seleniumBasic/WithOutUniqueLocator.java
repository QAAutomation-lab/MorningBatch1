package day1seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutUniqueLocator {

	public static void main(String[] args) {
		String chromeDriverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		// Step2: Create an instance of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		//enter application URL
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstNameInputField=driver.findElement(By.tagName("input"));
		firstNameInputField.sendKeys("Shailesh");
		//lastname will be types in first name field as selenium is not able to identify it uniquely 
		WebElement lastNameInputField=driver.findElement(By.tagName("input"));
		lastNameInputField.sendKeys("Kumar");
	}

}
