package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class negativeTestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		 //action
        //enter username
        //find the element and send the keys
        //enter password
        //click on login button
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).sendKeys("sam21");
        driver.findElement(By.id ("password")).sendKeys("Sn@mar1");
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);

        //Assertion
        boolean errorMessage = driver.findElement(By.id("name")).isDisplayed();
        if(errorMessage){
            System.out.println("Test case is passed");
        }
        else{
            System.out.println("Test case is not passed");
        }
	}

}
