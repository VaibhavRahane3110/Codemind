package testCases;

import org.testng.annotations.Test;

public class TestCasesGroup {

	@Test (groups = {"Sanity","Smoke"})
	public void test1() {
		System.out.println("Sanity, Smoke");
	}
	
	@Test (groups = {"Sanity"})
	public void test2() {
		System.out.println("Sanity");
	}
	
	@Test (groups = {"Smoke"})
	public void test3() {
		System.out.println("Smoke");
	}
	
	@Test (groups = {"Smoke"})
	public void test4() {
		System.out.println("Smoke");
	}
}
