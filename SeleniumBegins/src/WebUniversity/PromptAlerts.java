package WebUniversity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class PromptAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
		 //making object of alert class
		Thread.sleep(3000);
		//driver.switchTo().alert().sendKeys("Kathmandu");
		
		//accept
		//driver.switchTo().alert().accept();
//		String result = driver.findElement(By.cssSelector("p[id =\"result\"]")).getText();
//		
//		if(result.equals("You entered: Kathmandu")) {
//			System.out.println("test case is passed");
//		}
//		else {
//			System.out.println("test case is failed");
//		}
		
		
		
		//cancel
		driver.switchTo().alert().dismiss() ;
		String result1 = driver.findElement(By.cssSelector("p[id =\"result\"]")).getText();
		
		if(result1.equals("You entered: null")) {
			System.out.println("test case is passed");
		}
		else {
			System.out.println("test case is failed");
		}
		
	
		
		driver.quit();
	}

}
