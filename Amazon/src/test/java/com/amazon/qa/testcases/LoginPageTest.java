package com.amazon.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.amazon.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage Login;
	HomePage HomePage;

	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		Login = new LoginPage();
		HomePage = new HomePage();
		HomePage.login();
	}

	@Test(priority = 4)
	public void loginTest() {
		try {
			Login.login(prop.getProperty("username"), prop.getProperty("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterClass
	public void tearDown() {

		//assertsoft.assertAll();
		driver.quit();
	}

}
