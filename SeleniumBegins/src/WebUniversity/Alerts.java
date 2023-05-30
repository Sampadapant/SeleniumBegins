package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		//Alert
//		driver.findElement(By.cssSelector("span[id=\"button1\"]")).click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		
		
		//confirm() accept()
		driver.findElement(By.cssSelector("span[id=\"button4\"]")).click();
		driver.switchTo().alert().accept();
		String AcceptTeXt = driver.findElement(By.id("confirm-alert-text")).getText();
		System.out.println(AcceptTeXt );
		Thread.sleep(3000);
		
		
		//confirm dismiss()
//		driver.findElement(By.cssSelector("span[id=\"button4\"]")).click();
//		driver.switchTo().alert().dismiss();
//		String teXtDismiss = driver.findElement(By.id("confirm-alert-text")).getText();
//		System.out.println(teXtDismiss);
//		Thread.sleep(3000);
	
		
		driver.quit();

	}

}
