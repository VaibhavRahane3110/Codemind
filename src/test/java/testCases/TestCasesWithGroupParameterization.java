package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCasesWithGroupParameterization {

	@Test (groups = {"Sanity","Smoke"})
	@Parameters ({"USER","PASSWORD"})
	public void test1(String user1, String password1) {
		System.out.println(user1+" "+password1);
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


