package com.valuemomentum.retail.TestAutomation;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;


public class Automate3 {
	
	
	
	
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishals\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Training\\Java\\TestAutomation\\lib\\msedgedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver drive=new EdgeDriver();
		driver.get("http://www.amazon.in");
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.linkText("//*[contains(@class,'a-link-normal')and contains(text(),'Shop now')]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@class,'a-icon-alt')and contains(text(),'& Up')]")).click();
		driver.findElement(By.xpath("//*[contains(@class,'a-size-base a-color-base')and contains(text(),'Oye Stuff')]")).click();
		driver.findElement(By.xpath("//*[contains(@class,'a-size-base a-color-base')and contains(text(),'Noise')]")).click();
		
		Thread.sleep(1000);
        driver.close();
        driver.quit();
        
        
        //         //*[contains(@class,'a-link-normal')and contains(text(),'Shop now')]
	}

}
