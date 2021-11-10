package day1seleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		
		//Step1: set path for driver executables
		//System.setProperty("webdriver.gecko.driver", "F:\\NewWorkspace\\SeleniumTesting\\executables\\geckodriver.exe");
						//or
		//System.setProperty("webdriver.gecko.driver", "F:/NewWorkspace/SeleniumTesting/executables/geckodriver.exe");
						//or
		//System.setProperty("webdriver.gecko.driver", "./executables/geckodriver.exe");
						//or
		String geckoDriverPath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		//Step2: Create an instance of FirefoxDriver class
		FirefoxDriver fdriver=new FirefoxDriver();
		
		String chromeDriverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//Step2: Create an instance of ChromeDriver class
		ChromeDriver cdriver=new ChromeDriver();
	}

}
