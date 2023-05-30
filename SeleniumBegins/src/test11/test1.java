package test11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	

	public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		  
		  driver.findElement(By.xpath("//input[@id='login-button']")).click();
		  
		List<WebElement> itemNumber = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		System.out.println(itemNumber.size());
	
		  driver.quit();

	}

}
