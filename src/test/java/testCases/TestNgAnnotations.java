package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

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
		System.out.println("Before Method");
	}
	
	@Test
	public void annotation1() {
		System.out.println("VAIBHAV NANASAHEB RAHANE");
	}
	
	@Test
	public void annotation2() {
		System.out.println("vaibhav nanasaheb rahane");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
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
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	
	//Wxscdrthnujo,kmnbgfd4ed5rtfyhuik
	
	// Sangamner
	// amrutvahini
	
}
