package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.findElement(By.linkText("HOME")).click();
		
		WebElement adv = driver.findElement(By.cssSelector("iframe[title=\"Advertisement\"]"));
		WebElement close = driver.findElement(By.xpath("//span[text()='Close']"));
		close.click();
//		if (adv.isDisplayed()) {
//			adv.;
//		}
//		else {
//			System.out.println("not working");
//		}
		WebElement ele = driver.findElement(By.id("Trainings"));
		driver.executeScript("arguments[0].scrollIntoView();", ele);
		
		//d.executeScript("arguments[0].scrollIntoView();", Ele);
		//driver.findElement(By.tagName("body")).sendKeys(Keys.END);
		
		//driver.findElement(null)
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();

	}

}
