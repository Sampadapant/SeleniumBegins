package WindowsHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandling2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.webdriveruniversity.com/");
		driver.findElement(By.id("contact-us")).click();
		String firstPage = driver.getWindowHandle(); //returns parent id
		System.out.println(firstPage);
		Set<String> windows = driver.getWindowHandles(); //returns parent and child id both
		System.out.println(windows);
		
		Iterator <String> ss = windows.iterator();
		
		while(ss.hasNext()) {
			String windowChild = ss.next();
			if(!firstPage.equals(windowChild)) {
				driver.switchTo().window(windowChild); 
				if (driver.getTitle().contains("WebDriver | Contact Us")) {
					System.out.println("test case passed");
				}
				else {
					System.out.println("test case failed");
				}
			}
		}
		
		driver.quit();
	}

}
