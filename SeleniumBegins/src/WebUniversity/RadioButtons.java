package WebUniversity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		WebElement green = driver.findElement(By.cssSelector("input[value=\"green\"]"));
//		//WebElement blue = driver.findElement(By.cssSelector("input[value=\"blue\"]"));
//		green.click();
//		if(green.isSelected()) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
//		
		//for already selected
		WebElement blue = driver.findElement(By.cssSelector("input[value=\"blue\"]"));
		blue.click();
		if(blue.isSelected()) {
			System.out.println("passed:unselected");
		}
		else {
			System.out.println("failed:selected");
		}
		
		//radio buttons
		WebElement rb = driver.findElement(By.id("radio-buttons"));
		List<WebElement> radioButtons = rb.findElements(By.cssSelector("input[type=\"radio\"]"));
		for(int i = 0; i<radioButtons.size();i++) {
			System.out.println(radioButtons.get(i).getAttribute("value"));
			radioButtons.get(i).click();
		}
		
		List <WebElement> checkbox = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for(int i = 0; i<checkbox.size(); i++) {
			System.out.println(checkbox.get(i).getAttribute("value"));
			checkbox.get(i).click();
		}
		driver.quit();

	}

}
