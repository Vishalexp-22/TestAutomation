package com.valuemomentum.retail.TestAutomation;

 

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



 

public class IframesDemo {

 

    //public static void main(String[] args) throws InterruptedException
	
	@Test
	public void LoginTest()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
        //calling web driver
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");
       // Thread.sleep(1000);
      
        int iframeSize=driver.findElements(By.tagName("iframe")).size();
        //Thread.sleep(1000);
        System.out.println("Total frames in wepage :"+iframeSize);
       // Thread.sleep(2000);
        driver.switchTo().frame(0);
       // Thread.sleep(2000);
        //driver.findElement(By.id("topnavbtn_tutorials")).click();
      
      driver.findElement(By.id("topnavbtn_references")).click();
     // Thread.sleep(1000);
      
     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      try {
      FileUtils.copyFile(scrFile, new File("./screenshot/image.png"));
      } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      }
      
      
      Dimension size=driver.manage().window().getSize();
     int width=size.getWidth();
     int height=size.getHeight();
     System.out.println("width is :"+width);
     System.out.println("Height is :"+height);
     
     driver.manage().window().setSize(new Dimension(1024,768));
     //Thread.sleep(1000);
    // Thread.sleep(5000);
     Point position = driver.manage().window().getPosition(); 
    
     int x1 = position.getX(); 
     int y1 = position.getY();
     System.out.println("Position in x direction :"+x1);
     System.out.println("Position in y direction :"+y1);
   //  Thread.sleep(1000);
     driver.manage().window().setPosition(new Point(10, 30));
     
   //  Thread.sleep(1000);
        driver.close();
        driver.quit();
    }

 

 

}