package testCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testCases.ListnerInTestNG.class)
public class ListnerUsage {

	@Test
	public void test() {
		
	}
}
