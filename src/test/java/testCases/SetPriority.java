package testCases;

import org.testng.annotations.Test;

public class SetPriority {

	@Test(priority = 1)
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority = 0, enabled = false )
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority = 2)
	public void test3() {
		System.out.println("Test3");
	}
}
