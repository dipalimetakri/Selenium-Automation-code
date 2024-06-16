package TestNGFramewok;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	public void onTestStart(ITestResult result) {

		System.out.println("Test Execution started");
	}

	public void onTestFinish(ITestResult result) {

		System.out.println("Test Execution Ended");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Execution success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failure");

	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("Test case is skipped for execution");
	}

}
