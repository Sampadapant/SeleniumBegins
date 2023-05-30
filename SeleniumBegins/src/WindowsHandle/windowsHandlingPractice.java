package WindowsHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandlingPractice {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/");
		
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]")).click();
		String parent = driver.getWindowHandle(); //it shows only parent window id
		System.out.println(parent);
		
		Set<String> child =driver.getWindowHandles(); // it shows both parent window and child window
		System.out.println(child);
		
		//iterator to use multiple windows tab
		Iterator<String> aa = child.iterator();
		String parent1 = aa.next();
		String child1 = aa.next();
		
		driver.switchTo().window(child1);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent1);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		

	}

}
