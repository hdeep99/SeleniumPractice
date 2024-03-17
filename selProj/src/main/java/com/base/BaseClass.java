<<<<<<< Updated upstream
package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(Properties prop) {
		String browserName = prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions op = new ChromeOptions();
			//op.addArguments("--disable-notifications");
			op.addArguments("--remote-allow-origins=*");
			driver =  new ChromeDriver(op);
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		String appName = prop.getProperty("application");
		if(appName.equalsIgnoreCase("BizBooks")) {
			driver.get(prop.getProperty("url1"));
		}
		
		return driver;
		
	}
	
	
	public Properties init_prop() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(".\\src\\test\\resources\\config\\config.properties");
			prop.load(ip);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
	
	
	
	
	
	
}
=======
package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(Properties prop) {
		String browserName = prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions op = new ChromeOptions();
			//op.addArguments("--disable-notifications");
			op.addArguments("--remote-allow-origins=*");
			driver =  new ChromeDriver(op);
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		String appName = prop.getProperty("application");
		if(appName.equalsIgnoreCase("BizBooks")) {
			driver.get(prop.getProperty("url1"));
		}
		
		return driver;
		
	}
	
	
	public Properties init_prop() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(".\\src\\test\\resources\\config\\config.properties");
			prop.load(ip);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
	
	
	
	
	
	
}
>>>>>>> Stashed changes
