package com.valuemomentum.retail.TestAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class KotakWaitsDemo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
	        
	        
	        WebDriver driver=new ChromeDriver();
	           driver.manage().window().maximize();
	           driver.navigate().to("https://netbanking.kotak.com/knb2/");
	           System.out.println("Active Element is: "+driver.switchTo().activeElement().getTagName());
	           System.out.println("Accessible element is: "+driver.switchTo().activeElement().getAccessibleName());
	           
	           Thread.sleep(1000);
	           
	           WebElement e1=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
	           WebElement e2=driver.findElement(By.xpath("//input[contains(@id,'userName')]"));
	           
	          
	      
	         //check button
	         
	           System.out.println("Before Entering the value: "+e1.isDisplayed());
	           System.out.println("Before Entering the value: "+e1.isEnabled());
	           System.out.println("Before Entering the value: "+e1.isSelected());
	           
	          WebElement Result = new WebDriverWait(driver, Duration.ofSeconds(10))
		                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'userName')]")));
	           
		          Result.sendKeys("45667");
	           
		          System.out.println("After Entering the value: "+e1.isDisplayed());
		           System.out.println("After Entering the value: "+e1.isEnabled());
		           System.out.println("After Entering the value: "+e1.isSelected());

		           WebElement next = new WebDriverWait(driver, Duration.ofSeconds(10))
			                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@type,'submit')]")));

		          //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		           
		           
		           next.click();
		           
		           WebElement mobile = new WebDriverWait(driver, Duration.ofSeconds(10))
			                .until(ExpectedConditions.visibilityOfElementLocated(By.id("mobileNo")));
		           
		           mobile.sendKeys("8775643455");
		           
		     
		          
		           //fluent wait
		           
		        /*   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)               
		                   .withTimeout(Duration.ofSeconds(5))
		                   .pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		           WebElement next1 = wait.until(new Function<WebDriver, WebElement>() {
		               public WebElement apply(WebDriver driver) {
		                   return driver.findElement(By.xpath("//*[@type='submit']"));
		               }
		           });
		           next1.click();
		           
		           */
	         
	           
	           driver.close();
	           
	           

	}

}
