package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclasses.BaseTest;
import utility.ScreenShot;

public class TestNGListeners extends BaseTest implements ITestListener {

	ExtentReports extent = ExtentReportGen.extentReportGenerator();
	static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case " + result.getName() + " started");

		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case " + result.getName() + " has passed");
		test.log(Status.PASS, "Testcase passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case " + result.getName() + " has failed");

		test.fail(result.getThrowable());

		ScreenShot sc = new ScreenShot();

		try {
			String path = sc.getScreenshotWithFilename(driver, result.getName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {

			System.out.println("Exception arrived while capturing the screenshot");

			String messsage = e.getMessage();
			System.out.println(messsage);
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case " + result.getName() + " has skipped");
		
		test.log(Status.SKIP, "Test case got skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag " + context.getName() + " has started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag " + context.getName() + " has completed");
		extent.flush();
	}

}
