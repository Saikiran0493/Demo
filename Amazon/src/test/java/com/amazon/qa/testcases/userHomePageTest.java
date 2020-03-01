package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.userHomePage;
import com.amazon.utils.takeScreenshot;

public class userHomePageTest extends TestBase {
	LoginPage Login;
	HomePage HomePage;
	userHomePage userHomePage;

	public userHomePageTest() {
		// TODO Auto-generated constructor stub
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		HomePage = new HomePage();
		HomePage.login();
		Login = new LoginPage();

		try {
			Login.login(prop.getProperty("username"), prop.getProperty("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userHomePage = new userHomePage();
	}

	@Test(priority = 5)
	public void validLogin() throws Exception {

		Assert.assertEquals(false, userHomePage.SignIn());
		// takeScreenshot.takeSnapShot("C:\\Users\\CHITTI\\Desktop\\Amazon\\target\\loginsuccessfull.jpeg");

	}

	@Test(priority = 6, enabled = false)
	public void selectSearchDropDown() {

		Assert.assertEquals(userHomePage.selectSearchDropdown("Amazon Fashion"), "Amazon Fashion");

	}

	@Test(priority = 7, enabled = false)
	public void imgDisplayed() {

		userHomePage.Search();

		Assert.assertEquals(userHomePage.Displayed(), true);
	}

	@Test(priority = 8)
	public void SearchItems() {

		userHomePage.typeData("Mens Clothes");
		userHomePage.Search();
		userHomePage.selectDropdownByVisibletext("Price: Low to High");

	}

	@Test(priority = 9)
	public void addItemToCart() {
		userHomePage.selectItem();
		

	}

	@AfterClass
	public void tearDown() {

		// assertsoft.assertAll();
		//driver.quit();
	}
}
