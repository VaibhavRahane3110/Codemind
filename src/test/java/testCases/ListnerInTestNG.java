package testCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerInTestNG implements ITestListener{

	public void onFinish(ITestContext Result) {
		
	}
	
	public void onStart(ITestContext Result) {
		System.out.println("Your Test Case Execution Started");
	}

	public void onTestFailButWithinSuccessPercentage(ITestResult Result) {
		
	}
	
	public void onTestFailure(ITestResult Result) {
		System.out.println("The Name of The testcase Failed Is :" + Result.getName());
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("The Name of The Testcase Skipped Is :" + Result.getName());
	}

	public void onTestStar(ITestResult Result) {
		System.out.println(Result.getName() + "Test Case Started");
	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("The Name of The Test Case Passed Is:" + Result.getName());
	}

}
