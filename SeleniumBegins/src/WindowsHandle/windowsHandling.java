package WindowsHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowsHandling {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.webdriveruniversity.com/");
		driver.findElement(By.id("contact-us")).click();
		String firstPage = driver.getWindowHandle(); //returns parent id
		System.out.println(firstPage);
		Set<String> windows = driver.getWindowHandles(); //returns parent and child id both //for storing unique value
		System.out.println(windows);
		
		// as we have multiple tabs now  therefore we have to use iterator
		Iterator <String> ss = windows.iterator();
		String parent = ss.next(); //comes to 1st tab
		String child = ss.next(); //comes in 2nd tab
		//System.out.println(parent);
		//System.out.println(child);
		
		//if we want to move to child
		driver.switchTo().window(child);
		driver.findElement(By.cssSelector("h2[name=\"contactme\"]")).isDisplayed();
		
		 //if we want to move to parent
		driver.switchTo().window(parent);
		if(driver.getTitle().equals("WebDriverUniversity.com")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		
		driver.quit();
 
	}

}
