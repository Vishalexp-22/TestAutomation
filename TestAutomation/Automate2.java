package com.valuemomentum.retail.TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Automate2 {

	@Test
	//public static void main(String[] args) throws InterruptedException
	public void Test1() throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[5]/div/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"dealTitle\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Add to Cart")).click();
		Thread.sleep(4000);
driver.close();
	}

}
