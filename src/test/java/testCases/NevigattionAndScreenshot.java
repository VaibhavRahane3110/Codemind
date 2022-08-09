package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NevigattionAndScreenshot {

	@Test
	public void navigate() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// Take Screenshot
		
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;         // Create interface
		File file = takeScreenshot.getScreenshotAs(OutputType.FILE);      // Store File and create location
	  
		//Apache Common IO dependencies add in POM.xml file	
		
		FileUtils.copyFile(file, new File("C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\test.png"));

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
	 // javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");       // from google
	    WebElement element = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Beauty and Personal Care']"));
	    javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);              // scroll till to the point
	    
	    // Horizontal & Vertical scroll
	    javascriptExecutor.executeScript("window.scrollBy(0,500)");        // "window.scrollBy(horizontal,vertical)"
	    javascriptExecutor.executeScript("window.scrollBy(0,-500)");
	    javascriptExecutor.executeScript("window.scrollBy(500,0)");
	    javascriptExecutor.executeScript("window.scrollBy(-500,0)");
	   
	    
	
	}
}
