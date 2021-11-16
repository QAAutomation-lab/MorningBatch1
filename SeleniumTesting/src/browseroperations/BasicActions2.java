package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//enter required application url
		driver.get("https://demosite.executeautomation.com/Login.html");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* driver can wait for the element from 0-30 sec*/
		WebElement userNameInputField=driver.findElement(By.name("UserName"));
		//perform typing operation
		userNameInputField.sendKeys("execution");
		//identify password field
		WebElement passwordInputField=driver.findElement(By.name("Password"));
		//perform typing operation
		passwordInputField.sendKeys("admin");
		//identify login button 
		WebElement loginButton=driver.findElement(By.cssSelector("input[value='Login']"));
		//perform click operation
		loginButton.click();
		//explicit wait
		//Thread.sleep(2000);
		//logout link
		WebElement logoutLink=driver.findElement(By.cssSelector("a[href='Login.html']"));
		logoutLink.click();
		//close current browser
		driver.close();		
	}
}
