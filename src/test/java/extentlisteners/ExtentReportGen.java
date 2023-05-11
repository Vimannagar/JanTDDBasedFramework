package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utility.Test;

public class ExtentReportGen {
	static ExtentReports extent;

	public static ExtentReports extentReportGenerator() {
//		location of extent report:

		String file = System.getProperty("user.dir") + "//reports//livingzliquid"+Test.getTime()+".html";

//		Look and feel for text and theme

		ExtentHtmlReporter reporter = new ExtentHtmlReporter(file);

		reporter.config().setTheme(Theme.DARK);

		reporter.config().setReportName("7JanBatchExtentReport");

//		Specific content to be print as a part of information to report

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Executed by", "7JanBatch");

		extent.setSystemInfo("Environment", "SIT");

		extent.setSystemInfo("Browser", "Chrome");

		return extent;
	}


}
