package ParaBank;

import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;



public class paraBank {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		//System.out.println(title);
		
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		if(title.equals(expectedTitle)) {
			System.out.println("validated");
		}
		else {
			System.out.println("not validated");
		}
	
	
		driver.quit();
	}

}
