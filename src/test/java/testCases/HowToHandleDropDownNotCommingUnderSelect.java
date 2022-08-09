package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandleDropDownNotCommingUnderSelect {

	@Test
	public void handleWindows() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/");
		driver.findElement(By.xpath("//img[contains(@src,'close-icon-grey')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow')]")).click();
		driver.findElement(By.xpath("//ul[@id='country-scroll']//li/span[text()='Singapore']")).click();
	}
}