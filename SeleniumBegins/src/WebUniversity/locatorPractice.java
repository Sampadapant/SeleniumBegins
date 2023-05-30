package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPractice {

	public static void main(String[] args) {
System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //WebElement searchbox = chromeDriver.findElement(By.id("user-name"));
        //searchbox.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        //linked text
        driver.findElement(By.linkText("Swag Labs")).click();

      //boolean menu =   driver.findElement(By.id("react-burger-menu-btn")).isDisplayed();
      //if(menu){
          //System.out.println("passed");
     // }
      //else{
         // System.out.println("failed");
      //}

	}

}
