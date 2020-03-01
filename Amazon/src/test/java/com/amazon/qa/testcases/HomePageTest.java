package com.amazon.qa.testcases;

import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.utils.takeScreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;

public class HomePageTest extends TestBase {
	HomePage HomePage;
	LoginPage LoginPage;

	public HomePageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		HomePage = new HomePage();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() throws Exception {
		String title = HomePage.validateLoginPageTitle();
		/*
		 * assertsoft.assertEquals(title,
		 * "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
		 * , "Application Launched Successfully");
		 * 
		 */ takeScreenshot.takeSnapShot("C:\\Users\\CHITTI\\Desktop\\Amazon\\target\\homepage.jpeg");
	}

	@Test(priority = 2)
	public void crmLogoImageTest() {
		boolean flag = HomePage.validateCRMImage();
		Assert.assertTrue(flag);
		// assertsoft.assertEquals(flag, true, "Amazon logo displayed
		// successfully");
	}

	@Test(priority = 3)
	public void Login() {
		LoginPage = HomePage.login();
	}

	@AfterClass
	public void tearDown() {

		// assertsoft.assertAll();
		driver.close();
	}

}
