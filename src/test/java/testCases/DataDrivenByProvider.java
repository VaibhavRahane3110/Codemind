package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenByProvider {

	WebDriver driver;
	@BeforeMethod
	public void launchUrl() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	}
	
	@Test (dataProvider = "userData")
	public void verifyValidLogin(String User, String Pass) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pass);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@DataProvider(name = "userData")
	public String[][] dataProvide(){
		String[][] array = {{"User1", "Password1"}, {"User2", "Password2"}};
		return array;
	}
	@AfterMethod
	public void termDown() {
		driver.quit();
	}
}
