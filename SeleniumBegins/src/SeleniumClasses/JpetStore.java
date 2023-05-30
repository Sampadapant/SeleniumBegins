package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JpetStore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jpetstore.aspectran.com/catalog/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[placeholder=\"Product Search\"]")).sendKeys("Fish");
		
		//class name is the same for multiple elements
		int numberofButton = driver.findElements(By.className("button")).size();
		System.out.println(numberofButton);
		
		//find out all the link in the website with the help of tagname
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		
	
		
		// /html/body/section/div[2]/div[1]/div[1]/div/a/img ===> Absolute/Full Xpath	
		 // we have to navigate each and every node till we find that element
		
		//*[@id="LogoContent"]/a/img ===> Partial/Relative Xpath
		// based on the attribute it will directly jump to that element and find the element; it will not navigate throughout the nodes
		// it has //tagname[@attribute="value"]
		
		//syntax for the relative xpath of search button in the website
		//button[@type="submit"] OR
		//*[@type="submit"] //we can also write like this
		
		
		
	
		
		driver.quit();

	}

}
