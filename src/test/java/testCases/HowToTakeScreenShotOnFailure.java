package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Utility;

public class HowToTakeScreenShotOnFailure {
	
	WebDriver driver;
	
	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void screenshot1() {
		driver.get("https://vegamovies.wtf/");
		driver.manage().window().maximize();
		Assert.assertTrue(true);
	}
	
	@Test
	public void screenshot2() {
		driver.get("https://vegamovies.wtf/");
		driver.manage().window().maximize();
		Assert.assertTrue(false);
	} 
	
	@AfterMethod
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE == result.getStatus()) {
			Utility.takeScreenShot(driver, result.getName());
		}
	}
}
