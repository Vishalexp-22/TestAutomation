package com.valuemomentum.retail.TestAutomation;

 

import java.util.Iterator;
import java.util.Set;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class XpathDemo {

 

    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "");
         WebDriver driver= new ChromeDriver();
            //WebDriver driver = new EdgeDriver();
         
                driver.navigate().to("http://www.amazon.in");
                Thread.sleep(2000);
                
                   driver.findElement(By.linkText("Mobiles")).click();
                    Thread.sleep(2000);
                    
                    driver.findElement(By.linkText("Made for Amazon")).click();
                    Thread.sleep(2000);
                    driver.findElement(By.linkText("Dyazo")).click();
                    Thread.sleep(2000);
                    driver.findElement(By.linkText("Eligible for Pay On Delivery")).click();
                    Thread.sleep(2000);
                    driver.findElement(By.partialLinkText("Dyazo 4.8 Amp (2.4 & 2.4 Amp) Dual Port Fast Car Charger Compatible with iPhone XR/Xs/Max/X/8/7/Plus, Ipad Pro/Air 2/Mini, Galaxy, LG, HTC and All Other Mobile Phones with 3 in 1 Cable")).click();
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
                    Thread.sleep(4000);
               // driver.findElement(By.linkText("Fashion")).click();
              //  Thread.sleep(2000);
              //  driver.findElement(By.partialLinkText("Men's t - shirts & polos")).click();
                driver.close();
                driver.quit();

 

    }

 

}