package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(id = "nav-link-accountList")
	WebElement loginBtn;

	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	@FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
	WebElement crmLogo;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}

	public LoginPage login() {

		loginBtn.click();
		return new LoginPage();
	}

}
