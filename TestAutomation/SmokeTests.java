package com.valuemomentum.retail.TestAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valuemomentum.retail.TestAutomation.pages.HomePage;
import com.valuemomentum.retail.TestAutomation.pages.ProductDetailPage;
import com.valuemomentum.retail.TestAutomation.pages.SearchResultsPage;
import com.valuemomentum.retail.TestAutomation.test.BaseTest;


public class SmokeTests extends BaseTest{
	
	WebDriver driver;
	HomePage homePage;
	ProductDetailPage productDetailsPage;
	SearchResultsPage searchResultPage;
	
	@BeforeClass
	public void setup() {
		this.driver = getDriver();
		homePage=new HomePage(driver);
	}

	@Test
	public void verifyMobilePurchase() throws InterruptedException {
		homePage.enterSearchText("playstation");
		Thread.sleep(2000);
		searchResultPage=HomePage.clickOnSearchButton();
		
		//Assertions use
		String extractedText=searchResultPage.getItemText();
		Assert.assertEquals(extractedText, "PS4 1TB Slim Bundled with Spider-Man, GTaSport, Ratchet & Clank And PSN 3Month");
		productDetailsPage=SearchResultsPage.clickOnItem();
		Thread.sleep(2000);
		productDetailsPage.clickOnAddToCart();
		Thread.sleep(5000);
		
	}
}

