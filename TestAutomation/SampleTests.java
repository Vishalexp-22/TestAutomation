package com.valuemomentum.retail.TestAutomation;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;


public class SampleTests {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishals\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Training\\Java\\TestAutomation\\lib\\msedgedriver.exe");
		WebDriver driver=new  ChromeDriver();
		//WebDriver drive=new EdgeDriver();
		driver.get("http://www.amazon.in");
		System.out.println(" Current URL = "+ driver.getCurrentUrl());
        System.out.println(" Windows details "+ driver.getWindowHandle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        driver.navigate().back();
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
        //driver.findElement(By.id("dropdownLangauge")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"fr\"]")).click();
        driver.close();
        driver.quit();
	}

}
