package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class differentLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		
		
		//driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//By Id
		//boolean checkboxes = driver.findElement(By.id("checkboxes")).isDisplayed();
        //if (checkboxes) {
		//	System.out.println("passed");
		//}
		//else {
			//System.out.println("failed");
	    // }
		
		//by cssSelector
		Thread.sleep(5000);
		boolean checkBoxes = driver.findElement(By.cssSelector("div[id=\"checkboxes\"]")).isDisplayed();
		if (checkBoxes) {
			System.out.println("test case pass");
		}
		else {
		System.out.println("test case failed");
		}
		//By attribute name
		//driver.findElement(By.name("vegetable")).isDisplayed();
		
		//by tagName
		//driver.findElement(By.tagName("input")).isDisplayed();
		
		//By linkText
		//driver.findElement(By.linkText("Automationteststore")).isDisplayed();
		
		//By partial link Test
		//driver.findElement(By.partialLinkText("PORTAL")).isDisplayed();
		
		//By class
		//driver.findElement(By.className("caption")).isDisplayed();
		
		// By xpath
		//driver.findElement(By.xpath("//*[@id=\"page-object-model\"]/div/div[1]/h1")).isDisplayed();
		
		driver.quit();
		
		
	}

}
