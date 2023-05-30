package WebUniversity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownPractice {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement register = driver.findElement(By.cssSelector("a[class=\"btn btn-black navbar-btn\"]"));
		register.click();
		
		
		boolean display = driver.findElement(By.cssSelector("img[title=\"OpenCart - Account Register\"]")).isDisplayed();
		if (display) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
//		WebElement country = driver.findElement(By.cssSelector("select[id=\"input-country\"]"));
//		Select countrieS = new Select(country);
//		countrieS.selectByVisibleText("Australia");
//		
		driver.quit();

	}

}
