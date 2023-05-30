import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileCreation {

	public static void main(String[] args) throws IOException {
		Properties proper = new Properties(); // for reading the values we have created the object
		
		//reading the values
		FileInputStream input =new FileInputStream("/Users/sampada/Desktop/SeleniumBegins/src/test.properties");
		proper.load(input);
		String browser = proper.getProperty("browser");
		System.out.println(browser);
		
//		if(browser == "chrome") {
//			ChromeDriver driver = new ChromeDriver();
//			driver.get(proper.getProperty("baseurl"));
//		}
//		else {
//			System.setProperty("WebDriver.chrome.driver", "/Users/sampada/Downloads/chromedriver/chromedriver.exe");
//			FirefoxDriver driver = new FirefoxDriver();
//		}
		
		//for writing the values
		
		FileOutputStream output = new FileOutputStream ("/Users/sampada/Desktop/SeleniumBegins/src/test.properties");
		proper.setProperty("country", "Nepal");
		proper.store(output, "storing the name of country");

	}

}
