package day1seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
		String chromeDriverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		// Step2: Create an instance of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		//enter application URL
		driver.get("https://demo.actitime.com/login.do");
		
		/**
		 * findElement(By): is used to identify element from the Web page it takes 'By'class as an argument
		 * and return WebElement
		 * By: 'By' class is a predefined selenium class which has several static method in it, those static methods
		 * are known as locators in selenium
		 * locators support by Selenium:
		 * 	1.id(String) 2.name(String) 3.className(String) 4.tagName(String) 5.linkText(String) 6.partialLinkText(String)
		 *  7.cssSelector(String) 8.xpath(String)
		 *  
		 * driver.findElement(By)
		 * 
		 * Action:
		 * 		1. typing: sendKeys("")
		 * 		2. click:  click();
		 * 		3. deleting existing text: clear()
		 * 
		 * Note: if the given locator is not unique dn selenium will not throw any error message but i will always performs
		 *  operation on the first element
		 */
		System.out.println("Current page title is : "+driver.getTitle());
		System.out.println("Current page url is : "+driver.getCurrentUrl());
		//enter username: 1st Identify username field and dn perform required action(typing)
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		//enter password: 1st Identify password field and dn perform required action(typing)
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		//click on login button: 1st Identify login button and dn perform required action(typing)
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.close();
	}

}
