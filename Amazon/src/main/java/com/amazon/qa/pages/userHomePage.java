package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;

public class userHomePage extends TestBase {

	@FindBy(id = "searchDropdownBox")
	WebElement dropdown;

	//
	@FindBy(xpath = "//a[@id='nav-link-accountList']/span[1]")
	WebElement signIn;

	@FindBy(css = ".nav-search-label")
	WebElement selectedValue;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement search;

	@FindBy(xpath = "//img[@alt='Amazon Fashion']")
	WebElement imgDisplayed;

	@FindBy(id = "twotabsearchtextbox")
	WebElement inputdata;

	// twotabsearchtextbox
	public userHomePage() {
		PageFactory.initElements(driver, this);
	}

	public void selectDropdown(String value) {
		Select category = new Select(dropdown);
		category.selectByVisibleText(value);

	}

	public String selectedValue() {
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

}
