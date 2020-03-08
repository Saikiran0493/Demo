package com.amazon.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

import com.amazon.base.TestBase;

public class userHomePage extends TestBase {

	@FindBy(id = "searchDropdownBox")
	public WebElement dropdown;

	@FindBy(xpath = "//img[@alt='EYEBOGLER Regular Fit Cotton T Shirts for Men Full Sleeve']")
	public WebElement SelectItem;

	@FindBy(xpath = "//a[@id='nav-link-accountList']/span[1]")
	public WebElement signIn;

	@FindBy(css = ".nav-search-label")
	public WebElement selectedValue;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement search;

	@FindBy(xpath = "//select[@id='s-result-sort-select']")
	public WebElement sortDropdown;

	@FindBy(xpath = "//img[@alt='Amazon Fashion']")
	public WebElement imgDisplayed;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement inputdata;

	public userHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String selectDropdownByVisibletext(WebElement element, String value) {

		Select category = new Select(element);
		category.selectByVisibleText(value);
		return selectedValue.getText();

	}

	public void Search() {

		search.click();
	}

	public boolean Displayed() {

		return imgDisplayed.isDisplayed();

	}

	public boolean SignIn() {
		return signIn.getText().contains("Hello. Sign in");

	}

	public void typeData(String data) {

		inputdata.sendKeys(data);

	}

	public void selectItem() {
		

		SelectItem.click();

	}

}
