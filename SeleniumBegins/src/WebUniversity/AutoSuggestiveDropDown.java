package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Food Item\"]")).sendKeys("B");
		driver.findElement(By.xpath("//input[@placeholder=\"Food Item\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder=\"Food Item\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder=\"Food Item\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder=\"Food Item\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder=\"Food Item\"]")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		if(driver.getCurrentUrl().contains("Bagels")) {
			System.out.println("test case is passed");
		}
		else {
			System.out.println("test cas is failed");
		}
	   
		driver.quit();

	}

}
