package testCases;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utility.Utility;

public class ActionsClass {

	@Test
	public void actionClass() throws InterruptedException {
		WebDriver driver = Utility.getDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement element = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		// Action is interface
		Action action;

		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		Thread.sleep(5000);
		// System.out.println(driver.findElement(By.xpath("//div[text()='Google Apps']")));
		WebElement searchArea = driver.findElement(By.xpath("//input[@name='q']"));

		actions.keyDown(searchArea, Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).build().perform();
		actions.keyDown(searchArea, Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		actions.contextClick(searchArea).build().perform();

	}

}


