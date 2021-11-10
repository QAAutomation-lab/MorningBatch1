package day1seleniumBasic;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {
		
		//Step1: set path for driver executables
		//System.setProperty("webdriver.ie.driver", "F:\\NewWorkspace\\SeleniumTesting\\executables\\IEDriverServer.exe");
						//or
		//System.setProperty("webdriver.ie.driver", "F:/NewWorkspace/SeleniumTesting/executables/IEDriverServer.exe");
						//or
		//System.setProperty("webdriver.ie.driver", "./executables/IEDriverServer.exe");
						//or
		String ieDriverPath=System.getProperty("user.dir")+"\\executables\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", ieDriverPath);
		//Step2: Create an instance of InternetExplorerDriver class
		InternetExplorerDriver cdriver=new InternetExplorerDriver();
	}

}
