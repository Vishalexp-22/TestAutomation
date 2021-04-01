package com.valuemomentum.retail.TestAutomation;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 

public class Automate5{

 

    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
            
           
            WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.navigate().to("https://www.amazon.in");
           Thread.sleep(3000);
           
           WebElement menuitem=driver.findElement(By.id("nav-hamburger-menu"));
           
           Actions act=new Actions(driver);
             act.moveToElement(menuitem).perform();
             Thread.sleep(2000);
           menuitem.click();
           File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try
            {
                 FileUtils.copyFile(scrFile, new File("./screenshot/image.png"));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
           Thread.sleep(3000);
           WebElement items=driver.findElement(By.xpath("//*[contains(@class,  'hmenu hmenu-visible')]"));
         //  System.out.println(menuitem.getSize());
           List<WebElement> value=items.findElements(By.tagName("a"));
           for(WebElement a : value) {
        	   String text= a.getText();
           System.out.println("Element are :"+a.getText());
           File elementFile= a.getScreenshotAs(OutputType.FILE);
           try
           {
                FileUtils.copyFile(elementFile, new File("./screenshot/image"+text+".png"));
           }
           catch(IOException e) {
               e.printStackTrace();
           }
           }
           
           driver.close();
           driver.quit();
           }

 

    }