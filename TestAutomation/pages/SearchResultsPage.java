package com.valuemomentum.retail.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.valuemomentum.retail.TestAutomation.test.WebDriverHelper1;

public class SearchResultsPage extends BasePage {

	public SearchResultsPage(WebDriver driver) {
		super(driver);

	}

	// element
	@FindBy(xpath = "//*[text()='New Apple iPhone 12 Pro Max (128GB) - Pacific Blue']")
	private static WebElement _lblItem;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")
	private static WebElement _lbltext;

	public static ProductDetailPage clickOnItem() {
	//	_lblItem.click();
		_lbltext.click();
		WebDriverHelper1.switchToWindow();
		return new ProductDetailPage(driver);

	}
	
	public static String  getItemText() {
		return _lbltext.getText();
	}

}
