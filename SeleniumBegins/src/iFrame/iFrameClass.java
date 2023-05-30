package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameClass {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "/Users/sampada/Desktop/Driver/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();

		// by id through web element
		WebElement iFrame = driver.findElement(By.id("frame")); // finding element which has iframe tag
		driver.switchTo().frame(iFrame);
		// System.out.println(driver.getTitle());
		boolean home = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")).isDisplayed();
		if (home) {
			System.out.println("passed");
		}
		// driver.switchTo().parentFrame();
		// System.out.println(driver.getTitle());

		driver.quit();

	}

}
