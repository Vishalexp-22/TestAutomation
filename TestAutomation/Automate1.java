package com.valuemomentum.retail.TestAutomation;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;

public class Automate1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[5]/ul/li[1]/span/a")).click();
		String currentWindow =  driver.getWindowHandle();
		System.out.println( driver.getWindowHandle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/h2/a")).click();
		Thread.sleep(2000);
		
		
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
		driver.close();
	}

}
