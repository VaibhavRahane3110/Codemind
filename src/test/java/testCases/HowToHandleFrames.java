package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandleFrames {
	
	@Test
	public void handleFrame() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\eclipse-workspace\\com.codemind.project\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		System.out.println("current url :" + driver.getCurrentUrl());
		System.out.println("title :" + driver.getTitle());
		System.out.println(driver.getPageSource());
		
		WebElement element = driver.findElement(By.xpath("//iframe[@id='frame1']"));          //frame handle
		driver.switchTo().frame(element);
		String str = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(str);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//header/a")).getAttribute("href"));	
	}
}
