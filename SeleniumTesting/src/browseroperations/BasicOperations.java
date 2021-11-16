package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// creating an object of chromedriver class and upcasting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// set window size based on our requirement
		driver.manage().window().setSize(new Dimension(500, 700));
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
		// enter required application url
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// get the web page title
		System.out.println("Current Page title is: " + driver.getTitle());
		// get current web page url
		System.out.println("Current page url: " + driver.getCurrentUrl());
		// get page source code
		// System.out.println("Current web page source code: "+driver.getPageSource());

		//click on Forgot your password?
//		WebElement forgotLink=driver.findElement(By.linkText("Forgot your password?"));
//		forgotLink.click();
					//or
		driver.findElement(By.linkText("Forgot your password?")).click();
		//Navigation in browser
		Thread.sleep(2000);
		//go to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		// next page
		driver.navigate().forward();
		Thread.sleep(2000);
		//reload or refresh current page
		driver.navigate().refresh();
		Thread.sleep(2000);
		//jump from current page to another page or URL
		driver.navigate().to("https://www.amazon.in/");
		// close current instance of browser
		//driver.close();
	}

}
