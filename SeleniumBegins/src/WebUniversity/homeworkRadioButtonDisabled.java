package WebUniversity;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkRadioButtonDisabled {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement button = driver.findElement(By.id("radio-buttons"));
		List<WebElement> rdBt = button.findElements(By.cssSelector("input[type='radio']"));
		for(int i = 0; i<rdBt.size(); i++) {
			//System.out.println(rdBt.get(i).getAttribute("value"));
			String valueButton = rdBt.get(i).getAttribute("value");
			
			if(valueButton.equals("green")) {
				rdBt.get(i).click();
				
				Iterator <WebElement> ss = rdBt.iterator();
				while(ss.hasNext()) {
					if(!ss.next().isSelected()) {
						System.out.println("pass:not selected");
					}
					else {
						System.out.println("Selected");
					}
				}
			}
		}
		 
		
			
				
		
		driver.quit();

	}

}
