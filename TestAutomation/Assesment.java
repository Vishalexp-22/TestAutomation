package com.valuemomentum.retail.TestAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.valuemomentum.retail.TestAutomation.test.WebDriverHelper;

 



 

public class Assesment extends WebDriverHelper{
    
    WebDriver driver;

    int wait=5;
 

 

  
    @BeforeClass
    public void setup() {
        //Logger 
        this.driver=getDriver();
    }

 

 

   
       
       @Test(priority = 1, enabled=true)
       public void Menu() throws InterruptedException
       {
      
        
           System.out.println("Medplus Title:"+driver.getTitle());            
          
        
           WebElement menu = new WebDriverWait(driver, Duration.ofSeconds(wait))
                   .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div[1]/nav[2]/ul/li[1]/a")));
           Actions act=new Actions(driver);
             
           act.moveToElement(menu).perform();
          
    
    	   WebElement E1 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                   .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'cate-main') and contains(@title,'Personal Care')]")));
    	   System.out.println("Title: "+driver.getTitle()+"\nItem selected: " +E1.getText());
           E1.click();
           
       
       
       
     
     
    	   WebElement E2 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                   .until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Oral Care")));
            System.out.println(" Title:"+driver.getTitle()+"\nItem Selected: "+E2.getText());
             E2.click();
           
       
       
   
        
    	   WebElement E3 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                   .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"leftNav_MART_30046\"]/a")));
    	   System.out.println("Title: "+driver.getTitle()+"\nItem selected:"+E3.getText());
            E3.click();
            
            driver.findElement(By.xpath("//*[@id=\"tooltip_max\"]/div[1]")).click();
           
          
           
          WebElement slider =driver.findElement(By.xpath("//*[@id=\"PriceRange\"]/div[1]/div[1]/div[3] "));
       
            
            Actions act1=new Actions(driver);
                    act.dragAndDropBy(slider,-164, 0);
           act1.build().perform();
              
         
         
//first product
       
     
    	  WebElement product1 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                   .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[1]/div/div[2]/div[4]/div[3]/div/a/i")));
    	   product1.click();
      
             System.out.println(driver.findElement(By.xpath("//*[@id=\"PEPS0032_dropdownMenu\"]")).getText());
              
             
             WebElement E4 = new WebDriverWait(driver, Duration.ofSeconds(wait))
                     .until(ExpectedConditions.visibilityOfElementLocated(By.linkText("70 grams - Rs 55.00")));
              System.out.println( " Title: " +driver.getTitle() +"\n first product weight and price:"+E4.getText());
                 E4.click();
             
       
       
           
                
        
            WebElement E5 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[4]/div[4]/form/div[1]/div[2]/button")));
            System.out.println(" Item selected:"+E5.getText());
             E5.click();   
                     
       
       
       
       
              driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[2]/div/div[2]/div[4]/div[3]/div")).click();
          
              WebElement E6 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                      .until(ExpectedConditions.visibilityOfElementLocated(By.linkText("80 grams - Rs 50.00")));
              System.out.println("second product weight and price:"+E6.getText());
              E6.click();              
              
              

 WebElement E7 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
         .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[2]/div/div[1]/div[4]/div[4]/form/div[1]/div[2]/button")));
 System.out.println("Item selected:"+E7.getText());
 E7.click();              

 
 
    
        
             
         
            WebElement s3 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                      .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cartTableBody\"]/tr[1]/td[1]")));
                String a3=s3.getText();
           
                 WebElement s4 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                         .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"PEPS0017\"]/div[1]/a/img")));
                 String a4=s4.getText();
                 if(a3.equals(a4))
                 {
                     System.out.println("true");
                 }
                 else
                     System.out.println("false");
           
    	   
             WebElement E8 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                       .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //*[@id=\"microCartQty\"]")));
                System.out.println("No of Items added to cart:" +E8.getText());
             E8.click();
           
          
          
                 
         ;
             WebElement E9 = new WebDriverWait(driver,  Duration.ofSeconds(wait))
                      .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //*[@id=\"pharmaCheckOutBtn\"]")));
              System.out.println("Title: "+driver.getTitle()+"\nItem selected: " +E9.getText());
             E9.click();
             
            
             
            
             
               
              
         
    }

 

     /*  @AfterTest
       public void test_aftersuite() {
           System.out.println(" After Suite");
           driver.close();
           driver.quit();
       }*/

 

    
    }