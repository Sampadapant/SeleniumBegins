package WebUniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actions {

	public static void main(String[] args) throws InterruptedException {
		
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://www.webdriveruniversity.com/Actions/index.html");
    driver.manage().window().maximize();
    Actions ac = new Actions(driver);
    
    //double click
//    WebElement dc = driver.findElement(By.cssSelector("#double-click"));
//    ac.doubleClick(dc).build().perform();
//    
//    if(dc.getAttribute("class").equals("div-double-click double")) {
//    	System.out.println("test case is passed");
//    }
//    else {
//    	System.out.println("test case is failed");
//    }
    
    //drag and drop
    
//    WebElement drag = driver.findElement(By.cssSelector("div[id=\"draggable\"]"));
//    WebElement drop = driver.findElement(By.cssSelector("div[id=\"droppable\"]"));
//    System.out.println(drop.getText());
//    ac.dragAndDrop(drag, drop).build().perform();
//    System.out.println(drop.getText());
  
    
    //click and hold
//    WebElement ch = driver.findElement(By.cssSelector("div[id=\"click-box\"]"));
//    ac.clickAndHold(ch).build().perform();
//    Thread.sleep(3000);
    
//    if(ch.getText().equals("Well done! keep holding that click now.....")) {
//    	System.out.println("test case is passed");
//    }
//    else {
//    	System.out.println("test case is failed");
//    }
    
//    ch.click();
//    if(ch.getText().equals("Dont release me!!!")) {
//    	System.out.println("test case is passed");
//     }
//    else {
//   	System.out.println("test case is failed");
//   }
    //hover over element
//       WebElement hover = driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > button"));
//       ac.moveToElement(hover).build().perform();
//       Thread.sleep(5000);
    
    //perform right click : context click
       
       WebElement concl = driver.findElement(By.cssSelector("h1[id=\"main-header\"]"));
       ac.contextClick(concl).build().perform();
       Thread.sleep(5000);
    
    
    driver.quit(); 

	}

}
 