package com.valuemomentum.retail.TestAutomation;

 

import java.util.List;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class FindElementOfElement{

 

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
            
           
            WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.navigate().to("https://www.amazon.in");
           Thread.sleep(3000);
           WebElement menuitem=driver.findElement(By.id("nav-xshop"));
List<WebElement> value=menuitem.findElements(By.tagName("a"));
for(WebElement a : value) {
System.out.println("Get the value of element"+a.getText());
}
           driver.close();
           driver.quit();

 

    }

 

}