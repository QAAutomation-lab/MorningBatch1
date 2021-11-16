package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions3 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//enter required application url
		driver.get("https://demo.actitime.com/login.do");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* driver can wait for the element from 0-30 sec*/
		System.out.println("Page title before login: "+driver.getTitle());
		WebElement userNameInputField=driver.findElement(By.id("username"));
		//perform typing operation
		userNameInputField.sendKeys("admin");
		//identify password field
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		//perform typing operation
		passwordInputField.sendKeys("manager");
		//identify login button 
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		//perform click operation
		loginButton.click();
		Thread.sleep(2000);
		System.out.println("Page title After login: "+driver.getTitle());		
		//logout link
		WebElement logoutLink=driver.findElement(By.id("logoutLink"));
		logoutLink.click();
		//close current browser
		driver.close();		
	}
}
