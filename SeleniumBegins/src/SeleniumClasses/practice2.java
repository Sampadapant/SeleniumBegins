package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("HOME")).click();
//		boolean homePage = driver.findElement(By.cssSelector("img[alt=\"GlobalSQA\"]")).isDisplayed();
//		if (homePage) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)", "");
		 //js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector("li[id=\"Trainings\"]")).click();
		//boolean selenium = driver.findElement(By.xpath("//*[@id=\"post-1397\"]/div[2]/div/div/div[1]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]")).isDisplayed();
		
		WebElement adv = driver.findElement(By.cssSelector("span[class=\"ns-4oll8-e-18\"]"));
		if (adv.isDisplayed()) {
			adv.click();
		}
		else {
			System.out.println("not working");
		}
		
		
//		//# Scroll upto the element using JavaScript	
//		WebElement Ele = d.findElement(By.cssSelector("a[id=\"popup-alerts\"]"));
//		d.executeScript("arguments[0].scrollIntoView();", Ele);
//		
//		//# Scroll up the page
//		//d.findElement(By.tagName("Body")).sendKeys(Keys.HOME);
//		Thread.sleep(5000);
//
//		d.close();
////# Scroll down the page
//		//d.findElement(By.tagName("Body")).sendKeys(Keys.END);
//		//d.findElement(By.cssSelector("a[id=\"popup-alerts\"]")).sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(5000);
//		
//		//# Scroll upto the element using JavaScript	
//		WebElement Ele = d.findElement(By.cssSelector("a[id=\"popup-alerts\"]"));
//		d.executeScript("arguments[0].scrollIntoView();", Ele);
//		
//		//# Scroll up the page
//		//d.findElement(By.tagName("Body")).sendKeys(Keys.HOME);
//		Thread.sleep(5000);
//
//		d.close();

		
		
		driver.quit();
	}

}
