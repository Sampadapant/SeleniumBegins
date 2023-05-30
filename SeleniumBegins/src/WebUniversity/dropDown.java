package WebUniversity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//text
//		WebElement ddMenu = driver.findElement(By.cssSelector("select[id=\"dropdowm-menu-1\"]"));
//		Select dropMenu =  new Select(ddMenu);
//		dropMenu.selectByVisibleText("C#");
//		Thread.sleep(3000);
		
		//index
//		WebElement we = driver.findElement(By.cssSelector("select[id=\"dropdowm-menu-2\"]"));
//		Select dropMenu1 = new Select(we);
//		dropMenu1.selectByIndex(2);
//		Thread.sleep(3000);
		
		//value
		WebElement ew = driver.findElement(By.cssSelector("select[id=\"dropdowm-menu-3\"]"));
		Select dropMenu2 = new Select(ew);
		dropMenu2.selectByValue("javascript");
		Thread.sleep(3000);
		
		//dropMenu2.getOptions(); //to check whether the particular type of option is present or not in the list. 
		//we will get list and checking is done through the looping
		//System.out.println(dropMenu2.getOptions());
		
		List <WebElement> liStt = dropMenu2.getOptions();
		for(int i =0; i <liStt.size(); i++) {
			System.out.println(liStt.get(i).getText());
		}
		
		//Select class only applies in drop down with select as tagname. 
		//we need to pass select element to constructor which is Select dropMenu1 = new Select(we);
		// by value, by Index , by Text
	
	
		driver.quit();
	}

}
