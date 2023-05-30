package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabankLocators {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		//URL
//		String currentURL = driver.getCurrentUrl();
//		//System.out.println(currentURL);
//		
//		if(driver.getCurrentUrl().endsWith("parabank.parasoft.com/parabank/index.htm")) {
//			System.out.println("URL validated");
//		}
//		else {
//			System.out.println("URL not validated");
//		}
//		
//		
//		//TITLE
//		
//		String title = driver.getTitle();
//		//System.out.println(title);
//		
//		String expectedTitle = "ParaBank | Welcome | Online Banking";
//		if(title.equals(expectedTitle)) {
//			System.out.println("validated");
//		}
//		else {
//			System.out.println("not validated");
//		}
		
		
//		boolean cssSe = driver.findElement(By.cssSelector("input[type=\"text\"]")).isDisplayed();
//		
//		if(cssSe) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
		
//		boolean claSS = driver.findElement(By.className("captionone")).isDisplayed();
//		if (claSS)
//			System.out.println("is passed");
//		else {
//			System.out.println("is failed");
//		}
		
		
//		boolean naMe = driver.findElement(By.name("username")).isDisplayed();
//			if (naMe)
//				System.out.println("is Passed");
//		else {
//			System.out.println("is Failed");
//			}
//		
//		

//		boolean id = driver.findElement(By.id("headerPanel")).isDisplayed();
//		if(id) {
//			System.out.println("is Passed");
//		}
//		else {
//			System.out.println("is Failed");
//		}
		
		
//		boolean linkText = driver.findElement(By.linkText("Home")).isDisplayed();
//		if(linkText) {
//			System.out.println("is passed");
//		}
//		else {
//			System.out.println("is failed");
//		}
		
		
//		boolean PlinkText = driver.findElement(By.partialLinkText("Ho")).isDisplayed();
//		if(PlinkText) {
//			System.out.println("is passed");
//		}
//		else {
//			System.out.println("is failed");
//		}
//		
//		boolean xpath = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).isDisplayed();
//		if (xpath) {
//			System.out.println("is passed");
//		}
//		else {
//			System.out.println("is failed");
//		}
//		
		boolean tagg = driver.findElement(By.tagName("h4")).isDisplayed(); //span, form,h2
		if(tagg) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
			
			driver.close();


	}

}
