package com.valuemomentum.retail.TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Practice1 {

	//public static void main(String[] args) throws InterruptedException 
	
	@Test
	public void Test1() throws InterruptedException
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
	        
	        
	        WebDriver driver=new ChromeDriver();
	           driver.manage().window().maximize();
	           driver.navigate().to("https://www.amazon.in");
	           System.out.println("Amazon Title:"+driver.getTitle());            
	           Thread.sleep(1000);
	           WebElement element=driver.findElement(By.xpath("//div/a[text()='Best Sellers']"));
	           
	           System.out.println("Text is :"+element.getText());
	           System.out.println("Text is :"+element.getAccessibleName());
	           System.out.println("Tag Name is :"+element.getTagName());
	           System.out.println("Attribute  is :"+element.getAttribute("data-csa-c-id"));
	           System.out.println("Dom property  is :"+element.getDomProperty("data-csa-c-id"));
	           System.out.println(("Color is : "+element.getCssValue("color")));
	           System.out.println(("Font style is : "+element.getCssValue("font-family")));
	           System.out.println(("Aria role is : "+element.getAriaRole()));
	          
	           System.out.println("DOM Attribute Value of the element "+element.getDomAttribute("data-csa-c-id"));
	           
	           Rectangle rect = driver.findElement(By.xpath("(//*[contains(text(),'Cart')])[1]")).getRect();
	           System.out.println(" height value of "+ rect.getHeight());
	           System.out.println(" Width value of "+ rect.getWidth());
	           System.out.println(" X value of "+ rect.getX());
	           System.out.println(" Y value of "+ rect.getY());
	           System.out.println(" Dimensions value of "+ rect.getDimension());
	           System.out.println(" Point value of "+ rect.getPoint());
	           
	           
	           
	           
	           driver.close();
	}

}
