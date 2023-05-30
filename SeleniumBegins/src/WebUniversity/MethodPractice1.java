package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodPractice1 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 //driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 //driver.get("https://www.amazon.com/");
		 //driver.get("file:///Users/sampada/Desktop/sampadahtml/practice3/DOM/index.html");
		 
		 //WebElement firstName =  driver.findElement(By.name("first_name"));
		 
		 //sendKeys():it works on input and text area of the web element
		//firstName.sendKeys("Sampada");
		
		//clear(): it works on input and text area of the web element; clear the input
		//firstName.clear();
		
//		driver.findElement(By.name("first_name")).sendKeys("Sampada");
//		driver.findElement(By.name("last_name")).sendKeys("Pant");
//		driver.findElement(By.name("email")).sendKeys("sampadapant1@gmail.com");
//		driver.findElement(By.name("message")).sendKeys("Hello");
//		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click(); //click():click the element in web page
//		
		//isDisplayed()
		
//		boolean display = driver.findElement(By.name("contactme")).isDisplayed();
//		System.out.println(display);
		
//		if(display) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
		 
		 boolean isEn = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isEnabled();
//		 System.out.println(isEn);
		 if (isEn) {
			 System.out.println("Test case is passed");
		 }
		 else {
			 System.out.println("Test case is failed");
		 }
		boolean isEn2 =  driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isSelected();
//		System.out.println(isEn2);
		if(isEn2) {
			System.out.println("Test Case is passed");
		}
		else {
			System.out.println("Test Case is failed");
		}
		
//		boolean select = driver.findElement(By.cssSelector("input[value=\"blue\"]")).isSelected();
////		System.out.println(select);
//		if(select) {
//			System.out.println("Test Case passed");
//		}
//		else {
//			System.out.println("test case failed");
//		}
		
		boolean lettuce = driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).isEnabled();
		if(lettuce) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		//submit()
//		driver.findElement(By.name("first_name")).sendKeys("Sampada");
//		driver.findElement(By.name("last_name")).sendKeys("Pant");
//		driver.findElement(By.name("email")).sendKeys("sampadapant1@gmail.com");
//		driver.findElement(By.name("message")).sendKeys("Hello");
//		driver.findElement(By.cssSelector("input[type=\"submit\"]")).submit();
		
		
		//getText()
//		String text = driver.findElement(By.cssSelector("h2[class=\"section_header\"]")).getText();
//		//System.out.println(text);
//		if(text.contains("CONTACT US")) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
		
		//getTagName() 
//		WebElement tag = driver.findElement(By.name("first_name"));
//		System.out.println(tag.getTagName());
		
		//getSize()
//		WebElement size = driver.findElement(By.id("nav-logo-sprites"));
//		Dimension d = size.getSize();
//		//System.out.println(d);
//		System.out.println(d.height);
//		System.out.println(d.width);
		
		 //getLocation()
//		WebElement location = driver.findElement(By.id("nav-logo-sprites"));
//		Point p = location.getLocation();
//		//System.out.println(p);
//		System.out.println(p.x);
//		System.out.println(p.y);
		
		//getAttribute()
//		String attribute =  driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
//		System.out.println(attribute);
		
		//getCssValue()
//		WebElement cSS = driver.findElement(By.cssSelector("h1"));
//		 String abc = cSS.getCssValue("border-left");
//		 System.out.println(abc);
	
		driver.quit();
		

	}

}
