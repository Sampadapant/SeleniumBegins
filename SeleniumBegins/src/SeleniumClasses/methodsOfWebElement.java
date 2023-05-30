package SeleniumClasses;

import org.openqa.selenium.chrome.ChromeDriver;

public class methodsOfWebElement {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/Users/sampada/Downloads/chromedriver/chromedriver.exe");//to check path of room driver
		ChromeDriver driver =new ChromeDriver(); //to create access
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); //to set the URL
		
		//sendKeys(): to type on any element; it work on input and text area
		//isDisplayed(): to see whether the particular element is displayed or not
		//isSelected(): works on the drop down, checkBoxes; returns boolean value; checks particular element is selected or not
		//submit(): works with form; write something and submit it
		//isEnabled(): interactable with element
		//getLocation(): co-ordinates; where is the location of the element point is data type
		//getClear(): type something and if we want to clear on any form
		//getText(): find text of the element <h1 id = "one" class = "two" name = "nm"> Hello</h1> String
		//getTagname(): gives the tagname eg: h1 String
		//getCssValue(): #dropdowm-menu-1; copy the css from element in the web page and paste  #contact_form > input:nth-child(1) 
		//gives you css value of the element
		//gettAttribute() Example:attribute of class is "two"
		//click(): click element ; action on the web element to submit form 
		//getSize(): size of the element; height and width of the element dimension is return type
		
		

	}

}
