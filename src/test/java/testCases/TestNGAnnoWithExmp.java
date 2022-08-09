package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnoWithExmp {


		WebDriver driver;

		@BeforeSuite
		public void beforesuite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		}
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("Before Test Plan");
		}
		
		@BeforeClass
		public void beforeClass() {
			System.out.println("Before Class");
		}
		
		@BeforeMethod
		public void beforemethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		}
		
		@Test
		public void annotation1() throws InterruptedException {
			System.out.println("VAIBHAV NANASAHEB RAHANE");
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("fName");
			Thread.sleep(2000);
		}
		
		@Test
		public void annotation2() throws InterruptedException {
			System.out.println("vaibhav nanasaheb rahane");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lName");
			Thread.sleep(2000);
		}
		
		@AfterMethod
		public void aftermethod() {
			System.out.println("After Method");
			driver.quit();
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("After Class");
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("After Test Plan");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("After Suite");
		}
		
//		public void afterSuite1() {
//			System.out.println("After Suite");
//		}
}

