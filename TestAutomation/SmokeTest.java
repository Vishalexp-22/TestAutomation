package com.valuemomentum.retail.TestAutomation;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

 

 

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

 

 

 

import com.sun.media.jfxmedia.logging.Logger;

 

 

 

@Test
public class SmokeTest {
    static WebDriver driver;
    @BeforeTest
    public void setup()
    {
 //       Logger.info("Setup method called");
  //      this.driver = getDriver();
        
    }
    public void VerifyMobilePurchase() {
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
            driver.findElement(By.id("nav-search-submit-button")).click();
            driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
            String currentWindow =  driver.getWindowHandle();
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> ite = windows.iterator();
            while(ite.hasNext()) {
                String newWindow=ite.next();
                if(!currentWindow.equals(newWindow)) {
                    driver.switchTo().window(newWindow);
                }
            }
            driver.findElement(By.id("add-to-cart-button")).click();
            
     }
}