package ParaBank;

import org.openqa.selenium.chrome.ChromeDriver;

public class paraBankCurrentURL {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		String currentURL = driver.getCurrentUrl();
		//System.out.println(currentURL);
		
		if(driver.getCurrentUrl().endsWith("parabank.parasoft.com/parabank/index.htm")) {
			System.out.println("URL validated");
		}
		else {
			System.out.println("URL not validated");
		}
		driver.quit();

	}

}
