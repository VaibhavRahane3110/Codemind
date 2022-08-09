package testCases;

import org.openqa.selenium.By;

// locators strategies :-
// By.id, By.name, By.className, By.xpath, By.linktext, By.tagName, By.partialLinkText, By.cssSelectors

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStratergies {

public void locators() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("demo-request"));                                          // attribute id name/ value
	
	driver.findElement(By.className("demo-request try-it-page"));                       // attribute class name/ value
	
	driver.findElement(By.tagName("footer"));                                           // direct main tagName
	
	driver.findElement(By.linkText("Contact Sales"));                                   // direct main text
	
	driver.findElement(By.partialLinkText("Contact"));                                  // direct main text or part of linkText 
	
	driver.findElement(By.name("viewport"));                                            // name attribute value
	
	driver.findElement(By.cssSelector("meta[name='viewport']"));                        // don't use slash(/) for path syntax { TagName[attribute = 'attribute value'] } 
	driver.findElement(By.cssSelector("div[id='10']"));                                 // class atribute denoted by (.) and id attribute denoted by (#)
	driver.findElement(By.cssSelector("div#10"));
	
	driver.findElement(By.xpath("//div[@class='col-md-12 software-menu-sub']"));        // Syntax                                                                                       
	                                                                                    // types:1) Relative xpath start with (//) { //Tagname[@Attribute='value'] }
                                                                                        // 2) Absolute xpath start with (/) { /html/head/Tagname[@Attribute='value']} syntax start from root to main element
	driver.findElement(By.xpath("//div[text()='name']"));                               // text base locator syntax : //div[text()='name']


}
}