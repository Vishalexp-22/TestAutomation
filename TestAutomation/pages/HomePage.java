package com.valuemomentum.retail.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "twotabsearchtextbox")
	private static WebElement _txtSearchBox;

	@FindBy(id = "nav-search-submit-button")
	private static WebElement _btnSearch;

	public static void enterSearchText(String text) {
		_txtSearchBox.sendKeys(text);

	}

	public static SearchResultsPage clickOnSearchButton() {
		_btnSearch.click();
		return new SearchResultsPage(driver);

	}

}