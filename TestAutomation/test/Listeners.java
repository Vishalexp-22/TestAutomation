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

 

public class Listeners implements ITestListener{
    
    protected static ExtentReports reports;
    protected static ExtentTest test;
    protected static ExtentSparkReporter spark;

 

    @Override
    public void onTestStart(ITestResult result) {
        test=reports.createTest(result.getMethod().getMethodName());
    }

 

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
       test.log(Status.PASS,result.getMethod().getMethodName()+  "  Test Passed");
    }

 

    @Override
    public void onTestFailure(ITestResult result) {
       
   	 test.log(Status.FAIL," Test Failed");
    	 WebDriverHelper.takeScreenshot(result.getMethod().getMethodName());
    
    	test= test.addScreenCaptureFromPath("C:\\Training\\Java\\TestAutomation\\screenshot\\"+result.getMethod().getMethodName()+".png");
    	
    }

 

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
    	 test.log(Status.SKIP,result.getMethod().getMethodName()+  "  Test Skipped");
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
        // TODO Auto-generated method stub
        reports = new ExtentReports();
        spark = new ExtentSparkReporter("target/" +
        new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms").
        format(new Date())+"report.html");
    }

 

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        reports.attachReporter(spark);
        reports.flush();
    }
    
    

 

}