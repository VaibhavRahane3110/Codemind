package testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Utility;

public class HowToFindBrokenLink{

	HttpURLConnection huc;

	@Test
	public void brokenLink() throws IOException {
		WebDriver driver = Utility.getDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> list = driver.findElements(By.xpath("//a[@href]"));

		for (WebElement elm : list) {
			huc = (HttpURLConnection) new URL(elm.getAttribute("href")).openConnection();
			huc.setConnectTimeout(1000);
			huc.connect();

			System.out.println(huc.getResponseMessage());
			Assert.assertEquals(huc.getResponseCode(), 200);
			if (huc.getResponseCode() == 200) {

				System.out.println(elm.getAttribute("href") + ":" + "Link is working fine");
			}

			else {
				System.out.println(elm.getAttribute("href") + ":" + "Link is not working fine");
			}
		}
	}

}
