package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	// Hard Assert
	@Test
	public void testAssertions() {
		int i = 10;
		Assert.assertEquals(i, 10);
		Assert.assertNotEquals(10, 20);                 // for negative check
		System.out.println("This is test case 1");
	}
	
	@Test
	public void testAssertions1() {
		int j = 20;
		Assert.assertTrue(j == 10);
		Assert.assertFalse(false);                      // for negative check
		System.out.println("This is test case 2");
	}
}
	// assertEquals
	// assertNotEquals
	// assertTrue
	// assertFalse    are the methods of hard assert
