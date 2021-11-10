package day1seleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		//Step1: set path for driver executables
		//System.setProperty("webdriver.chrome.driver", "F:\\NewWorkspace\\SeleniumTesting\\executables\\chromedriver.exe");
						//or
		//System.setProperty("webdriver.chrome.driver", "F:/NewWorkspace/SeleniumTesting/executables/chromedriver.exe");
						//or
		//System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
						//or
		String chromeDriverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//Step2: Create an instance of ChromeDriver class
		ChromeDriver cdriver=new ChromeDriver();
	}

}
