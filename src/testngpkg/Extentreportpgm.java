package testngpkg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportpgm {
	ChromeDriver driver;
	String url="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void setup()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automation Report FB");
		reporter.config().setReportName("Functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("host name", "localhost");
		extent.setSystemInfo("os", "windows 11");
		extent.setSystemInfo("testername", "Anitha Sasi");
		extent.setSystemInfo("Browsername", "chrome");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void loading()
	{
		driver.get(url);
	}
	@Test
	public void titleverification()
	{
		test=extent.createTest("Facebook title verification");
		String exp="Facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, exp);
	}
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is "+result.getName());
			test.log(Status.FAIL, "test case failed is "+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is "+result.getName());
		}
	}

}
