<<<<<<< Updated upstream
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.CommonUtil;

public class LoginPage {

	private WebDriver driver;
	CommonUtil util;
	
	private By loginPageDesc = By.xpath("//div[@class='align-center description text-center']/h1");

	public LoginPage(WebDriver driver)
	{
		this.driver =  driver;
		util = new CommonUtil(driver);
		
	}
	
	public String loginPageTitle() {
		return util.getTitle();
		
	}
	/*
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public String loginPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}


	public String loginPageMatchDescription() {
		return null;
		// TODO Auto-generated method stub
		
	}
*/

	public String loginPageGetDescription() {
		return util.getDesc(loginPageDesc);
	}
	

}
=======
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.CommonUtil;

public class LoginPage {

	private WebDriver driver;
	CommonUtil util;
	
	private By loginPageDesc = By.xpath("//div[@class='align-center description text-center']/h1");

	public LoginPage(WebDriver driver)
	{
		this.driver =  driver;
		util = new CommonUtil(driver);
		
	}
	
	public String loginPageTitle() {
		return util.getTitle();
		
	}
	/*
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public String loginPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}


	public String loginPageMatchDescription() {
		return null;
		// TODO Auto-generated method stub
		
	}
*/

	public String loginPageGetDescription() {
		return util.getDesc(loginPageDesc);
	}
	

}
>>>>>>> Stashed changes
