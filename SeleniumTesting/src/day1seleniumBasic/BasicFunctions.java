package day1seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicFunctions {

	public static void main(String[] args) {
		
		//Step1: set path for driver executables
		System.setProperty("webdriver.chrome.driver", "F:\\NewWorkspace\\SeleniumTesting\\executables\\chromedriver.exe");
								//or
//		String chromeDriverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//Step2: Create an instance of ChromeDriver class
		WebDriver driver=new ChromeDriver();
		//enter required URL in the browser
		driver.get("http://www.google.com");
		//page title
		String pageTitle=driver.getTitle();
		System.out.println("Page title is : "+pageTitle);
		System.out.println(driver.getTitle());
		//current page url
		System.out.println("Current page URL: "+driver.getCurrentUrl());
		//page source
		System.out.println("Current page source code: "+driver.getPageSource());
		//close current instance of browser opened by selenium
		driver.close();
	}

}
