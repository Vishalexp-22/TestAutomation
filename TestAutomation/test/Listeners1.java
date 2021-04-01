package com.valuemomentum.retail.TestAutomation.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listeners1 implements ITestListener{
	protected static ExtentReports report;
	protected static ExtentTest test;
	protected ExtentSparkReporter spark;

	@Override
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+"Test is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//WebDriverHelper.ScreenShot(result.getMethod().getMethodName());
		WebDriverHelper1.ScreenShot(result.getMethod().getMethodName());
		test.addScreenCaptureFromPath("C:\\training\\java\\testautomation\\ScreenShot\\"+result.getMethod().getMethodName()+".png");
		
		test.log(Status.FAIL, result.getMethod().getMethodName()+"Test is Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+"Test is Skiped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		report =new ExtentReports();
		spark = new ExtentSparkReporter("target/"+new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss-ms").format(new Date())+"_Report.html");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.attachReporter(spark);
		report.flush();
	}

}