package AxisBank.testNG;

//Import the required packages
import org.testng.ITestListener;
import org.testng.ITestResult;

//Implement the ITestListener interface
public class Listener implements ITestListener {

	// This method is invoked each time a test method is invoked
	public void onTestStart(ITestResult result) {
		System.out.println("Test method " + result.getName() + " started");
	}

	// This method is invoked each time a test method succeeds
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method " + result.getName() + " passed");
	}

	// This method is invoked each time a test method fails
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method " + result.getName() + " failed");
	}

	// This method is invoked each time a test method is skipped
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test method " + result.getName() + " skipped");
	}

	// This method is invoked each time a test method fails but is within success
	// percentage
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Not implemented
	}
}
