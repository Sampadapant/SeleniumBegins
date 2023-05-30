package iFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameIndexName {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjson_parse");
		//driver.get("http://www.webdriveruniversity.com/");
		
		// By Index
//		driver.switchTo().frame(1);
//		boolean ab =  driver.findElement(By.xpath("/html/body/h2")).isDisplayed(); 
//		if(ab) {
//			System.out.println("passed");
//		}
		
	//by name
		//WebElement naMe = driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame("iframeresult");
		boolean b =  driver.findElement(By.xpath("/html/body/h2")).isDisplayed();
		if(b) {
			System.out.println("passed");
		}

		//by id
		//WebElement iD = driver.findElement(By.id("iframeResult"));
//		driver.switchTo().frame("iframeResult");
//		boolean bc =  driver.findElement(By.xpath("/html/body/h2")).isDisplayed();
//		if(bc) {
//			System.out.println("passed");
//		}
//		

		//driver.findElements(By.tagName("iframe")).size(); //total number of iFrame inside the page
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//total no. of links 
//		List<WebElement> a = driver.findElements(By.tagName("a"));
//		a.size();
//		System.out.println(a.size());
//		
//		
//		//get the text of all links 
//		for(int i =0; i<a.size();i++) {
//			//System.out.println(a.get(i).getText());
//			
//			
//			//value of href attribute
//			
//			System.out.println(a.get(i).getAttribute("href"));
//		}
		
		driver.quit();


}
}
