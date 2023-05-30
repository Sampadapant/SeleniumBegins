package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAndAssertions {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        

        //action
        WebElement userName = driver.findElement(By.cssSelector("input[name=\"username\"]"));
        WebElement passWord = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        WebElement logIn =  driver.findElement(By.cssSelector("button[type=\"submit\"]"));

        //putting credentials
        userName.sendKeys("Admin");
        passWord.sendKeys("admin123");
        logIn.click();


        WebElement logo = driver.findElement(By.cssSelector("img[alt='client brand banner']"));
        System.out.println(logo.getAttribute("alt"));
        //assertion


        boolean displayLogo = logo.isDisplayed();
        System.out.println(displayLogo);

        if (displayLogo){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        driver.close();

	}

}
