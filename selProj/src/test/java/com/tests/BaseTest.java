<<<<<<< Updated upstream
package com.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.ClientsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProjectsPage;
import com.pages.SowsPage;

public class BaseTest {
	
	WebDriver driver;
	Properties prop;
	BaseClass bc;
	LoginPage loginPage;
	HomePage homePage;
	ClientsPage clientsPage;
	ProjectsPage projectsPage;
	SowsPage sowsPage;
	
	
	@Parameters({"app"})
	@BeforeTest
	public void setUp(String value) {
		bc = new BaseClass();
		prop = bc.init_prop();
		if(value!=null) {
			prop.setProperty("app", value);
			System.out.println("value is: "+ value);
		}
		driver = bc.init_driver(prop);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		clientsPage = new ClientsPage(driver);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
=======
package com.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.ClientsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProjectsPage;
import com.pages.SowsPage;

public class BaseTest {
	
	WebDriver driver;
	Properties prop;
	BaseClass bc;
	LoginPage loginPage;
	HomePage homePage;
	ClientsPage clientsPage;
	ProjectsPage projectsPage;
	SowsPage sowsPage;
	
	
	@Parameters({"app"})
	@BeforeTest
	public void setUp(String value) {
		bc = new BaseClass();
		prop = bc.init_prop();
		if(value!=null) {
			prop.setProperty("app", value);
			System.out.println("value is: "+ value);
		}
		driver = bc.init_driver(prop);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		clientsPage = new ClientsPage(driver);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
>>>>>>> Stashed changes
