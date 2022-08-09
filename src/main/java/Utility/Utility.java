package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// frame work ?
// i havn't get chance to create frame work start from scratch. i am currently working with existing frame work
// used Maven as a build tool

public class Utility {

	// there are lots of utilities as like am going to create one utility to
	// launching the browser

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		return driver;
	}
	
	public static void selectValueFromDropdown(WebElement element, String option) {
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}

	public static void selectDateFromDatePicker(WebDriver driver, String date) {
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	
	public static void scrollIntoView(WebElement element, WebDriver driver1) {
		((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	
	public static void clickUsingJavaScript(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;                 // selenium interface
		executor.executeScript("arguments[0].click();", element);
	}
	
	public static void takeScreenShot(WebDriver driver, String name) {
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File("./src/test/resources/Screenshots" + name + ".png"));
	} catch(Exception e) {
		
	}
}
}
