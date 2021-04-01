package com.valuemomentum.retail.TestAutomation;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate4 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.medplusmart.com/");
		Thread.sleep(1000);
		
		
		
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
             FileUtils.copyFile(scrFile, new File("./screenshot/image.png"));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
		
		WebElement element=driver.findElement(By.xpath("//li[contains(@class,'static shopByCategory')]"));
		 Actions act=new Actions(driver);
         act.moveToElement(element).perform();
         Thread.sleep(2000);
		
         List<WebElement> element1= driver.findElements(By.xpath("//*[contains(@class,'cate-main')]"));
         System.out.println("size of list is:"+element1.size());
         
        
         System.out.println("Menu has :");
         
         for (WebElement a: element1) {
        	 String text= a.getText();
             System.out.println(a.getText());
             
            File elementFile= a.getScreenshotAs(OutputType.FILE);
             try
             {
                  FileUtils.copyFile(elementFile, new File("./screenshot/image.png"));
             }
             catch(IOException e1) {
                 e1.printStackTrace();
             }
       
         }
       
         
     
         
         driver.close();
	}

	}

