package WebUniversity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataTableTag {

	public static void main(String[] args) {
		//System.setProperty("WebDriver.chrome.driver", "/Users/sampada/Downloads/chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

		// size of table
//		List<WebElement> table1 = driver.findElements(By.xpath("//*[table]"));
//		System.out.println(table1.size());

		// total number of rows

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"t01\"]/tbody/tr"));
		System.out.println(rows.size());

		// total number of columns
//		List<WebElement> columns = driver.findElements(By.xpath("//table[@id=\"t01\"]/tbody/tr[2]/td"));
//		System.out.println(columns.size());

//		int sum = 0;
//
//		for (int i = 2; i <= rows.size(); i++) {
//			
//			String numText = driver.findElement(By.xpath("//table[@id=\"t01\"]/tbody/tr[" + i + "]/td[3]")).getText();
//			//System.out.println(numText);
//			sum = sum +Integer.parseInt(numText);
//		}
		
//		System.out.println(sum);
		
		//person name with doe
		for(int i =2; i<= rows.size(); i++) {
		String name11 =  driver.findElement(By.xpath("//table[@id=\"t01\"]/tbody/tr[" + i + "]/td[2]")).getText();
		 if(name11.equals("Doe")) {
			 System.out.println("test case is passed");
		 
		 break;
	
		}
	}
		driver.quit();

	}

}
