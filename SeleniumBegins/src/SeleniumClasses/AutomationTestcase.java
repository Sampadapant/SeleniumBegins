package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//arrange
		System.setProperty ("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//valid login
		//actions
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.cssSelector("input[name=\"username\"]"));
		WebElement pw = driver.findElement(By.cssSelector("input[name=\"password\"]"));
		WebElement login = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		
		//credentials
		user.sendKeys("Admin");
		pw.sendKeys("admin123");
		login.click();
		Thread.sleep(5000);
		
		//assertions
		//test case:1
		//WebElement homepageLogin = driver.findElement(By.cssSelector("img[alt=\"client brand banner\"]"));
		
		//boolean page = homepageLogin.isDisplayed();
		//if (page) {
			//System.out.println("Test case passed");
		//}
		//else {
			//System.out.println("Test case failed");
		//}
		
		//test case 2:invalid credentials
		
		//user.sendKeys("Adin");
		//pw.sendKeys("admin123");
		//login.click();
		//Thread.sleep(5000);
		
		//boolean error = driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")).isDisplayed();
		
		//if (error) {
			//System.out.println("passed");
		//}
		//else {
			//System.out.println("failed");
		//}
		
		//test case 3: forgot password
		//Thread.sleep(5000);
		//driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
		//String currentUrl = driver.getCurrentUrl();
		//if(currentUrl.contains("requestPasswordResetCode")) {
		//System.out.println("test case is passed");
		//}
		//else {
			//System.out.println("test case is failed");
		//}
		
		//test case:4 logo is present or not
		
		WebElement logo = driver.findElement(By.cssSelector("img[alt=\"client brand banner\"]"));
		if(logo.isDisplayed()) {
			System.out.println("test case has been passed");
		}
		else {
			System.out.println("test case has been failed");
		}
		 
		driver.close();

	}

}
