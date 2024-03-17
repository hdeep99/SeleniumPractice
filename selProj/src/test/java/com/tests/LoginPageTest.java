package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.utility.Constants;

public class LoginPageTest extends BaseTest {
	
	public static String login;
	
	
	@Test(priority=1)
	public void loginPageTitleValidation() {
		String actualTitle = loginPage.loginPageTitle();
		System.out.println(actualTitle);
		
		try {
			Assert.assertEquals(actualTitle, Constants.LOGIN_PAGE_TITLE);
			System.out.println("Assertion passed: Titles match");
		}
		catch (AssertionError error){
			System.out.println("Assertion failed: Titles do not match");
			System.out.println("Error Message: "+ error.getMessage());
		}
	}
	
	//@Test(priority=2)
	public void loginPageDescriptionValidation()
	{
		String loginDescText = loginPage.loginPageGetDescription();
		System.out.println(loginDescText);
		Assert.assertEquals(loginDescText,  Constants.LOGIN_PAGE_DESCRIPTION);
	}
}
