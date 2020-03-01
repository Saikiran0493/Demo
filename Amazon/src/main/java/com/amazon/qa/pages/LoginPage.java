package com.amazon.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazon.base.TestBase;
import com.amazon.utils.takeScreenshot;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[contains(@class,'alert')]")
	WebElement alert;

	@FindBy(xpath = "//span[@class='a-list-item']")
	WebElement alertText;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public userHomePage login(String name, String pwd) throws Exception {
		// TODO Auto-generated method stub
		username.sendKeys(name + Keys.ENTER);
		password.sendKeys(pwd + Keys.ENTER);

		takeScreenshot.takeSnapShot("C:\\Users\\CHITTI\\Desktop\\Amazon\\target\\userpwdEntered.jpeg");

		return new userHomePage();

	}

}
