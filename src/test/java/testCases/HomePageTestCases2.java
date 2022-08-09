package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomePage;
import Utility.Utility;

public class HomePageTestCases2 {
  
  //instance reference
	HomePage homePage;      // (instance reference) object
	WebDriver driver;
	
	@BeforeClass
	public void launchURL() {
		
		driver = Utility.getDriver();                  // method
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		homePage = new HomePage(driver);            // constructor create      // function call purpose
                  // parameterized constructor	
	}
	
	@Test
	public void verifyFormFieldSelection() throws InterruptedException {
		
		homePage.setUserNameTextBox();
		homePage.getUserNameTextBox().sendKeys("UserName1");
		System.out.println(homePage.getUserNameTextBox().getAttribute("Placeholder"));
		System.out.println(homePage.getUserNameTextBox().getCssValue("backgroud-colour"));
		System.out.println(homePage.getUserNameTextBox().getSize().getHeight());
		System.out.println(homePage.getUserNameTextBox().getSize().getWidth());
		Thread.sleep(1000);
		homePage.getUserNameTextBox().clear();
		Thread.sleep(1000);
		homePage.getUserNameTextBox().sendKeys("UserName2");
		
		homePage.setGenderRadioButton();
		System.out.println("Is Selected :" + homePage.getGenderRadioButton().isSelected());
		
		Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);
        System.out.println("WebElement is Displayed :" + homePage.getUserNameTextBox().isDisplayed());
		System.out.println("Is Selected :" + homePage.getGenderRadioButton().isSelected());
		
		homePage.setDateOfbirthInputField();
		Utility.scrollIntoView(homePage.getDateOfbirthInputField(), driver);
		homePage.getDateOfbirthInputField().click();
		
		WebElement select = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility.selectValueFromDropdown(select, "2010");
		Utility.selectDateFromDatePicker(driver, "10");
		
	    homePage.setHobbiesCheckBox();
        Utility.clickUsingJavaScript(homePage.getHobbiesCheckBox(), driver);
		
		
		
//// textbox	
//		homePage.setUserNameTextBox();
//		homePage.getUserNameTextBox().sendKeys("UserName");
//		
//// gender radio button	
//		homePage.setGenderRadioButton();
//	  //homePage.getGenderRadioButton().click();
//		Utility.clickUsingJavaScript(homePage.getGenderRadioButton(),driver);
//	 
//// date select	
//		homePage.setDateOfbirthInputField();
//	  //Utility.scrollIntoView(homePage.getDateOfbirthInputField(), driver);
//		homePage.getDateOfbirthInputField().click();
//		 
//        WebElement select = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//        Utility.selectValueFromDropdown(select, "2010");
//        Utility.selectDateFromDatePicker(driver, "10");
//        
//// select hobbies checkBox 
//        homePage.setHobbiesCheckBox();
//        Utility.clickUsingJavaScript(homePage.getHobbiesCheckBox(), driver);
//        
//// file upload
//        homePage.getFileUpload().sendKeys("C:\\Users\\vaibh\\Downloads\\TeamViewer_Setup_x64.exe");
	}

	@AfterClass
	public void termDown() {
//		driver.quit();
	}
}
