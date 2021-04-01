package com.valuemomentum.retail.TestAutomation.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebDriverHelper {
 static WebDriver driver;
	 @BeforeTest
	   public void test_beforesuite() {
	       System.out.println(" Before Suite");
	       System.setProperty("webdriver.chrome.driver",
	               "C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://netbanking.kotak.com/knb2/");
	      // driver.navigate().to("https://www.medplusmart.com/");
	   }
	 
	 
	 public static void takeScreenshot(String methodName) {
		   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   try
		   {
		        FileUtils.copyFile(scrFile, new File("./screenshot/"+methodName+".png"));
		   }
		   catch(IOException e) {
		       e.printStackTrace();
		   }
		}
	 
	 

	 public WebDriver getDriver() {
		 return driver;
	 }



	   public static void setDriver(WebDriver driver) {
		WebDriverHelper.driver = driver;
	}

	@AfterTest
	   public void test_aftersuite() {
	       System.out.println(" After Suite");
	       driver.close();
	       driver.quit();
	   }
}
