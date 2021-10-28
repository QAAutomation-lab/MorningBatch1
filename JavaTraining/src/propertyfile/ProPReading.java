package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProPReading {

	public static void main(String[] args) throws IOException {

		// FileInputStream fis=new
		// FileInputStream("F:\\NewWorkspace\\JavaTraining\\TestData\\testData.properties");
		// or
		String filePath=System.getProperty("user.dir")+"\\TestData\\testData.properties";
//		FileInputStream fis=new FileInputStream(filePath);
		// or
		FileInputStream fis = new FileInputStream(".\\TestData\\testData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("appUrl"));
		
		System.out.println(getValueFromProp(filePath, "username"));
	}

	public static String getValueFromProp(String propLocation,String key) {
		FileInputStream fis;
		Properties prop = new Properties();
		try {
			fis = new FileInputStream(propLocation);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
