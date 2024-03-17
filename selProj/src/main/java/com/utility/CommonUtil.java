package com.utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtil {
	
	private WebDriver driver;

	public CommonUtil(WebDriver driver) {
		this.driver = driver;
	}
	

	public By getBy(String locatorType, String locatorValue) {
		
		By locator = null;
		switch (locatorType) {
		case "id":
			locator = By.id(locatorValue);
			break;
			
		case "name":
			locator = By.name(locatorValue);
			break;
		
		case "className":
			locator = By.className(locatorValue);
			break;
			
		case "linkText":
			locator = By.linkText(locatorValue);
			break;
			
		case "partialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
			
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
			
		case "cssSelector":
			locator = By.cssSelector(locatorValue);
			break;
			
		case "tagName":
			locator = By.tagName(locatorValue);
			break;
			
		default:
			System.out.println("Please pass the correct locator " + locatorType);
			break;
			
		}
		
		return locator;
	}
	
	public WebElement getElement(String locatorType, String locatorValue) {
			return driver.findElement(getBy(locatorType, locatorValue));
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public String getTitle() {
		return driver.getTitle();
		
	}
	
	public String getDesc(By locator) {
		return driver.findElement(locator).getText();
	}

	public void doSendKeys(By locator, String value) {
		WebElement ele = driver.findElement(locator);
		ele.sendKeys(value, Keys.ENTER);		
	}
	
	public void doClick(By locator) {
		driver.findElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
	
	
	
	
	
	
	

}
