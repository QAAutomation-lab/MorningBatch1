package day1seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericInstances {

	public static void main(String[] args) {
		//Step1: set path for driver executables
		String chromeDriverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//Step2: Create an instance of ChromeDriver class and upcast it to WebDriver Interface
		WebDriver driver=new ChromeDriver();
		
		//Step1: set path for driver executables
		String geckoDriverPath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		//Step2: Create an instance of ChromeDriver class and upcast it to WebDriver Interface
		WebDriver driver1=new FirefoxDriver();
		
		//Step1: set path for driver executables
		String ieDriverPath=System.getProperty("user.dir")+"\\executables\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", chromeDriverPath);
		//Step2: Create an instance of ChromeDriver class and upcast it to WebDriver Interface
		WebDriver driver2=new InternetExplorerDriver();
	}

}
