package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceSelectors {

	public static void main(String[] args) {
		System.setProperty ("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
		WebElement lastName = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
		WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		WebElement message = driver.findElement(By.cssSelector("textarea[name=\"message\"]"));
		//WebElement submit = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		WebElement reset = driver.findElement(By.cssSelector("input[value=\"RESET\"]"));
		
		firstName.sendKeys("Sampada");
		lastName.sendKeys("Pant");
		email.sendKeys("sampadapant1@gmail.com");
		message.sendKeys("Hello");
		//submit.click();
		reset.click();
		
		
		//invalid
		//firstName.sendKeys("Sampada");
				//lastName.sendKeys("Pant");
				//email.sendKeys("sampadapant1@gml.com");
				//message.sendKeys("Hello");
				//submit.click();
				
				
		//invalid test case
		//boolean errorMsg = driver.findElement(By.cssSelector("body")) .isDisplayed();
		
		//if(errorMsg) {
			//System.out.println("passed");
		//}
		//else {
			//System.out.println("failed");
		//}
		
		//valid test case
		//String currentURL = driver.getCurrentUrl();
		//if(currentURL.contains("contact-form-thank-you.html")) {
			//System.out.println("test case is passed");
		//}
		//else
			//System.out.println("test case is failed");
		
		//Test case: reset
		
//		if(lastName.getAttribute("value").equals("")) {
//			System.out.println("reset passed");
//		}
//		else {
//			System.out.println("reset failed");
//		}
		
		WebElement contact = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
		
		boolean display = contact.isDisplayed();
		
		if(display) {
			System.out.println("test case is passed");
		}
		else {
			System.out.println("test case is failed");
		}
		
		driver.close();
		
	

	}

}
