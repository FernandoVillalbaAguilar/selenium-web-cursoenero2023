package com.ActividadSelenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStore {
	private WebDriver driver;

	public BaseStore(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver chromeDriverConection() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		return driver;
	}
	
	public void launchBrowser(String url) {
		try {
			reporterLog("Launching... " + url);
			driver.get(url);
			driver.manage().window().maximize();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	public void reporterLog(String log) {
		Reporter.log(log);
	}

	public void waitForElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, GlobalVariablesData.DEFAULT_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void click(By locator) {
		try {
			waitForElementPresent(locator);
			// Method screenshot
			driver.findElement(locator).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
}
