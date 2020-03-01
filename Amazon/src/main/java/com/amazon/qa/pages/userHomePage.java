package com.amazon.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;

public class userHomePage extends TestBase {

	@FindBy(id = "searchDropdownBox")
	WebElement dropdown;

	@FindBy(xpath = "//div[@class='s-result-list s-search-results sg-row'][1]/div[3]")
	WebElement SelectItem;

	@FindBy(xpath = "//a[@id='nav-link-accountList']/span[1]")
	WebElement signIn;

	@FindBy(css = ".nav-search-label")
	WebElement selectedValue;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement search;

	@FindBy(xpath = "//select[@id='s-result-sort-select']")
	WebElement sortDropdown;

	@FindBy(xpath = "//img[@alt='Amazon Fashion']")
	WebElement imgDisplayed;

	@FindBy(id = "twotabsearchtextbox")
	WebElement inputdata;

	// twotabsearchtextbox
	public userHomePage() {
		PageFactory.initElements(driver, this);
	}

	public String selectSearchDropdown(String value) {

		// sortDropdown.click();
		Select category = new Select(dropdown);
		category.selectByVisibleText(value);

		return selectedValue.getText();

	}

	public void Search() {

		search.click();
	}

	public void selectDropdownByVisibletext(String visibleText) {

		Select dropDown = new Select(sortDropdown);
		dropDown.selectByVisibleText(visibleText);
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
