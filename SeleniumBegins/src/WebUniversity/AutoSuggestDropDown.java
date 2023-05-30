package WebUniversity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		// System.setProperty("WebDriver.chrome.driver",
		// "/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

		driver.findElement(By.cssSelector("#myInput")).sendKeys("b");
		List<WebElement> listOfB = driver.findElements(By.cssSelector("#myInputautocomplete-list>div"));
		for (int i = 0; i < listOfB.size(); i++) {
			System.out.println(listOfB.get(i).getText());
			if (listOfB.get(i).getText().equals("Bacon")) {
				listOfB.get(i).click();
				break;
			}

		}

		driver.findElement(By.cssSelector("#submit-button")).click();
		if (driver.getCurrentUrl().contains("Bacon")) {
			System.out.println("test case is passed");
		} else {
			System.out.println("test case is failed");
		}

		driver.quit();
	}

}
