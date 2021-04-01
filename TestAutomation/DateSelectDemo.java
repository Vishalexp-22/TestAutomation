package com.valuemomentum.retail.TestAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelectDemo{

	 

    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
            
           
            WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.navigate().to("https://www.amazon.in/");
           Thread.sleep(3000);
           
/*           WebElement departureDate=driver.findElement(By.xpath("(//*[@class='_3jkx'])[1]"));
           
                   departureDate.click();
                   driver.findElement(By.name("Departure-Date")).sendKeys("12 Apr 2021");*/
                   //Javascript Executer
                   //Actions Class
                   JavascriptExecutor js=(JavascriptExecutor) driver;
                  //  WebElement departureDate=driver.findElement(By.name("Departure-Date"));
                   WebElement value=driver.findElement(By.name(""));
                    //Get return value from script
                 String text=(String) js.executeScript("return arguments[0].inner.Text", value);
                 System.out.println("Text from browser"+ text);
                   driver.close();
                   driver.quit();
                   
    }
}