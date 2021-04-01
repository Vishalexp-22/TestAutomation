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
public class MultipleElements {

 

    public static void main(String[] args)throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.in");
        Thread.sleep(5000);
        List<WebElement> menuItem= driver.findElements(By.xpath("//*[@id='nav-xshop']/a"));
        System.out.println("size of elements" +menuItem.size());
        
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
             FileUtils.copyFile(scrFile, new File("./Screenshot/image.png"));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    
        for(WebElement value : menuItem)
        {
            String text= value.getText();
            System.out.println("menu  value " +value.getText());
            File elementFile= value.getScreenshotAs(OutputType.FILE);
            try
            {
                 FileUtils.copyFile(elementFile, new File("./Screenshot/image_"+text+".png"));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
         driver.close();
            driver.quit();
    }

 

}